package tema8_Almacenamiento;

import java.io.FileReader;
import java.io.IOException;

public class EjemploFileReader {

    public static void main(String[] args) {

        String fichero = "tema8_Almacenamiento/fichero.txt"; // guardas la ruta en un String

        try {
            // leer y mostrar el contenido del archivo
            try ( // creamos un objeto FileReader
                    FileReader fileReader = new FileReader(fichero)) {
                // Esta mierda lee caracteres, no lineas completas
                int caracter;
                System.out.println("Contenido del archivo " + fichero + ":");
                while ((caracter = fileReader.read()) != -1) {
                    System.out.print((char) caracter);
                }
                System.out.println();
                fileReader.close();

            }

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo");
            System.out.println("Directorio de trabajo: " + System.getProperty("user.dir"));

        }

    }

}
