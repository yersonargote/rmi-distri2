package admin.sop_rmi;

import mvcf.AModel;
import servidor.sop_rmi.ITemperatura;

/**
 *
 * @author yerso
 */
public class GestionAdministrador extends AModel {
    private ITemperatura temperatura;

    public ITemperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(ITemperatura temperatura) {
        this.temperatura = temperatura;
    }

}
