package EjercicioPractico2;

import java.util.ArrayList;
import java.util.List;

public class Empresa2 {
    
    private final List<Empleado> empleados;

    public Empresa2() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(String dni) throws EmpleadoNoEncontradoException {
        for (Empleado empleado : empleados) {
            if (empleado.getDni().equals(dni)) {
                empleados.remove(empleado);
                return;
            }
        }
        throw new EmpleadoNoEncontradoException("ERROR al eliminar: Empleado con DNI " + dni + " no encontrado.");
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

}
