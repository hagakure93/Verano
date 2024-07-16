
import java.util.Scanner;

public class primerEjerc {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int numLeer, numActual;
            int max = 0, min = 0, contadorMax = 1, contadorMin = 1;
            System.out.println("Dime una cantidad de números que leer");
            numLeer = entrada.nextInt();
            for (int i = 0; i < numLeer; i++) {

                System.out.println("Dime un número");
                numActual = entrada.nextInt();
                

                if (numActual > max) {  // los == :(
                    max = numActual;
                    contadorMax = 1;  // como es nuevo máximo , el contador se reinicia a 1
                } else if (numActual == max) {
                    contadorMax++;
                }

                if (numActual < min) {
                    min = numActual;
                    contadorMin = 1;
                } else if (numActual == min) {
                    contadorMin++;
                
                } 
                   
                

            }
            entrada.close();
            System.out.println("El mayor número introducido ha sido el " + max + " y aparece " + contadorMax + " veces.");
            System.out.println("El menor número ha sido " + min + " y aparece " + contadorMin + " veces.");
        }
    }

}
