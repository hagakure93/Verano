
import java.util.Scanner;

public class buclesWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Introduce un número distinto de cero para seguir en el bucle");
            num = teclado.nextInt();
        } while (num != 0);
        System.out.println("Fin del bucle");
        teclado.close();

    }

}
