public class Ej5 {
    public static void main(String[] args) {
        final String app = "MiApp";
        final String version = "1.0.0";
        final double pi = Math.PI;
        String usuario = "Laura";
        int nivel = 1;
        int puntuacion = 0;
        System.out.println("Aplicación: " + app +
        "\nVersión: " + version + 
        "\nValor de PI: " + pi + 
        "\nUsuario Actual: " + usuario + 
        "\nNivel: " + nivel + 
        "\nPuntiación: " + puntuacion);
        usuario = "Manuel";
        nivel = 2;
        puntuacion = 150;
        System.out.println("Usuario actualizado: " + usuario + 
        "\nNivel actualizado: " + nivel +
        "\nPuntiacion actualizada: " + puntuacion);
    }
}
