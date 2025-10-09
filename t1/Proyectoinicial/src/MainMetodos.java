public class MainMetodos {
    public static void main(String[] args) {
        System.out.println("Main para probar metodos y variables");
        String nombre = "Andrei";
        saludar(nombre, 12);
    }

    public static void saludar(String data, Integer numero) {
        System.out.println("Enhorabuena " + data + ", has llamado a tu primer metodo");
        System.out.println(numero);
    }
}