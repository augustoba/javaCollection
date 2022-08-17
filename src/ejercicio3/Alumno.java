
package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    
    private String nombre;
    private List<Integer> notas;//es una lista para cargar varias notas.

    public Alumno() {
        this.notas = new ArrayList();//cada vez que creamos un alumno nuevo creamos un nuevo array de notas.
    }

    public Alumno(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return  "nombre: " + nombre + ", notas: " + notas ;
    }
    

}
