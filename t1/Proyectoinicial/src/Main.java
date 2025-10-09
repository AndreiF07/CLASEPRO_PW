//https://github.com/DevelopSys/CLASEPRO_PW/tree/main/DAW
//1. Clase. Estructura basica de la programacion donde escribimos nuestro codigo. En POO es el molde de un objeto
public class Main {
    //2. Metodo. Definen funcionalidades. Tienen argumentos, retorno o void, y cuerpo
    //metodo Main. Metodo principal del programa. La puerta de entrada del programa. 1 por programa
    public static void main(String[] args){
        // "(String[] args)" es necesario solo para el jdk inferior al 25
        System.out.println("Este es mi primer programa en Java");
        //println -> con salto, print -> sin salto
        System.out.println("Esta es la segunda linea");
        //Declaracion de una variable primitiva(minus) o envolvente(mayus)
        String nombre  = "Borja"; //String clasico
        char letra = 'Y'; //Una letra, o el codigo ascii de una letra
        Character letraCompleja;
        int edad = 17; //Numero entero
        Integer edadCompleja;
        float peso = 68.50f;//Numero con decimales sin precision
        Float pesoCompeja;
        double altura = 1.71; //Numero con decimales con precision 
        Double alturaCompleja;
        boolean experiencia = true;//True o false
        Boolean experienciaCompleja;
        final String DNI = "A123123B";// Variable no mutable
    }
    //firma del metodo
    public void nombreMetodo() {
        //argumento Main. Metodo principal del programa. La puerta de entrada del programa. 1 por programa

    }
}   