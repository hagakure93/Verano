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

        int[][] nums1 = {{1,2},{4,5,6,7},{8},{2,3,1},{3,6,5}};
        int[][] nums2 = {{121,42},{4,35,6,127},{12},{23,3,42,8},{3,16,8}};


        mostrarArrayConBordes(new int[] { 1, 2, 112, 564, 23, 1, 2323, 2, 5 });
        mostrarMatrizConBordes(nums1);


    }

    static void mostrarArrayConBordes(int[] array) {

        System.out.println(crearStringArrayConBordes(array));
    }

    static void mostrarMatrizConBordes(int[][] matriz) {

        System.out.println(crearStringMatrizConBordes(matriz));
    }

    static String crearStringArrayConBordes(int[] array) {

        String arrayConBordes = "";
        if (array.length > 0) {

            arrayConBordes += obtenerBordeSuperiorArray(array) + "\n";

            arrayConBordes += obtenerStringEnteros(array) + "\n";

            arrayConBordes += obtenerBordeInferiorArray(array) + "\n";
        }
        return arrayConBordes;
    }

    static String crearStringMatrizConBordes(int[][] matriz) {

        String matrizConBordes = "";
        if (matriz.length > 0) {

            matrizConBordes += obtenerBordeSuperiorArray(matriz[0]) + "\n";

            matrizConBordes += obtenerParteCentralMatriz(matriz);

            matrizConBordes += obtenerBordeInferiorArray(matriz[matriz.length - 1]) + "\n";

        }
        return matrizConBordes;

    }

    static String obtenerStringEnteros(int[] array) {
        String enterosFila = "";
        enterosFila += LINEA_VERTICAL;
        for (int i = 0; i < array.length; i++) {
            enterosFila += " " + array[i] + " " + LINEA_VERTICAL + " ";
        }
        return enterosFila;
    }

    static String obtenerParteCentralMatriz(int[][] matriz) {

        String parteCentralMatriz = "";

        // Recorremos cada fila de la matriz
        for (int i = 0; i < matriz.length; i++) {
            // Añadir una String con los enteros de la fila actual
            parteCentralMatriz += obtenerStringEnteros(matriz[i]) + "\n";
            // Si no es la última fila , obtenemos el borde intermedio
            if (i < matriz.length - 1) {
                // añadir la String con el borde intermedio
                parteCentralMatriz += obtenerBordeIntermedio(matriz[i], matriz[i + 1]) + "\n";
            }
        }

        return parteCentralMatriz;
    }

    static String obtenerBordeIntermedio(int[] filaActual, int[] filaInferior) {

        // Array con los separadores de la fila actual
        int[] posicionesSeparadoresInferiores = posicionarSeparadores(filaActual);
        int anchoFilaActual = obtenerAnchoFila(posicionesSeparadoresInferiores);
        // Array con los separadores de la fila inferior
        int[] posicionesSeparadoresSuperiores = posicionarSeparadores(filaInferior);
        int anchoFilaInferior = obtenerAnchoFila(posicionesSeparadoresSuperiores);
        // Creamos un array de char para guardar cada uno de los separadoes
        int anchoBorde = anchoFilaActual > anchoFilaInferior ? anchoFilaActual : anchoFilaInferior;
        char[] bordeIntermedio = new char[anchoBorde];

        // establecemos las lineas horizontales y lose separadores
        bordeIntermedio = establecerHorizontalesConSeparadores(bordeIntermedio, posicionesSeparadoresInferiores,
                posicionesSeparadoresSuperiores);

        // establecemos las esquinas

        bordeIntermedio = establecerEsquinas(bordeIntermedio, anchoFilaActual, anchoFilaInferior);

        // generar una String a partir de ese Array
        String bordeIntermedioFInal = "";
        for (char c : bordeIntermedio) {
            bordeIntermedioFInal += c;
        }
        return bordeIntermedioFInal;

    }

    private static char[] establecerEsquinas(char[] bordeIntermedio, int anchoFilaActual, int anchoFilaInferior) {
        if (anchoFilaActual > anchoFilaInferior)
            bordeIntermedio[bordeIntermedio.length - 1] = ESQUINA_INF_DER;
        else if (anchoFilaActual > anchoFilaInferior)
            bordeIntermedio[bordeIntermedio.length - 1] = ESQUINA_SUP_DER;
        else
            bordeIntermedio[bordeIntermedio.length - 1] = SEPARADOR_DER;

        return bordeIntermedio;
    }

    private static char[] establecerHorizontalesConSeparadores(char[] bordeIntermedio,
            int[] posicionesSeparadoresInferiores, int[] posicionesSeparadoresSuperiores) {

        // Ponemos el separador izquierdo
        bordeIntermedio[0] = SEPARADOR_IZQ;
        // separadoes inferiores
        bordeIntermedio = establecerSeparadoesInferiores(bordeIntermedio, posicionesSeparadoresInferiores);

        // separadores superiores
        bordeIntermedio = establecerSeparadoesSuperiores(bordeIntermedio, posicionesSeparadoresSuperiores);

        return bordeIntermedio;

    }

    private static char[] establecerSeparadoesSuperiores(char[] bordeIntermedio,
            int[] posicionesSeparadoresSuperiores) {
        int contadorPosicionBorde = 1;
        for (int i = 0; i < posicionesSeparadoresSuperiores.length; i++) {

            for (int j = 0; j < posicionesSeparadoresSuperiores[i]; j++) {
                if (bordeIntermedio[contadorPosicionBorde] == '\u0000')
                    bordeIntermedio[contadorPosicionBorde] = LINEA_HORIZONTAL;
                contadorPosicionBorde++;
            }
            // si tenemos separador en la misma posicion ponemos la cruz
            if (bordeIntermedio[contadorPosicionBorde] == SEPARADOR_INF)
                bordeIntermedio[contadorPosicionBorde] = SEPARADOR_CRUZ;

            // de lo contrario ponemos separador superior únicamente
            else
                bordeIntermedio[contadorPosicionBorde] = SEPARADOR_SUP;
            contadorPosicionBorde++;
        }
        return bordeIntermedio;

    }

    private static char[] establecerSeparadoesInferiores(char[] bordeIntermedio,
            int[] posicionesSeparadoresInferiores) {
        int contadorPosicionBorde = 1;
        for (int i = 0; i < posicionesSeparadoresInferiores.length; i++) {

            for (int j = 0; j < posicionesSeparadoresInferiores[i]; j++) {
                bordeIntermedio[contadorPosicionBorde] = LINEA_HORIZONTAL;
                contadorPosicionBorde++;
            }
            // separador inferior
            bordeIntermedio[contadorPosicionBorde] = SEPARADOR_INF;
            contadorPosicionBorde++;
        }
        return bordeIntermedio;
    }

    static int[] posicionarSeparadores(int[] fila) {

        // colocamos un índice en cada posición de cada separador
        int[] posicionesSeparadores = new int[fila.length];
        for (int i = 0; i < posicionesSeparadores.length; i++) {
            posicionesSeparadores[i] = digitos(Math.abs(fila[i])) + 2; // mas dos por los espacios en blanco
            if (fila[i] < 0)
                posicionesSeparadores[i]++;
        }
        return posicionesSeparadores;
    }

    static int obtenerAnchoFila(int[] posicionesSeparadores) {

        int anchoFila = 1; // caracter inicial separador vertical
        for (int i = 0; i < posicionesSeparadores.length; i++) {
            anchoFila += posicionesSeparadores[i] + 1;

        }
        return anchoFila;
    }

    static String obtenerBordeSuperiorArray(int[] array) {
        return obtenerBordeArray(array, BORDE_SUP);
    }

    static String obtenerBordeInferiorArray(int[] array) {
        return obtenerBordeArray(array, BORDE_INF);
    }

    static String obtenerBordeArray(int[] array, int tipoBorde) {

        String borde = "";
        borde += tipoBorde == BORDE_SUP ? ESQUINA_SUP_IZQ : ESQUINA_INF_IZQ;

        for (int i = 0; i < array.length; i++) {
            // Imprimimos lineas horizontales
            int lineas = digitos(array[i]) + 2;
            for (int j = 0; j < lineas; j++) {
                borde += LINEA_HORIZONTAL;
            }
            // Imprimimos el separador
            if (i < array.length - 1)
                borde += tipoBorde == BORDE_SUP ? SEPARADOR_SUP : SEPARADOR_INF;
        }
        borde += tipoBorde == BORDE_SUP ? ESQUINA_SUP_DER : ESQUINA_INF_DER;
        return borde;
    }

    static int digitos(int n) {

        if (n < 10)
            return 1;
        else
            return 1 + digitos(n / 10); // imagina que es 15 , pasaría la coma...
    }

}
