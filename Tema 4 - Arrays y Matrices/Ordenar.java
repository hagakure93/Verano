import java.util.Arrays;

public class Ordenar {

    public static void main(String[] args) {

        // Declaración e inicialización
        int[] arrayEjemplo = { 3, 6, 9, 0, 1, 2, 3 };
        int[] arrayOrdenado;
        // Salida inicial
        System.out.println("Sin ordenar: ");
        System.out.println(Arrays.toString(arrayEjemplo));

        // Ordenación
        arrayOrdenado = burbuja(arrayEjemplo);

        // Salida final
        System.out.println("Ordenado: ");
        System.out.println(Arrays.toString(arrayOrdenado));
    }


    public static int[] burbuja(int[] vector) {  // METODO BURBUJA , CONOCIDO PERO POCO EFICIENTE
        int aux;
        for (int i = 0; i < vector.length; i++) {
             for (int j = 0; j < vector.length - i - 1; j++) {     
                 //El valor máximo lo más a la derecha posible
                 if (vector[j] > vector[j + 1]) { 
                     aux = vector[j];
                     vector[j] = vector[j + 1];
                     vector[j + 1] = aux;
                 }
             }
         }
         return vector;
     }
    
     
}
