public class EjercicioBordes {

    // En mayusculas porque son constantes
    static final char LINEA_VERTICAL = '║';
    static final char LINEA_HORIZONTAL = '═';
    static final char ESQUINA_SUP_IZQ = '╔';
    static final char ESQUINA_SUP_DER = '╗';
    static final char ESQUINA_INF_DER = '╝';
   

    static final int BORDE_SUP = 0;
    static final int BORDE_INF = 1;
    static final char ESQUINA_INF_IZQ = '╚';

    public static void main(String[] args) {

        mostrarTitulo("Hoy es Viernes");
        String textoLargo = """
                Programación en Java
                Tema 4
                Estamos haciendo ejercicios de repaso
                """;
        mostrarTitulo(textoLargo);
    }

    /** A PARTIR DE AQUÍ SON EJERCICIOS CON STRINGS */

    static void mostrarTitulo(String titulo) {
        // pasamos a mayusculas
        titulo = titulo.toUpperCase();

        // obtenemos un array de strings , el split divide en substrings (frases en
        // palabras)
        String[] lineas = titulo.split("\n");

        // Obtenemos la longitud de la linea más larga
        int lineaMax = obtenerLineaMax(lineas);

        // BORDE SUPERIOR
        imprimirBorde(BORDE_SUP, lineaMax);

        // Linesas centrales (texto)
        imprimirLineas(lineas, lineaMax);

        // BORDE INFERIOR
        imprimirBorde(BORDE_INF, lineaMax);

    }

    static int obtenerLineaMax(String[] lineas) {
        int lineaMax = 0;
        for (String lineaActual : lineas) {
            if (lineaActual.length() > lineaMax)
                lineaMax = lineaActual.length();

        }

        return lineaMax;

    }

    static void imprimirLineas(String[] lineas, int lineaMax) {
        for (String linea : lineas) {
            System.out.print(LINEA_VERTICAL + "  ");
            for (int j = 0; j < lineaMax; j++) {
                if (j < linea.length()) {
                    System.out.print(linea.charAt(j) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" " + LINEA_VERTICAL);
        }
    }

    static void imprimirBorde(int tipoBorde, int ancho) {

        System.out.print(tipoBorde == BORDE_SUP ? ESQUINA_SUP_IZQ : ESQUINA_INF_IZQ);
        for (int i = 0; i < ancho * 2 + 3; i++) {
            System.out.print(LINEA_HORIZONTAL);

        }
        System.out.println(tipoBorde == BORDE_SUP ? ESQUINA_SUP_DER : ESQUINA_INF_DER);

    }

}
