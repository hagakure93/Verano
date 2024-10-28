import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones3 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int minutos;
        
        System.out.println("Indica los minutos");
        try {
            minutos = entrada.nextInt();
            entrada.close();
            if (minutos < 0 || minutos >= 60) {
                throw new InputMismatchException("Valor fuera de rango, de 0 a 60");
            }
            System.out.println("El número introducido es válido");

        } catch (InputMismatchException e) {
            if (e.getMessage() == null)
                System.out.println("ERROR: El dato introducido NO es válido ");
            else

                System.out.println("ERROR: " + e.getMessage());

        }

    }

}
