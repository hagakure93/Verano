import java.util.Scanner;

public class Ejer1Iniciacion {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int cantidadNumeros, numActual;
            int contador = 1, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, contadorMax = 0, contadorMin = 0;
            System.out.println("Cuántos números quieres introducir??");
            cantidadNumeros = entrada.nextInt();
            while (contador <= cantidadNumeros) {
                System.out.println("Introduce un número: " + contador + " de " + cantidadNumeros);
                numActual = entrada.nextInt();
                
                // nuevo máximo
                if (numActual > max) {
                    max = numActual;
                    contadorMax = 1;
                }
                // mismo máximo
                else if (numActual == max)
                    contadorMax++;
                
                // nuevo mínimo
                if (numActual < min) {
                    min = numActual;
                    contadorMin = 1;
                }
                // mismo mínimo
                else if (numActual == min)
                    contadorMin++;
                
                contador++;
            }   System.out.println(
                    "El mínimo es " + min + " y aparece " + contadorMin + " " + (contadorMin == 1 ? "vez" : "veces"));
            System.out.println(
                    "El máximo es " + max + " y aparece " + contadorMax + " " + (contadorMax == 1 ? "vez" : "veces"));
        }
    }

}
