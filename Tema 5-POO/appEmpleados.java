public class appEmpleados {
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado("Eikichi Onizuka", 20, 3000);
        Empleado e2 = new Empleado("Pablo Hagakure", 5, 2000);

        e1.mostrarDatos();
        e2.mostrarDatos();
        e2.setSalario(10);
        e2.mostrarDatos();
        

    }
    
}
