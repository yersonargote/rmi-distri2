package servidor.sop_rmi;

import admin.sop_rmi.INotificacion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import servidor.dto.RangoDTO;
import servidor.dto.TemperaturaFueraRangoDTO;
import servidor.utilidades.Utilidades;

/**
 *
 * @author yerso
 */
public class Temperatura extends UnicastRemoteObject implements ITemperatura {

    private List<INotificacion> admins;
    private RangoDTO rango;
    private List<TemperaturaFueraRangoDTO> fueraRango;
    private final double MIN = 10;
    private final double MAX = 25;

    public Temperatura() throws RemoteException {
        super();

        this.admins = new ArrayList<>();
        this.fueraRango = new ArrayList<>();
        this.rango = leerRangoTemperatura();
    }

    private RangoDTO leerRangoTemperatura() {
        System.out.println("Lectura del rango de la temperatura.");
        String path = String.format("%s\\src\\servidor\\utilidades\\rango.txt", System.getProperty("user.dir"));
        File file = new File(path);
        BufferedReader br = null;
        RangoDTO rangoDto = null;
        try {
            br = new BufferedReader(new FileReader(file));

            String line = br.readLine();
            System.out.println(String.format("rango.txt: %s%n", line));

            String[] rangos = line.split(",");

            if (rangos.length == 2) {
                Double min = Double.parseDouble(rangos[0]);
                Double max = Double.parseDouble(rangos[1]);
                rangoDto = new RangoDTO(min, max);
            }
            if (rangoDto == null) {
                rangoDto = new RangoDTO(this.MIN, this.MAX);
            }
        } catch (IOException ex) {
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
            }
        }
        return rangoDto;
    }

    @Override
    public boolean registrarAdmin(INotificacion admin) throws RemoteException {
        this.admins.add(admin);
        return true;
    }

    @Override
    public boolean enviarTemperatura(double temperatura) throws RemoteException {
        System.out.printf("Enviando temperatura : %.2f%n", temperatura);
        for (INotificacion admin : this.admins) {
            if (temperatura < this.rango.getMenor() || temperatura > this.rango.getMayor()) {
                String str
                        = String.format("%s %.2f grados.\nEl rango normal acutal es de %.2f a %.2f grados.\n",
                                "Notificacion\nEn el sensor se identifico una lectura fuera de rango con un valor de",
                                temperatura, this.rango.getMenor(), this.rango.getMayor()
                        );
                this.fueraRango.add(new TemperaturaFueraRangoDTO(temperatura, LocalDateTime.now()));
                admin.notificar(str);
            }
        }
        return true;
    }

    @Override
    public int consultarTemperaturasFueraRango() throws RemoteException {
        int cantidad = 0;
        LocalDateTime now = LocalDateTime.now();
        
        for(TemperaturaFueraRangoDTO temp : this.fueraRango) {
            Long seconds = Utilidades.SecondsBetween(temp.getDateTime(), now);
            if (seconds < 60) {
                cantidad += 1;
            }
        }
        return cantidad;
    }

}
