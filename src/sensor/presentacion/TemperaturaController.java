package sensor.presentacion;

import java.awt.event.ActionEvent;
import java.rmi.RemoteException;
import mvcf.AActionController;
import mvcf.AModel;
import mvcf.AView;
import sensor.sop_rmi.GestionTemperatura;

/**
 *
 * @author yerso
 */
public class TemperaturaController extends AActionController {
    private GestionTemperatura gestor;
    private final GUITemperatura vista;

    public TemperaturaController(AModel myModel, AView myView) {
        super(myModel, myView);
        this.gestor = (GestionTemperatura) myModel;
        this.vista = (GUITemperatura) myView;
    }

    @Override
    public void actualizar(ActionEvent arg0) {
        switch (arg0.getActionCommand()) {
            case "enviar":
                enviarTemperatura();
                break;
        }
    }

    private void enviarTemperatura() {
        boolean enviado = false;
        double temperatura = -1;
        
        temperatura = Double.parseDouble(this.vista.getTxtTemperatura().getText());
        try {
            enviado = this.gestor.getGestorTemperatura().enviarTemperatura(temperatura);
        } catch (RemoteException ex) {
            this.vista.getLblMensajeErrorTemperatura().setText("Error: No se pudo enviar la temperatura.\n" + ex.getMessage());
        }
        
        if (enviado) {
            this.vista.getLblMensajeErrorTemperatura().setText("Información: Se ha enviado la temperatura.");
        } else {
            this.vista.getLblMensajeErrorTemperatura().setText("Error: No se pudo enviar la temperatura.");
        }
    }
}
