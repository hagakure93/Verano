package tema8_Almacenamiento;

import java.io.Serializable;

public class Alumno implements Serializable {

    private final String nombre;
    private final String nia;
    private final int edad;

    public Alumno(String nombre, String nia, int edad) {
        this.nombre = nombre;
        this.nia = nia;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNia() {
        return nia;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", nia=" + nia + ", edad=" + edad + "]";
    }   
}
