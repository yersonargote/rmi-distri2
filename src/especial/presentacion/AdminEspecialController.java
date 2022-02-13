package especial.presentacion;

import especial.sop_rmi.GestionTemperatura;
import java.awt.event.ActionEvent;
import java.rmi.RemoteException;
import mvcf.AActionController;
import mvcf.AModel;
import mvcf.AView;

/**
 *
 * @author yerso
 */
public class AdminEspecialController extends AActionController {
    private GestionTemperatura gestor;
    private final GUIAdminEspecial vista;

    public AdminEspecialController(AModel myModel, AView myView) {
        super(myModel, myView);
        this.gestor = (GestionTemperatura) myModel;
        this.vista = (GUIAdminEspecial) myView;
    }

    @Override
    public void actualizar(ActionEvent arg0) {
        switch (arg0.getActionCommand()) {
            case "consultar":
                consultarCantidad();
                break;
        }
    }

    private void consultarCantidad() {
        int cantidad = 0;
        try {
            cantidad = this.gestor.getGestorTemperatura().consultarTemperaturasFueraRango();
        } catch (RemoteException ex) {
            this.vista.getLblCantidadRes().setText("Error: No se puede conectar a la función del objeto remoto.\n" + ex.getMessage());
        }
        this.vista.getLblCantidadRes().setText(String.valueOf(cantidad));
    }
}
