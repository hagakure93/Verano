import java.util.Arrays;

public class Clone {

    public static void main(String[] args) {

        int[] primos = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23 };
        int[] copiaClonado;
        int[] copiaReferencia;
        // clonación , este es el que tego que aprender
        copiaClonado = primos.clone();
        // cambio en el clon, sin afectar al original
        copiaClonado[0] = 0;
        // copia de referencia
        copiaReferencia = primos;
        // cambio en la copia, afecta al original
        copiaReferencia[1] = 0;
        // salida
        System.out.println(Arrays.toString(primos)); // [1, 0, 3, 5, 7, 11, 13, 17, 19, 23]
        System.out.println(Arrays.toString(copiaClonado)); // [0, 2, 3, 5, 7, 11, 13, 17, 19, 23]
        System.out.println(Arrays.toString(copiaReferencia));// [1, 0, 3, 5, 7, 11, 13, 17, 19, 23]

    }
}
