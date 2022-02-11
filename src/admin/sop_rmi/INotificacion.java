package admin.sop_rmi;

/**
 *
 * @author yerso
 */
public interface INotificacion extends java.rmi.Remote{
    public boolean notificar(String notificacion) throws java.rmi.RemoteException;
}
