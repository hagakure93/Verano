public class MatricesIrregular {

    public static void main(String[] args) {

        int[][] b = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };

        // recorrido de la matriz
        for (int fila = 0; fila < b.length; fila++) { // reutilizar para recorrer filas de una matriz
            for (int columna = 0; columna < b[fila].length; columna++) {
                System.out.print(b[fila][columna] + " ");
            }
            System.out.println();

        }
    }

}
