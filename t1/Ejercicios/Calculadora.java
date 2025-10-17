import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Introduce la operación (+, -, *, /): ");
        String op = sc.next();
 
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        switch (op) {
            case "+":
                double suma = num1 + num2;
                System.out.println("La suma de " + df.format(num1) + " + " + df.format(num2) + " = " + df.format(suma));
            break;
            case "-":
                double resta = num1 - num2;
                System.out.println("La resta de " + df.format(num1) + " - " + df.format(num2) + " = " + df.format(resta));
            break;
            case "*":
                double mult = num1 * num2;
                System.out.println("La multiplicación de " + df.format(num1) + " * " + df.format(num2) + " = " + df.format(mult));
            break;
            case "/":
                double div = num1 / num2;
                System.out.println("La división de " + df.format(num1) + " / " + df.format(num2) + " = " + df.format(div));
            break;
            default:
                System.out.println("❌ Operación no válida. Usa +, -, * o /.");
        }
    }
}
