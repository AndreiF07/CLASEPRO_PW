public class Ej7 {
    public static void main(String[] args) {
        //Variables
        String nombre = "Elena";
        String apellido = "García";
        int edad = 24;
        String ciudad = "Barcelona";
        saludar(nombre, apellido, edad, ciudad);
    }

    public static void saludar(String nombre, String apellido, int edad, String ciudad) {
        System.out.println("¡Hola! Me llamo " + nombre + " " + apellido + ".\nTengo " + edad + " años y vivo en " + ciudad);
    }
}
