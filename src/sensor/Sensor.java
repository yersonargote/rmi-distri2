package sensor;

import sensor.presentacion.GUIRegistro;
import sensor.presentacion.RegistroController;
import sensor.sop_rmi.GestionTemperatura;

/**
 *
 * @author yerso
 */
public class Sensor {
   
    public static void main(String[] args) {
        // Modelo para gestion de tempertura.
        GestionTemperatura gestionTemperatura = new GestionTemperatura();
        
        // GUI registro para ip y puerto.
        GUIRegistro guiRegistro = new GUIRegistro();
        gestionTemperatura.addView(guiRegistro);
        RegistroController registroControl = new RegistroController(gestionTemperatura, guiRegistro);
        guiRegistro.setVisible(true);

        // Enlaza el action controller de los botones al controlador y fija el comando de acción
        guiRegistro.getBtnRegistro().addActionListener(registroControl);
        guiRegistro.getBtnRegistro().setActionCommand("registrar");
    }
}
