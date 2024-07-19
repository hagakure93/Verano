
import java.util.Scanner;

public class drawTriangle {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Introduce la altura del triángulo");
            int altura = entrada.nextInt();
            System.out.println();

            for (int i = 0; i < altura; i++) {
                for (int j = 0; j <= i; j++) {  // j se inicia a 0 cada vez que sale del bucle
                    System.out.print("* ");

                }
                System.out.println();
            }
            System.out.println("\n\n");
            // sin relleno
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j <= i; j++) {
                    //   primera y última fila                primera columna y última columna
                    if (i == 0 || i == altura - 1 || j == 0 || j == i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }

}
