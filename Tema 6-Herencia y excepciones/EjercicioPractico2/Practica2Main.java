package EjercicioPractico2;

public class Practica2Main {

    public static void main(String[] args) {

        Empresa2 empresa = new Empresa2();

        EmpleadoPorHoras empleado1 = new EmpleadoPorHoras("Juan", "Perez", "111A", 40, 10,12);
        EmpleadoFijo empleado2 = new EmpleadoFijo("Maria", "Lopez", "222B", 2000,2000);

        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);

        for (Empleado empleado : empresa.getEmpleados()) {
            System.out.println(empleado);
        }

        try {
             empresa.eliminarEmpleado("111A");
             empresa.eliminarEmpleado("1111");           
        } catch (EmpleadoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        for (Empleado empleado : empresa.getEmpleados()) {
            System.out.println(empleado.toString());
        }
    }
}
