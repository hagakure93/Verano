
import java.util.Arrays;
import java.util.Random;

public class GeneradorArrays {
    public static void main(String[] args) {
        int[][] nums = generarMatriz(4, 5, 4, 5, 9);
        System.out.println("\nMatriz Original:");
        for (int[] fila : nums) {
            System.out.println(Arrays.toString(fila));

        }

        int[] maximosColumnas = maximosColumnas(nums);
        System.out.println("\nMáximos columnas: \n"+Arrays.toString(maximosColumnas));

        int[] maximosFilas = maximosFilas(nums);
        System.out.println("\nMáximos filas: \n"+Arrays.toString(maximosFilas));

    }

    static int[] maximosColumnas(int[][] matriz) {

        int anchoMax = 0;
        for (int[] fila : matriz) {
            if (fila.length > anchoMax)
                anchoMax = fila.length;
        }
        int[] arrayMaximos = new int[anchoMax];
        for (int i = 0; i < arrayMaximos.length; i++) {
            arrayMaximos[i] = Integer.MIN_VALUE;
        }
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                if (matriz1[j] > arrayMaximos[j]) {
                    arrayMaximos[j] = matriz1[j];
                }
            }
        }
        return arrayMaximos;
    }

    static int[] maximosFilas(int[][] matriz) {

        int maxFila;
        int[] arrayMaximos = new int[matriz.length];
       
        for (int i = 0; i < matriz.length; i++) {
            maxFila = Integer.MIN_VALUE;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxFila)
                    maxFila = matriz[i][j];
            }
            arrayMaximos[i] = maxFila;
        }
        return arrayMaximos;
    }

    /**
     * Genera una matriz irregular con enteros aleatorios
     * 
     * @param anchoMin - Anchura mínima de las filas de la matriz
     * @param anchoMax - Anchura máxima de las filas de la matriz
     * @param altoMin  - Altura mínima de la matriz , debe ser uno o superior , de
     *                 lo contrario podría no tener filas.
     * @param altoMax  - Cantidad máxima de filas de la matriz , debe ser superior a
     *                 altoMin , si no , se igualaran.
     * @param numMax   - Valor máximo para cada uno de los enteros de la matriz ,
     *                 desde 0 hasta numMax.
     * @return - Matriz con enteros generados de forma aleatoria.
     */

    static int[][] generarMatriz(int anchoMin, int anchoMax, int altoMin, int altoMax, int numMax) {

        if (anchoMin > anchoMax)
            anchoMin = anchoMax;
        if (altoMin > altoMax)
            altoMin = altoMax;

        Random r = new Random(); // Ahora r es un objeto para crear aleatorios
        int[][] matriz = new int[r.nextInt(altoMin, altoMax + 1)][];

        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = new int[r.nextInt(anchoMin, anchoMax)];
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(numMax + 1);
            }
        }
        return matriz;
    }
}
