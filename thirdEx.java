
import java.util.Scanner;

public class thirdEx {

    public static void main(String[] args) {

        System.out.println("Introduzca un número positivo o pulse 0 para salir");
        try (Scanner entrada = new Scanner(System.in)) {
            int num;
            int sumaTotal = 0;

            do {
                num = entrada.nextInt();      
                System.out.println("Introduzca otro número o pulse 0 para salir");
                

                sumaTotal += num;

            } while (num != 0); 
            System.out.println("\nLa suma total asciende a " + sumaTotal);
            if (num == 0) {
                System.out.println("Gracias por su tiempo adios.");
            }
            entrada.close();

        }

    }

}
