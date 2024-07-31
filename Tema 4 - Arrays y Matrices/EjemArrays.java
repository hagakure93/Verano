
import java.util.Random;

public class EjemArrays {
    public static void main(String[] args) {
        int elementos = 100; // aqui va la cantidad de elementos del array

        
        mostrarArray(crearArray(elementos));

    }
    // int[] n quiere decir que le pasas un array como parámetro
    static void mostrarArray(int[] n) {

        for (int i = 0; i < n.length; i++) {
            System.out.print("[" + n[i] + "] ");
        }
        System.out.println();
    }

    // static int[] porque quiero un array de enteros. elementos son los parámetros, que en un array, es su tamaño
    static int[] crearArray(int elementos) {
        // elementos es el parámetro que pedimos , que a su vez es el tamaño del array
        int[] array = new int[elementos]; // aquí se ha creado el array con el parámetro pedido
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100); // aquí guarda en cada celda de array el valor de random

        }
        return array;
    }

}
