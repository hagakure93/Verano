public abstract class Trabajador {
    String dni;
    String nombre;
    double salarioBase;

    public Trabajador(String dni, String nombre, double salarioBase) {
        this.dni = dni;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalarioFinal();

    
}