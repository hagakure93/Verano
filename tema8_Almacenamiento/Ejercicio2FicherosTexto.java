package tema8_Almacenamiento;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ejercicio2FicherosTexto {

    public static void main(String[] args) {
        crearArchivos(".", 2);

    }
    /*
     * Crea un método que debe crear n archivos, nombre(1).txt, nombre(2).txt,...
     * en la carpeta que se solicite al usuario. Dentro de cada archivo
     * deberá escribirse la frase "Este es el fichero nombre(n).txt"
     */

    public static void crearArchivos(String ruta, int n) {
        for (int i = 1; i <= n; i++) {

            String nombreFichero = ruta + "/nombre(" + i + ").txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreFichero))) {
                writer.write("Este es el fichero " + nombreFichero);

            } catch (Exception e) {
                System.out.println("Ocurrió un error al crear el archivo " + nombreFichero);
            }

        }
    }

}
