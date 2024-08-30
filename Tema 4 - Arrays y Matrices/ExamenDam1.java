
import java.util.Arrays;
import java.util.Scanner;

public class ExamenDam1 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            String opcion;

            do {
                abrirMenu();
                opcion = entrada.nextLine();

                switch (opcion) {
                    case "1" -> dibujarFigura(10);
                    case "2" -> modificarString("Examen de PROGRAMACIÓN");
                    case "3" -> {
                        int[] nums = eliminarDuplicados(new int[] { 1, 2, 4, 1, 6, 7, 4, 2, 6, 8 });
                        System.out.println(Arrays.toString(nums));
                    }
                    case "4" -> {
                        octales(1772);
                        break;
                    }
                    case "5" -> salir();
                    default -> opcionNoValida();
                }
            } while (!opcion.equals("5"));
        }

    }

    static void octales(int n) {

        if (n < 8)
            System.out.println("El número está en octal");
        else if (n % 10 > 7)
            System.out.println("El número NO está en octal");
        else
            octales(n / 10);
    }

    static void abrirMenu() {

        String s = """


                ╔═══════════════════════════════════╗
                ║       M E N Ú    E X A M E N      ║
                ║═══════════════════════════════════║
                ║    1 - Dibujar figura             ║
                ║    2 - Modificar String           ║
                ║    3 - Array sin duplicados       ║
                ║    4 - Octal                      ║
                ║    5 - Salir                      ║
                ╚═══════════════════════════════════╝


                """;

        System.out.println(s);

    }

    static void dibujarFigura(int altura) {

        int base = altura * 2 - 1;

        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < base; j++) {
                // Con esto busca el índice central , añadiendo 2 asterisc , uno a cada lado
                if (j >= base / 2 - i && j <= base / 2 + i) { // el entre 2 es para hallar el centro del trngl
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }

    static void modificarString(String frase) {
        String nueva = "";
        for (int i = 0; i < frase.length(); i++) {

            switch (frase.charAt(i)) {
                case 'á':
                case 'A':
                case 'a':
                    nueva += 4;
                    break;
                case 'é':
                case 'E':
                case 'e':
                    nueva += 3;
                    break;
                case 'I':
                case 'í':
                case 'i':
                    nueva += 1;
                    break;
                case 'O':
                case 'ó':
                case 'o':
                    nueva += 0;
                    break;
                case ' ':
                    nueva += '_';
                default:
                    nueva += frase.charAt(i);

            }

        }
        System.out.println(nueva);

    }

    static int[] eliminarDuplicados(int[] nums) {
        int[] distintos = { nums[0] };

        for (int i = 1; i < nums.length; i++) {
            // Si no está repetido:
            if (!repetido(nums[i], distintos)) {
                // Creamos un array nuevo con un elemento adicional
                int[] aux = new int[distintos.length + 1];

                // Copiamos los elementos
                System.arraycopy(distintos, 0, aux, 0, distintos.length);
                // Añadimos el no repetido
                aux[aux.length - 1] = nums[i];

                // Copiamos todo a distintos de nuevo

                distintos = new int[aux.length];
                System.arraycopy(aux, 0, distintos, 0, aux.length);
            }
        }
        return distintos;

    }

    static boolean repetido(int n, int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (n == array[i])
                return true;
        }
        return false;
    }

    static void salir() {
        System.out.println("Gracias, hasta otra");
    }

    static void opcionNoValida() {
        String s = """

                ╔═════════════════════════════════════════════════════╗
                ║ ERROR:  Debes seleccionar una opción entre 1 y 5    ║
                ╚═════════════════════════════════════════════════════╝
                    """;
        System.out.println(s);

    }
}
