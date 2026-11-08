
package avance.pkg2marypazelizondocorrales;

//Maneja las listas de usuarios, ejercicios y rutinas, y permite guardar y cargar
//los datos automáticamente. Además, incluye métodos para registrar usuarios nuevos
//sin repetirlos, comprobar los datos de inicio de sesión (si el nombre de usuario
//y la contraseña ingresados coinciden con los datos de una cuenta registrada.) 
//y verificar si un nombre de usuario ya está registrado.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GestorEjercicios {

    private List<Usuario> listaUsuarios;
    private List<Ejercicio> listaEjercicios;
    private List<Rutina> listaRutinas;

    private final String archivo = "usuarios.dat";

    public GestorEjercicios() {
        listaUsuarios = new ArrayList<>();
        listaEjercicios = new ArrayList<>();
        listaRutinas = new ArrayList<>();

        cargarUsuarios();
    }

    public boolean registrarUsuario(String user, String pass) {
        if (user == null || pass == null
                || user.trim().isEmpty()
                || pass.trim().isEmpty()) {
            return false;
        }

        for (Usuario u : listaUsuarios) {
            if (u.getUsuario().equalsIgnoreCase(user)) {
                return false; 
            }
        }

        Usuario nuevoUsuario = new Usuario(user, pass);
        listaUsuarios.add(nuevoUsuario);
        guardarUsuarios();

        return true;
    }

    public boolean validarUsuario(String user, String pass) {
        for (Usuario u : listaUsuarios) {
            // Comparamos directamente usando los getters de la clase Usuario
            if (u.getUsuario().equals(user) && u.getContrasena().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica si un nombre de usuario ya se encuentra registrado en la lista,
     * ignorando mayúsculas y minúsculas.
     */
    public boolean existeUsuario(String user) {
        for (Usuario u : listaUsuarios) {
            if (u.getUsuario().equalsIgnoreCase(user)) {
                return true;
            }
        }
        return false;
    }

    private void guardarUsuarios() {
        try (ObjectOutputStream salida = new ObjectOutputStream(
                new FileOutputStream(archivo))) {
            salida.writeObject(listaUsuarios);
        } catch (Exception e) {
            System.out.println("Error al guardar los usuarios: "
                    + e.getMessage());
        }
    }

    private void cargarUsuarios() {
        File fichero = new File(archivo);

        if (!fichero.exists()) {
            return;
        }

        try (ObjectInputStream entrada = new ObjectInputStream(
                new FileInputStream(archivo))) {
            listaUsuarios = (ArrayList<Usuario>) entrada.readObject();
        } catch (Exception e) {
            listaUsuarios = new ArrayList<>();
            System.out.println("Error al cargar los usuarios: "
                    + e.getMessage());
        }
    }
}
