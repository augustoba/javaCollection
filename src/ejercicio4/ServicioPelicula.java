
package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioPelicula {
    Scanner read = new  Scanner(System.in);
    ArrayList<Pelicula> pel = new ArrayList();
    
public void cargarpeliculas(){
    String opc;
    do {
        Pelicula peli = new Pelicula();
         System.out.println("ingrese el titulo de la pelicula");
         peli.setTitulo(read.nextLine());
         System.out.println("ingrese el nombre del director");
         peli.setDirector(read.nextLine());
         System.out.println("ingrese la duracion de la pelicula");
         peli.setDuracionPelicula(read.nextInt());
         
         pel.add(peli);
         
         System.out.println("desea cargar otra peliula (si/no)");
         read.nextLine();
         opc=read.nextLine();
         
    } while (opc.equalsIgnoreCase("si"));
    
    
   
}

public void mostrarPeliculas(){
    for (Pelicula aux : pel) {
        System.out.println(aux);
    }
    
}
        
        public void mostrarPeliculasMasHora(){
            for (Pelicula aux : pel) {
                
                if (aux.getDuracionPelicula()>1) {
                    System.out.println("la pelicula : " + aux + " dura mas de una hora");                    
                }                
            }
        }
        
        public void duracionMayoraMenor(){
            
            Collections.sort(pel, comparadorPelis.compararDuracionDescendente );
            System.out.println("las peliculas ordenas por duracion de mayor a menor son:");
            for (Pelicula aux : pel) {
                System.out.println(aux);                
            }
            System.out.println("--------------------------------------------------------");
            
            }
        
            
            public void duracionMenoraMayor(){
                
                //se trae la collection y se pasa el array de peliculas para que puedan ser comparados con el metodo
                // del comparador.
                
                Collections.sort(pel, comparadorPelis.compararDuracionAscendente);
                System.out.println("las peliculas ordenas de menor a mayor son : ");
                
                for (Pelicula aux : pel) {
                    System.out.println(aux);
                }
                    System.out.println("--------------------------------------------------------");
                }
                
                public void ordenAlfabetico(){
                    Collections.sort(pel, comparadorPelis.compararTitulo);
                    System.out.println("las peliculas  ordenadas  alfabeticamente son :");
                    
                    for (Pelicula aux : pel) {
                        System.out.println(aux);
                    }
                        System.out.println("--------------------------------------------------------");
                    }
                
                public void ordenDirector(){
                    Collections.sort(pel, comparadorPelis.compararDirector);
                    System.out.println("las peliculas ordenadas por director son :");
                    
                    for (Pelicula aux : pel) {
                        System.out.println(aux);
                        
                    }
                    System.out.println("--------------------------------------------------------");
                }
                }
            
        
                        

       

