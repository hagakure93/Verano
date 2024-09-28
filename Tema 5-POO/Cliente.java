
import java.time.LocalDate;

public class Cliente {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String localidad;
    private LocalDate fechadeNacimiento;

    // CONSTRUCTOR (cada vez que creemos una instancia de cliente le debemos pasar cada parámetro)
    public Cliente(String nombre, String apellidos, String direccion, String localidad, LocalDate fechadeNacimiento) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.localidad = localidad;
        this.fechadeNacimiento = fechadeNacimiento;

    }

    public String nombreCompleto() {
        return nombre + " " + apellidos;
    }

    public String direccionCompleta() {
        return direccion + " " + localidad;
    }

}
