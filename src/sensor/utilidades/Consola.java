package sensor.utilidades;

/**
 *
 * @author yerso
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Consola {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String readLine() {
        String linea = "";
        boolean valido;
        do {
            try {
                linea = br.readLine();
                valido = true;
            } catch (IOException e) {
                System.out.println("Error intente nuevamente...");
                valido = false;
            }
        } while (!valido);
        return linea;
    }
}