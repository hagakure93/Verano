import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones2 {
    public static void main (String args[]) {
try (Scanner entrada = new Scanner(System.in)) {
    int num1, num2;
    try {
        num1 = entrada.nextInt();
        num2 = Integer.parseInt("hola");
        System.out.println(num2 / num1);
    } catch (ArithmeticException | InputMismatchException | NumberFormatException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
System.out.println("El programa termina con normalidad");
}

    
}
