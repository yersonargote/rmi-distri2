package servidor.sop_rmi;

import admin.sop_rmi.INotificacion;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import servidor.dto.RangoDTO;

/**
 *
 * @author yerso
 */
public class Temperatura extends UnicastRemoteObject implements ITemperatura {

    private List<INotificacion> admins;
    private RangoDTO rango;

    public Temperatura() throws RemoteException {
        super();

        this.admins = new ArrayList<>();
        this.rango = new RangoDTO(12, 30);
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
                                "Notificacion\nEn el sensor se identifico una lectura fuera de rango, con un valor de",
                                temperatura, this.rango.getMenor(), this.rango.getMayor()
                        );
                admin.notificar(str);
            }
        }
        return true;
    }

}
