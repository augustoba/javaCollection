package ejercicio4;




import java.util.Comparator;


public class comparadorPelis {

    public static Comparator<Pelicula> compararDuracionDescendente = new Comparator<Pelicula>() {
        //se instancia el comparador
	@Override
	public int compare(Pelicula e1, Pelicula e2) {
                       // se pasa por parametros el objeto (e1  y e2 serian el orden de e1 a e2 es ascendete 
	    return e2.getDuracionPelicula().compareTo(e1.getDuracionPelicula());
            //se retorna el dato que se busca en este caso la duracion 
	}
    };

    public static Comparator<Pelicula> compararDuracionAscendente = new Comparator<Pelicula>() {
	@Override
	public int compare(Pelicula e1, Pelicula e2) {
	    return e1.getDuracionPelicula().compareTo(e2.getDuracionPelicula());
	}
    };

    public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>() {
	@Override
	public int compare(Pelicula e1, Pelicula e2) {
	    return e1.getTitulo().compareTo(e2.getTitulo());
	}
    };
    
    public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>() {
	@Override
	public int compare(Pelicula e1, Pelicula e2) {
	    return e1.getDirector().compareTo(e2.getDirector());
	}
    };
}

