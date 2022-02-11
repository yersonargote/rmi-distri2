package servidor;

import java.rmi.RemoteException;
import servidor.sop_rmi.ITemperatura;
import servidor.sop_rmi.Temperatura;
import servidor.utilidades.Consola;
import servidor.utilidades.RegistroS;

/**
 *
 * @author yerso
 */
public class Servidor {
    public static void main(String[] args) {
    int puerto;
        String ip, puerto_str;

        if (args.length == 2) {
            puerto = Integer.parseInt(args[0]);
            ip = args[1];
        } else {
            do {
                System.out.println("Servidor gestion.\nIngrese la direccion IP del rmiregistry.");
                ip = Consola.readLine();
                System.out.println("Ingrese el puerto del rmiregistry.");
                puerto_str = Consola.readLine();
            } while (ip.isEmpty() || !puerto_str.matches("[0-9]+"));
            puerto = Integer.parseInt(puerto_str);
        }

        try {
            ITemperatura gestionUsuarios = new Temperatura();
            RegistroS.arrancarNS(puerto);
            RegistroS.RegistrarObjetoRemoto(gestionUsuarios, ip, puerto, "sensor");
        } catch (RemoteException e) {
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" + e.getMessage());
        }
    }
}
