
import java.util.Scanner;

public class trianEquila {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Introduce la altura del triángulo");
            int altura = entrada.nextInt();
            int base = altura * 2 - 1;
            System.out.println();

            for (int i = 0; i < altura; i++) {

                for (int j = 0; j < base; j++) {
                    // Con esto busco el índice central , añadiendo 2 asterisc , uno a cada lado
                    if (j >= base / 2 - i && j <= base / 2 + i) { // el entre 2 es para hallar el centro del trngl
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
