package tema8_Almacenamiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3FicherosText {

    public static void main(String[] args) {
        File archivo = new File("nuevoArchivo.txt");
        try {
            if (archivo.createNewFile())
                System.out.println("Archivo creado");
            else
                System.out.println("El archivo ya existe");
        } catch (IOException e) {
        }
        

        cantidadPalabras("nuevoArchivo.txt", "programacion");

    }

    /*
     * Crea un método que permita buscar palabras en un fichero de texto.
     * Se debe mostrar el número de ocurrencias de dicha palabra. Utiliza un búfer
     * para la lectura
     */

    public static void cantidadPalabras(String fichero, String palabra) {
        int contador = 0;
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] palabrasLinea = linea.split("\\s+");
                    for (String palabraActual : palabrasLinea) {
                        if (palabraActual.equals(palabra)) {
                            contador++;
                        }
                        
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("La palabra introducida no aparece "+e.getMessage());
        }

        System.out.println("La palabra "+palabra+" aparece "+contador+" veces.");

    }

}
