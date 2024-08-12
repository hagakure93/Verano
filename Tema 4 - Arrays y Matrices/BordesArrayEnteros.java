public class BordesArrayEnteros {

    static final char LINEA_VERTICAL = '║';
    static final char LINEA_HORIZONTAL = '═';
    static final char ESQUINA_SUP_IZQ = '╔';
    static final char ESQUINA_INF_IZQ = '╚';
    static final char ESQUINA_SUP_DER = '╗';
    static final char ESQUINA_INF_DER = '╝';
    static final char SEPARADOR_SUP = '╦';
    static final char SEPARADOR_INF = '╩';
    static final char SEPARADOR_IZQ = '╠';
    static final char SEPARADOR_DER = '╣';
    static final char SEPARADOR_CRUZ = '╬';
    static final char SEPARADOR_FILAS_MATRICES = '■';
    static final int BORDE_SUP = 0;
    static final int BORDE_INF = 1;

    public static void main(String[] args) {

        mostrarArrayConBordes(new int[] { 1, 2, 112, 564, 23, 1, 2323, 2, 5 });

    }

    static void mostrarArrayConBordes(int[] nums) {

        // Borde superior
        imprimirBordeSuperiorArray(nums);

        // Lineas centrales
        imprimirEnterosArray(nums);
        // Borde inferior
        imprimirBordeInferiorArray(nums);
    }

    static void imprimirEnterosArray(int[] array) {
        System.out.print(LINEA_VERTICAL + " ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " " + LINEA_VERTICAL + " ");
        }
        System.out.println();
    }

    static void imprimirBordeSuperiorArray(int[] array) {
        imprimirBordeArray(array, BORDE_SUP);
    }

    static void imprimirBordeInferiorArray(int[] array) {
        imprimirBordeArray(array, BORDE_INF);
    }

    static void imprimirBordeArray(int[] array, int tipoBorde) {
        System.out.print(tipoBorde == BORDE_SUP ? ESQUINA_SUP_IZQ : ESQUINA_INF_IZQ);

        for (int i = 0; i < array.length; i++) {
            // Imprimimos lineas horizontales
            int lineas = digitos(array[i]) + 2;
            for (int j = 0; j < lineas; j++) {
                System.out.print(LINEA_HORIZONTAL);
            }
            // Imprimimos el separador
            if (i < array.length - 1)
                System.out.print(tipoBorde == BORDE_SUP ? SEPARADOR_SUP : SEPARADOR_INF);
        }
        System.out.println(tipoBorde == BORDE_SUP ? ESQUINA_SUP_DER : ESQUINA_INF_DER);
    }

    static int digitos(int n) {

        if (n < 10)
            return 1;
        else
            return 1 + digitos(n / 10); // imagina que es 15 , pasaría la coma...
    }

}
