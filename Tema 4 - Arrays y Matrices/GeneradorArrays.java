
import java.util.Arrays;
import java.util.Random;

public class GeneradorArrays {
    public static void main(String[] args) {
        int[][] nums = generarMatriz(4, 5, 4, 5, 9);
        for (int[] fila : nums) {
            System.out.println(Arrays.toString(fila));

        }

    }

    static int[][] generarMatriz(int anchoMin, int anchoMax, int altoMin, int altoMax, int numMax) {

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
