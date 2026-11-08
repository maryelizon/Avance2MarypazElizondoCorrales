//Contiene los datos de cada ejercicio, como su nombre, categoría, descripción
//e instrucciones. Incluye un constructor para asignar estos datos y métodos
//getters para consultar la información desde las rutinas y el gestor del sistema.
package avance.pkg2marypazelizondocorrales;

public class Ejercicio {
    protected String nombre;
    protected String tipo;
    protected String descripcion;
    protected String instrucciones;

    public Ejercicio(String nombre, String tipo, String descripcion, String instrucciones) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.instrucciones = instrucciones;
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public String getDescripcion() { return descripcion; }
    public String getInstrucciones() { return instrucciones; }

}
