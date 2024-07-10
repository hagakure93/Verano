
import java.util.Scanner;

public class buclesWhile {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int num; // si sale el problema de variable no usada, es porque no la necesita
            do {
                System.out.println("Introduce un número distinto de cero para seguir en el bucle");
                num = teclado.nextInt();
            } while (num != 0);
            System.out.println("Fin del bucle");
            teclado.close();
        }

    }

}
