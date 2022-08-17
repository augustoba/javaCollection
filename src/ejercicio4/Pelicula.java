
package ejercicio4;


public class Pelicula {
private  String titulo;
private String director;
private Integer duracionPelicula;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracionPelicula) {
        this.titulo = titulo;
        this.director = director;
        this.duracionPelicula = duracionPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(Integer duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + ", director: " + director + ", duracionPelicula: " + duracionPelicula;
    }

}
