package tema8_Almacenamiento;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EjemploSerializacion {

    public static void main(String[] args) {

        Grupo dam = new Grupo("1DAM");
        dam.agregarAlumno(new Alumno("Pep", "1111A", 15));
        dam.agregarAlumno(new Alumno("Tom", "2222A", 17));

        try (FileOutputStream fos = new FileOutputStream("archivo.dat")) {
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(dam); //Escribe una instancia de la clase grupo
            out.writeInt(23);
            out.writeObject(new Alumno("Jon", "3333A", 20)); // Escribe una instancia de la clase alumno
        } catch (IOException e) {
        }
    }
}
