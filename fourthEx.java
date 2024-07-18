
import java.util.Scanner;


/*Ejercicio: Dada una secuencia de números positivos
 * obtener la suma de aquellos números tales que su número sea igual a la suma de sus cifras
 * Pulsar 0 para terminar
 * 
 * ejemplo de entrada: 1, -111 , 5 , 111 , 66 , 201 , 27 , 0
 * ejemplo de salida: 1+111+201=313
 */
public class fourthEx {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String resultado = "";
        int total = 0;
        int num = 0;

        do {
            System.out.println("Introduce un número positivo , cero para terminar.");
            num = entrada.nextInt();
            int cifras = 1;
            int suma = num % 10;  // esto se hace para guardar el último número en variable suma
            int aux = num; // crea variable aux para no trabajar directo con num y perderlo

            while (aux > 9) {
                aux /= 10;
                cifras++;
                suma += aux % 10;
            }
            if (cifras == suma) {   // esta es la condición del ejercicio
                resultado += num + "+";
                total += num;
            }

        } while (num != 0);
        System.out.println(resultado + "\b=" + total);  // la B elimina el ultimo de la cadena que es un +
        entrada.close();

    }

}
