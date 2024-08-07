public class EjercicioMatriz {

    public static void main(String[] args) {

        imprimirMatriz(crearMatriz(4));
        imprimirMatrizInvertida(crearMatriz(4));

    }

 

 

    static void imprimirMatriz(int[][] m) {

        for (int[] fila : m) {
            for (int columna : fila) {
                if (columna == 1)
                    System.out.print("X ");
                else
                    System.out.print("- ");

            }
            System.out.println();

        }
    }

    static int[][] crearMatriz(int n) {
        int[][] array1 = new int[n][n]; // esto crea la matriz , con filas y columnas
        for (int i = 0; i < array1.length; i++) { // cantidad de filas

            for (int j = 0; j < array1[i].length; j++) { // columnas

                if (i == j)
                    array1[i][j] = 1;
                else
                    array1[i][j] = 0;

            }

        }
        return array1;

    }

    static void imprimirMatrizInvertida(int[][] m) {

        for (int[] fila : m) {
            String linea = "";
            for (int columna : fila) {
                if (columna == 1)
                    linea = "X " + linea;
                else
                    linea = "- " + linea;
            }
            System.out.println(linea);

        }
    }

}
