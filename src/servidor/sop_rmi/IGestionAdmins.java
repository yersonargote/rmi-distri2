package servidor.sop_rmi;

import servidor.dto.CredencialDTO;

/**
 *
 * @author yerso
 */
public interface IGestionAdmins extends java.rmi.Remote {
    public boolean registrarAdmin(CredencialDTO credencialDTO) throws java.rmi.RemoteException;
    public boolean iniciarSesion(CredencialDTO credencialesDTO) throws java.rmi.RemoteException;
}
