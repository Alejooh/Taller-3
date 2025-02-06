package peliculas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import peliculas.Pelicula;

public class MainPeliculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        String respuesta;

        do {
            System.out.print("Ingrese el título de la película: ");
            String titulo = scanner.nextLine();
            System.out.print("Ingrese el año de lanzamiento: ");
            int anio = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Ingrese el género: ");
            String genero = scanner.nextLine();

            peliculas.add(new Pelicula(titulo, anio, genero));

            System.out.print("¿Desea agregar otra película? (si/no): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));

        Collections.sort(peliculas, Comparator.comparingInt(Pelicula::getAnio));

        System.out.println("\nLista de películas ordenadas por año de lanzamiento:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        scanner.close();
    }
}