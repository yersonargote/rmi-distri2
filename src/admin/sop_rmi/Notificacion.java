package admin.sop_rmi;

import admin.presentacion.GUIAdmin;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author yerso
 */
public class Notificacion extends UnicastRemoteObject implements INotificacion {
    
    private GUIAdmin gUIAdmin;
    private List<String> notificaciones;
    
    public Notificacion(GUIAdmin gui) throws RemoteException {
        super();
        this.gUIAdmin = gui;
        this.notificaciones = new ArrayList<>();
    }

    @Override
    public boolean notificar(String notificacion) throws RemoteException {
        System.out.println("Enviando notificacion.");
        this.notificaciones.add(notificacion);
        String str = this.notificaciones.stream().collect(Collectors.joining("\n"));
        this.gUIAdmin.getTxtaNotificaciones().setText(str);
        return true;
    }
    
}
