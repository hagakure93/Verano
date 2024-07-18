
import java.util.Scanner;

public class Exfive {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Dime un número y lo descompongo");
            String palabra = entrada.nextLine();
            
            for (int i = 0; i < palabra.length(); i++) {
                System.out.print(palabra.charAt(i) + " "); //primera vez que no uso el println

            }
            System.out.println();
        }
    }

}
