//Contiene el nombre de la rutina y una lista de ejercicios. Permite agregar 
//nuevos ejercicios y mostrar en texto la información de cada uno junto con su tipo.
package avance.pkg2marypazelizondocorrales;

import java.util.ArrayList;
import java.util.List;

public class Rutina {
    private String nombreRutina;
    private List<Ejercicio> ejercicios;

    public Rutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
        this.ejercicios = new ArrayList<>();
    }

    public void agregarEjercicio(Ejercicio ejercicio) {
        this.ejercicios.add(ejercicio);
    }

    public String mostrarRutina() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre de Rutina: ").append(nombreRutina).append("\n");
        sb.append("Ejercicios seleccionados:\n");
        for (Ejercicio e : ejercicios) {
            sb.append("- ").append(e.getNombre()).append(" (").append(e.getTipo()).append(")\n");
        }
        return sb.toString();
    }

    public String getNombreRutina() {
        return nombreRutina;
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }
}
