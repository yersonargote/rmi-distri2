package especial.presentacion;

import especial.sop_rmi.GestionTemperatura;
import especial.utilidades.Parse;
import especial.utilidades.RegistroC;


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
                this.gestor.setGestorTemperatura((ITemperatura) RegistroC.getRemoteObj(ip, puerto, "servidor"));
                boolean registrado = (this.gestor.getGestorTemperatura() != null);
                if (registrado) {
                    GUIAdminEspecial gUIAdminEspecial = new GUIAdminEspecial();
                    AdminEspecialController adminEspecialController = new AdminEspecialController(this.gestor, gUIAdminEspecial);
                    
                    this.vista.setVisible(false);
                    gUIAdminEspecial.setVisible(true);
                    
                    gUIAdminEspecial.getBtnConsultar().addActionListener(adminEspecialController);
                    gUIAdminEspecial.getBtnConsultar().setActionCommand("consultar");
                } else {
                    this.vista.getLblMensajeErrorLogin().setText("Problema al registrar el objeto remoto del cliente.");
                }
                break;
        }
    }
}
