
import java.util.Scanner;

public class MetodoExe2 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Dime un número");
            int numero = entrada.nextInt();
            System.out.println("El cubo de tu número es: " + cubo(numero));
            System.out.println("Si multiplicamos 8x9 nos da: " + mult(8, 9)); // no olvides el +
            System.out.println("Dime de qué número quieres saber la tabla de multiplicar y si es par o impar");
            int numerito = entrada.nextInt();
            System.out.println();
            tablaMult(numerito);// al invocar al método , ya imprime , no tienes que hacer otro systout si el método lo tiene
            System.out.println();
            mostrarParImpar(numerito);
        }

    }

    static int cubo(int numero) {

        return (int) Math.pow(numero, 3);

    }

    static int mult(int a, int b) {
        return a * b;
    }

    static void tablaMult(int num) {

        System.out.println("La tabla de multiplicar del número " + num + " es:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + mult(num, i)); // te olvidas los + siempre

        }
    }

    static boolean esPar(int num) {
        return num % 2 == 0;

    }

    static void mostrarParImpar(int n) {
        if (esPar(n)) {
            System.out.println("Tu número es par");
        } else {
            System.out.println("Tu número no es par");
        }
    }

}
