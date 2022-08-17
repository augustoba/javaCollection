
package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {

    
    Scanner read = new Scanner(System.in);
    ArrayList<Alumno> alum = new ArrayList(); //se instancia el array de alumnos para poder cargar a 
    //a cada alumno nuevo en la lista
    
    
    
    public void cargarAlumnos() {

	do {
	    Alumno al = new Alumno();//se instancia el nuevo alumno en cada vuelta del do while
            
	    
	    System.out.println("Ingrese un alumno: ");
	    al.setNombre(read.next());

	    System.out.println("Nota 1: ");
	    al.getNotas().add(read.nextInt());//se carga cada atributo con set
	    System.out.println("Nota 2: ");
	    al.getNotas().add(read.nextInt());
	    System.out.println("Nota 3: ");
	    al.getNotas().add(read.nextInt());

	    alum.add(al);// una vez cargado todos los datos se los envia al array.

	    System.out.println("quiere cargar otro alumno si/no");

	} while (read.next().equalsIgnoreCase("si"));
    }
    
    public void mostrarAlumnos(){
        for (Alumno aux : alum) {  //se muestra la lista de alumnos que hay en el array
            System.out.println(aux);
        }
    }
            
            
    
    public void notaFinal(){
        
        double notaF=0;
        System.out.println("ingresar alumno");
        String al=read.next();
        for (Alumno aux : alum) { // recorremos el array
          if (aux.getNombre().equalsIgnoreCase(al) ) {// si el auxiliar coincide con un nombre del alumno del array
                for (double nota : aux.getNotas()) { //Recorremos las notas
		    notaF = nota + notaF;//y las vamos cargando en la variable para sacar los valores
		}
                notaF=notaF/3;//dividimos en 3 para sacar el prmedio
                
            }else   System.out.println("no se encontro el alumno");
            
            
        }
        System.out.println("la nota final es: " + notaF);
    }
}
