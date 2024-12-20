package EjercicioPractico2;

public abstract class Empleado {
    String nombre;
    String apellidos;
    String dni;
    double salario;

    // CONSTRUCTOR
    public Empleado(String nombre, String apellidos, String dni, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.salario = salario;
    }

    // METODO ABSTRACTO
    public abstract double calcularSalario();

    // METODO toString
    @Override
    public String toString() {
        return "El empleado " + nombre + " y apellido " + apellidos + ", con DNI: " + dni;
    }

    // GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
