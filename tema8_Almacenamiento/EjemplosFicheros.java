package tema8_Almacenamiento;

import java.io.File;

public class EjemplosFicheros {

    public static void main(String[] args) {

        //fichero
        File fichero = new File("tema8_Almacenamiento/Ejemplo API STREAM JAVA 2.png");
        if (fichero.exists())
            System.out.println("El fichero existe");
        else
            System.out.println("El fichero no existe");
        System.out.println("Nombre: " + fichero.getName());
        System.out.println("Longitud: " + fichero.length());
        System.out.println("Ruta absoluta: " + fichero.getAbsolutePath()+"\n\n");

        //carpeta
        File carpeta = new File("tema8_Almacenamiento/ProgramacionFuncional");
        if (carpeta.exists())
            System.out.println("La carpeta existe");
        else
            System.out.println("La carpeta no existe");
        System.out.println("Nombre: " + carpeta.getName());
        System.out.println("Longitud: " + carpeta.length());
        System.out.println("Ruta absoluta: " + carpeta.getAbsolutePath());
    }
}
