package nutricion;

public class Ingrediente {
    private String nombre;
    private double cantidad; // en gramos
    private String grupo; 

    public Ingrediente(String nombre, double cantidad, String grupo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.grupo = grupo;
    }
    
    public double obtenerNutrientes() {
        switch (grupo.toLowerCase()) {
            case "caloría":
                return cantidad * 4; 
            case "proteína":
                return cantidad * 4; 
            case "grasa":
                return cantidad * 9; 
            case "carbohidrato":
                return cantidad * 4; 
            default:
                return 0;
        }
    }
}