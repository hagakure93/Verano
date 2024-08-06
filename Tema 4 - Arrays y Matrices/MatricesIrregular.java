public class MatricesIrregular {

    public static void main(String[] args) {

        int[][] b = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };

        // recorrido de la matriz
        for (int[] b1 : b) {
            // reutilizar para recorrer filas de una matriz
            for (int columna = 0; columna < b1.length; columna++) {
                System.out.print(b1[columna] + " ");
            }
            System.out.println();
        }
    }

}
