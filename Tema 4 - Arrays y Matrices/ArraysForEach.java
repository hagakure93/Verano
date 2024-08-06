import java.util.Arrays;

public class ArraysForEach {
    public static void main(String[] args) {

        int[][] array4 = { { 3, 8, 5 }, { 4, 1, 8, 4 }, { 5, 2 } };
        for (int[] fila : array4) { // Bucle for each , como el bucle for pero sin declarar cosas
            System.out.println(Arrays.toString(fila)); // para imprimir matrices tambien , pero mejor el deep
        }
        System.out.println();

        int[] array = { 1, 4, 5, 7, 8, 9 };
        for (int n : array) {   // Bucle for each de un array unidimensional
            System.out.print(n + " ");

        }
        System.out.println();

        System.out.println(Arrays.toString(array)); // para imprimir un array unidimensional más fácilmente

        int[][] arrayBidimensional = { { 12, 3, 5 }, { 5, 7, 87, 6 }, { 67, 74, 23, 10 } };
        System.out.println();
        System.out.println(Arrays.deepToString(arrayBidimensional)); // esto imprime matrices

    }

}
