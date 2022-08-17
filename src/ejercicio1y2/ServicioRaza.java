
package ejercicio1y2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class ServicioRaza {
static Scanner read = new Scanner(System.in);

private ArrayList<Raza> perro = new ArrayList();


    public  void  cargarPerro(){
        String opc;
        
        do {
            System.out.println("ingrese una raza de perro");
             String respuesta = read.next();
             perro.add(new Raza(respuesta));
             
             System.out.println("desea ingresar mas razas S/N");
             opc=read.next();
             
             if (opc.toLowerCase().equals("n")) {
                 for (Raza aux : perro) {
                     System.out.println(aux);
                     
                 }
                
            }
        } while (opc.toLowerCase().equals("s"));
        
    }
    
    public void eliminarPerro(){
        Iterator<Raza> it = perro.iterator();
        // con el iterador se recorre la lista y tener las opciones para poder eliminar el elemento
        String opc;
        boolean eliminado=false;
        
        System.out.println("ingrese la raza a eliminar");
        opc=read.next();
        
        while(it.hasNext()){
         
        if (it.next().getRaza().equalsIgnoreCase(opc)) {
            it.remove();
            eliminado=true;
            // en esta linea decimos que si el siguiente objeto
            //del iterador la raza es igual a la que ingresamos
            // la elimine
           }
     }
        
        if (eliminado == true) {
            System.out.println("se elimino una raza");
            
        }else{
            System.out.println("no se encontro la raza");
        }
        for (Raza aux : perro) {
                     System.out.println(aux);
                     }
}
}