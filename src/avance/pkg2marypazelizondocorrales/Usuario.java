
package avance.pkg2marypazelizondocorrales;
//Almacena las credenciales de acceso de las personas en el
//sistema. Implementa Serializable para poder guardar y leer los datos de los 
//usuarios en archivos binarios (.dat).
import java.io.Serializable; 

public class Usuario implements Serializable { 
    
    private String usuario;
    private String contrasena;

    public Usuario(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
