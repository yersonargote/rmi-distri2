package admin.presentacion;

import admin.sop_rmi.*;
import admin.utilidades.RegistroC;

import java.awt.event.ActionEvent;

import mvcf.AActionController;
import mvcf.AModel;
import mvcf.AView;
import sensor.utilidades.Parse;
import servidor.sop_rmi.ITemperatura;
import servidor.utilidades.RegistroS;

/**
 *
 * @author yerso
 */
public class RegistroController extends AActionController {

    private GestionNotificacion gestor;
    private final GUIRegistro vista;

    public RegistroController(AModel myModel, AView myView) {
        super(myModel, myView);
        this.gestor = (GestionNotificacion) myModel;
        this.vista = (GUIRegistro) myView;
    }

    @Override
    public void actualizar(ActionEvent arg0) {
        switch (arg0.getActionCommand()) {
            case "registrar":
                String ip = this.vista.getTxtIp().getText();
                int puerto = Parse.StringToInt(this.vista.getTxtPuerto().getText());
                boolean registrado = false;

                GUIAdmin gUIAdmin = new GUIAdmin();

                try {
                    INotificacion notificacion = new Notificacion(gUIAdmin);
                    //RegistroS.arrancarNS(puerto);
                    RegistroS.RegistrarObjetoRemoto(notificacion, ip, puerto, "notificacion");
                    ITemperatura temperatura = (ITemperatura) RegistroC.getRemoteObj(ip, puerto, "sensor");
                    temperatura.registrarAdmin(notificacion);
                    registrado = true;
                } catch (java.rmi.RemoteException e) {
                    System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" + e.getMessage());
                }

                if (registrado) {
                    this.vista.setVisible(false);
                    gUIAdmin.setVisible(true);
                } else {
                    this.vista.getLblMensajeErrorLogin().setText("Problema al registrar el objeto remoto del cliente.");
                }
                break;
        }
    }
}
