package servidor.dto;

/**
 *
 * @author yerso
 */
public class RangoDTO implements java.io.Serializable {
    private final double menor;
    private final double mayor;

    public RangoDTO(double menor, double mayor) {
        this.menor = menor;
        this.mayor = mayor;
    }

    public double getMenor() {
        return menor;
    }

    public double getMayor() {
        return mayor;
    }
}
