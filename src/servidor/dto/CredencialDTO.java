package servidor.dto;

/**
 *
 * @author yerso
 */
public class CredencialDTO implements java.io.Serializable {

    protected String usuario;
    protected String clave;
    protected int rol;

    public CredencialDTO(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getRol() {
        return this.rol;
    }
}
