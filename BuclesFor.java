
import java.util.Scanner;

public class BuclesFor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double media = 0;
        for (int i = 1; i <= 5; i++) { // si pusiera i<=100;i+=10 haria de 10en10 hasta 100
            System.out.println("Dime un número: " + i + " de 5");
            int num = entrada.nextInt();
            media += num;

        }
        System.out.println("La media de los números introducidos es: " + media / 5);
        entrada.close();
    }

}



// Puede haber varias variables for(int i =0;j=3;) y también varios incrementos
