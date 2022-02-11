package admin.sop_rmi;

import mvcf.AModel;

/**
 *
 * @author yerso
 */
public class GestionNotificacion extends AModel {
    private INotificacion notificacion;

    public INotificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(INotificacion notificacion) {
        this.notificacion = notificacion;
    }
}
