
import java.util.Scanner;

public class ProgFiguras {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int opcion;
            int dimension = 10; // aquí va la altura de las figuras

            do {

                mostrarMenu();
                opcion = entrada.nextInt();
                if (opcion == 5) {
                    System.out.println("Adios!");
                }

                switch (opcion) {
                    case 1 -> cuadrado(dimension);
                    case 2 -> cuadradoSinrelleno(dimension);
                    case 3 -> triangulo(dimension);
                    case 4 -> trianguloSinrelleno(dimension);

                }

            } while (opcion != 5);
        }

    }

    /**
     * muestra el menú de selección de figura a imprimir
     */
    static void mostrarMenu() { // void porque no le he pasado ningún parámetro
        System.out.println("MENÚ FIGURAS");
        System.out.println("Selecciona una opción");
        System.out.println("------------------------------------");
        System.out.println("1 - Dibujar un cuadrado");
        System.out.println("2 - Dibujar cuadrado sin relleno");
        System.out.println("3 - Dibujar un triángulo");
        System.out.println("4 - Dibujar un triángulo sin relleno");
        System.out.println("5 - SALIR");
        System.out.println("------------------------------------");

    }

    /**
     * Dibuja un cuadrado CON relleno ( esto es un javadoc coment , útil para
     * explicar parametros)
     * 
     * @param n este es el parámetro n ,
     */
    static void cuadrado(int n) {

        System.out.println();
        for (int i = 0; i < n; i++) { // esto determinará las filas , cuantas filas?
            for (int j = 1; j <= n; j++) { // esto es lo que va pintando , hasta el salto de linea
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
    }

    /**
     * este es el cuadrado SIN relleno
     * 
     * @param n
     */
    static void cuadradoSinrelleno(int n) {
        // sin relleno
        System.out.println();
        for (int i = 0; i < n; i++) { // cuantas filas?
            for (int j = 0; j < n; j++) { // altura -1 es la última vuelta de altura
                // primera fila ,ult fila prim columna, ult columna
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(); // para cambiar de linea al terminar bucle interno
        }
    }

    /**
     * Este es el triángulo CON relleno
     * 
     * @param n
     */
    static void triangulo(int n) {
        System.out.println();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * este es el triángulo sin relleno
     * 
     * @param n
     */
    static void trianguloSinrelleno(int n) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                // primera y última fila primera columna y última columna
                if (i == 0 || i == n - 1 || j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
