
public class EmpleadoPorHoras extends Empleado {

   
    private final int horasTrabajadas;
    private final double tarifaPorHoras;

    public EmpleadoPorHoras(String nombre, String apellidos, String dni, double Salario, int horasTrabajadas,
            double tarifaPorHoras) {
        super(nombre, apellidos, dni, Salario);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHoras = tarifaPorHoras;

    }

    @Override
    public double calcularSalario(){
        return horasTrabajadas * tarifaPorHoras;

    }

    @Override
    public String toString(){
        return super.toString() + ", Salario: "+ calcularSalario();
    }

    

}
