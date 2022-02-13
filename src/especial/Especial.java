package especial;

import especial.sop_rmi.GestionTemperatura;
import especial.presentacion.*;

/**
 *
 * @author yerso
 */
public class Especial {
    public static void main(String[] args) {
        GestionTemperatura gestionTemperatura = new GestionTemperatura();
        
        GUIRegistro guiRegistro = new GUIRegistro();
        gestionTemperatura.addView(guiRegistro);
        
        RegistroController registroController = new RegistroController(gestionTemperatura, guiRegistro);
        guiRegistro.setVisible(true);

        // Enlaza el action controller de los botones al controlador y fija el comando de acción
        guiRegistro.getBtnRegistro().addActionListener(registroController);
        guiRegistro.getBtnRegistro().setActionCommand("registrar");
    }
}
