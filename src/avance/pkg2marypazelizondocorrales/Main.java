//Fecha de entrega: 8 de noviembre de 2026
//Hecho por: Marypaz Elizondo Corrales
//Descripción: Es una aplicación para el gimnasio donde se puede iniciar sesión
//con su usuario, ver una lista de ejercicios con sus instrucciones y descripciones,
//crear rutinas personalizadas eligiendo los ejercicios que se prefiera y guardar o
//exportar tu rutina para consultarla cuando se requiera.
package avance.pkg2marypazelizondocorrales;

import GUI.IniciarSesion;

public class Main {

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }
}