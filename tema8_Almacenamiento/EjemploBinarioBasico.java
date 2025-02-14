package tema8_Almacenamiento;

import java.io.FileInputStream;
import java.io.IOException;

public class EjemploBinarioBasico {

    public static void main(String[] args) {

        String fileName = "ejemplo.dat";
        // Leer datos desde el archivo binario
        try {
            FileInputStream fis = new FileInputStream(fileName);
            int num;
            System.out.println("Datos leídos desde el archivo binario:");
            while ((num = fis.read()) != -1)
                System.out.print(num + " ");
            fis.close();
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error al leer");
        }
    }

}
