public class Ej9 {
    public static void main(String[] args) {
        String nombre = "Auriculares Bluetooth";
        double precio = 29.99;
        String codigo = "AUR-2023";
        boolean disp = true;
        info (nombre, precio, codigo, disp);
    }

    public static void info(String nombre, double precio, String codigo, boolean disp) {
        System.out.println("INFORMACIÓN DEL PRODUCTO\n--------------------------\nNombre: " + nombre + "\nPrecio: " + precio + "€\nCódigo: " + codigo + "\nDisponible: " + disp);
    }
}
