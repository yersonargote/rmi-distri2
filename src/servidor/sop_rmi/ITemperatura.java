package servidor.sop_rmi;

import admin.sop_rmi.INotificacion;

/**
 *
 * @author yerso
 */

public interface ITemperatura extends java.rmi.Remote {
    public boolean registrarAdmin(INotificacion admin) throws java.rmi.RemoteException;
    public boolean enviarTemperatura(double temperatura) throws java.rmi.RemoteException;
}
