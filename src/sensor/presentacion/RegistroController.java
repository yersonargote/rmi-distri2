package sensor.presentacion;

import sensor.sop_rmi.GestionTemperatura;
import sensor.utilidades.Parse;
import sensor.utilidades.RegistroC;
import java.awt.event.ActionEvent;

import mvcf.AActionController;
import mvcf.AModel;
import mvcf.AView;
import servidor.sop_rmi.ITemperatura;

/**
 *
 * @author yerso
 */
public class RegistroController extends AActionController {

    private GestionTemperatura gestor;
    private final GUIRegistro vista;

    public RegistroController(AModel myModel, AView myView) {
        super(myModel, myView);
        this.gestor = (GestionTemperatura) myModel;
        this.vista = (GUIRegistro) myView;
    }

    @Override
    public void actualizar(ActionEvent arg0) {
        switch (arg0.getActionCommand()) {
            case "registrar":
                String ip = this.vista.getTxtIp().getText();
                int puerto = Parse.StringToInt(this.vista.getTxtPuerto().getText());
                this.gestor.setGestorTemperatura((ITemperatura) RegistroC.getRemoteObj(ip, puerto, "sensor"));
                boolean registrado = (this.gestor.getGestorTemperatura() != null);
                if (registrado) {
                    GUITemperatura guiTemperatura = new GUITemperatura();
                    TemperaturaController temperaturaController = new TemperaturaController(this.gestor, guiTemperatura);

                    this.vista.setVisible(false);
                    guiTemperatura.setVisible(true);

                    guiTemperatura.getBtnEnviarTemperatura().addActionListener(temperaturaController);
                    guiTemperatura.getBtnEnviarTemperatura().setActionCommand("enviar");
                } else {
                    this.vista.getLblMensajeErrorLogin().setText("Problema al registrar el objeto remoto del cliente.");
                }
                break;
        }
    }
}
