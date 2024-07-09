
import java.util.Scanner;

public class testing {

    public static void main(String[] args) {

        try (Scanner imput = new Scanner(System.in)) {
            int dado = (int) (Math.random() * 7);
            int tirada;
            
            System.out.println("Pulsa 0 para tirar el dado");
            tirada = imput.nextInt();        if (tirada == 0);
            System.out.println("El resultado del dado es: " + dado);
            System.out.println("Tirada finalizada.");
        }

    }
}
