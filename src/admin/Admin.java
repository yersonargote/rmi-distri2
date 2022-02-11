package admin;

import admin.presentacion.GUIRegistro;
import admin.presentacion.RegistroController;
import admin.sop_rmi.GestionNotificacion;

/**
 *
 * @author yerso
 */
public class Admin {
    public static void main(String[] args) {
        // Modelo para gestion de tempertura.
        GestionNotificacion gestionNotificacion = new GestionNotificacion();
        
        // Vista. GUI registro para ip y puerto.
        GUIRegistro guiRegistro = new GUIRegistro();
        gestionNotificacion.addView(guiRegistro);
        // Controller
        RegistroController registroControl = new RegistroController(gestionNotificacion, guiRegistro);
        guiRegistro.setVisible(true);

        // Enlaza el action controller de los botones al controlador y fija el comando de acción
        guiRegistro.getBtnRegistro().addActionListener(registroControl);
        guiRegistro.getBtnRegistro().setActionCommand("registrar");
    }
}
