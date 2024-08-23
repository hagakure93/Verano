

public class Matriz {

    public static void main(String[] args) {
        // declaración y inicialización
        int[][] matriz = { { 1, 4, 5 }, { 6, 7, 2 }, { 8, 3, 8 } };
        // recorrido de la matriz
        for (int[] matriz1 : matriz) {
            // reutilizar para recorrer filas de una matriz
            for (int columna = 0; columna < matriz1.length; columna++) {
                System.out.print(matriz1[columna] + " ");
            }
            System.out.println();
        }
        // Utilizando metodos de otras clases
        Bordes.mostrarMatrizConBordes(matriz); // Desde una clase llamo un método de otra clase pública
        Bordes.mostrarTextoConBordes("hola ");
        

        int[][] matrizA = GeneradorArrays.generarMatriz(4, 5, 4, 5, 9);
        int[][] matrizB = GeneradorArrays.generarMatriz(3, 4, 3, 5, 9);

        Bordes.mostrarMatricesConBordes(5, matriz, matrizA, matrizB);

    }
}
