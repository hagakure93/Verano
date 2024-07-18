
import java.util.Scanner;

public class secondEx {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Introduce un número");
            int num = entrada.nextInt();
            int cifras = 1;
            if (num < 0) {
                System.out.println("Ese número no es válido , hemos dicho positivos ");
            } else {
                while (num > 9 && num > 0) {
                    num /= 10;
                    cifras++;
                }
                System.out.println("El número introducido tiene " + cifras + " " + (cifras == 1 ? "cifra" : "cifras"));
            }
            entrada.close();

        }

    }

}
