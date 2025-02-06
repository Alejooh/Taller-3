package peliculas;

public class Pelicula {
    private String titulo;
    private int anio;
    private String genero;

    public Pelicula(String titulo, int anio, String genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Año: " + anio + ", Género: " + genero;
    }

    public int getAnio() {
        return anio;
    }
}