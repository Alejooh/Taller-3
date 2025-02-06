package nutricion;
import java.util.ArrayList;
import java.util.Scanner;
import nutricion.Ingrediente;

public class MainNutrientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ingrediente> ingredientes = new ArrayList<>();
        String respuesta;
        do {
            System.out.print("Ingrese el nombre del ingrediente: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la cantidad en gramos: ");
            double cantidad = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Ingrese el grupo (caloría, proteína, grasa, carbohidrato): ");
            String grupo = scanner.nextLine();
            ingredientes.add(new Ingrediente(nombre, cantidad, grupo));
            System.out.print("¿Desea agregar otro ingrediente? (si/no): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));

        double totalCalorias = 0;
        for (Ingrediente ingrediente : ingredientes) {
            totalCalorias += ingrediente.obtenerNutrientes();
        }

        System.out.println("Valor nutricional total: " + totalCalorias + " calorías.");

        if (totalCalorias < 2000) {
            System.out.println("El valor nutricional de la comida es aceptable.");
        } else {
            System.out.println("El valor nutricional de la comida no es aceptable.");
        }
        scanner.close();
    }
}