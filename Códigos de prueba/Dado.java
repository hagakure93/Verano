
import java.util.Scanner;

public class Dado {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int dado;
            int tirada;
            do {
                System.out.println("Pulsa cero para tirar el dado");
                tirada = teclado.nextInt();
                dado = (int) (Math.random() * 7);
                System.out.println("El resultado del dado ha sido " + dado);
            } while (tirada == 0);

            System.out.println("Se terminó tirar el dadito");
        }

    }

}
