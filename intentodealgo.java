
import java.util.Scanner;

public class intentodealgo {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in) // En cuanto escribas esto sale arriba el import
                ) {

            int n;

            System.out.print("Introduzca un número entero: ");
            n = entrada.nextInt();
            entrada.nextLine(); // se usa un nextLine para borrar el intro del buffer

            switch (n) {
                case 1, 2, 3 ->
                    System.out.println("El número introducido es 1 , 2 o 3.");
                case 4, 5, 6 ->
                    System.out.println("El número introducido es 4 , 5 o 6");
                default ->
                    System.out.println("Tú número es otro.");

            }

            if (n > 6);
                System.out.println("Tu número es mayor que 6.");
            
                


            // Primero se hace un nextInt y luego un nextline para limpiar el buffer
        }

    }
}
