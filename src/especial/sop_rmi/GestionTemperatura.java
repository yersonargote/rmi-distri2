package especial.sop_rmi;

import mvcf.AModel;
import servidor.sop_rmi.ITemperatura;

/**
 *
 * @author yerso
 */
public class GestionTemperatura extends AModel {
    private ITemperatura gestor;
    
    public ITemperatura getGestorTemperatura() {
        return this.gestor;
    }

    public void setGestorTemperatura(ITemperatura gestor) {
        this.gestor = gestor;
    }
}
