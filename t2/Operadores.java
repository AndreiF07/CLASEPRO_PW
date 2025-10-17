import java.util.Scanner;

public class Operadores {
    public void operadoresAritmeticos() {
        System.out.println("Explicación de los operadores aritmeticos");
        // unarios -> solo necesitan un operando
        int operando1 = 7;
        operando1++; // operando1 = operando1 + 1
        System.out.println(operando1);
        operando1--; // operando1 = operando1 - 1
        System.out.println(operando1);

        // Binarios
        int operando2 = 3;
        int suma = operando1 + operando2;
        System.out.println("El resultado de la suma es: " + suma);
        int resta = operando1 - operando2;
        System.out.println("El resultado de la resta es: " + resta);
        int mult = operando1 * operando2;
        System.out.println("El resultado de la multiplicación es: " + mult);
        double division = (double) operando1 / operando2;
        System.out.printf("El resultado de la división es: %.4f", division);
        double modulo = (double) operando1 % operando2;
        System.out.println("El resto de la división es: " + modulo);
    }

    public void operadoresAsignacion() {
        int operando1 = 6;
        operando1 += 6;
        operando1 -= 6;
        operando1 *= 2;
        operando1 /= 2;
        operando1 %= 3;
    }

    public void operadoresComparacion() {
        int numero1 = 4;
        int numero2 = 7;

        boolean resultado = numero1 > numero2;
        resultado = numero1 >= numero2;
        resultado = numero1 < numero2;
        resultado = numero1 <= numero2;
        resultado = numero1 == numero2;
    }

    public void operadoresLogicos() {
        int numero1 = 4;
        int numero2 = 10;
        int numero3 = 17;

        boolean resultadoLogicoAND = numero1 > 1 && numero2 < 11 && numero2 != numero3 && numero3 % 2 != 0;
        boolean resultadoLogicoOR = numero1 != 10 || numero2 > 10 || numero3 < numero2 || numero2 %2 != 0;
    }

    public void evaluarCandidato() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre y tu apellido: ");
        String nombre = sc.nextLine();
        System.out.println("Dime tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Tienes experiencia?: ");
        boolean experiencia = sc.nextBoolean();
        System.out.println("Qué salario queres cobrar?: ");
        double salario = sc.nextDouble();

        boolean eval = edad < 40 && salario < 40000 && experiencia;
        System.out.println(eval);
        sc.close();
    }

}
