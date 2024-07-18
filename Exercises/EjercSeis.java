
import java.util.Scanner;
//Pide cinco palabras y nos diga cual tiene más longitud 

public class EjercSeis {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Dime cinco palabras y te digo cual tiene mayor longitud");
            String palabra , palabraMax = "";
            for (int i = 1; i <= 5; i++) {   // dentro del bucle for , tienes que declarar la variable int i
                System.out.println("Dime una palabra: " + i + " de cinco.");
                palabra = entrada.nextLine();

                if (palabra.length() < palabraMax.length()) {
                    palabraMax = palabra;
                }

            }
            System.out.println("La palabra más larga es: " + palabraMax );
        }

    }

}
