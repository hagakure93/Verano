public class ordenAlfabet {

    public static void main(String[] args) {

        final String WORD = "abcdefgijk";
        if (comprobar(WORD))
            System.out.println("La palabra [" + WORD + "] está ordenada.");
        else
            System.out.println("La palabra [" + WORD + "] no está ordenada.");
    }

    static boolean comprobar(String cadena) {
        cadena = cadena.toLowerCase(); // para que no se líe con las mayus
        // si solo tiene una letra , está ordenado
        if (cadena.length() > 1) {
            // sabe si está ordenado o no por la tabla ASCII
            if (cadena.charAt(0) <= cadena.charAt(1))
                // Va reduciendo letras
                return comprobar(cadena.substring(1, cadena.length())); // comprueba la siguiente
            else
                return false;
        }
        return true;

    }
}
