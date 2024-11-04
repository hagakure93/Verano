public class ElMain {
    public static void main(String[] args) {

        // Crear empresa
        Empresa empresa = new Empresa("CIF12345", "Mi empresa");

        // Añadir dos analistas
        empresa.addTrabajador(new Analista("23212321P", "Pepito", 2800, "Ingeniero de caminos"));
        empresa.addTrabajador(new Analista("23212321P", "Pepita", 2900, "Ingeniero de avenidas"));

        // Añadir dos programadores
        empresa.addTrabajador(new Programador("32072819E", "Pablo", 3000, "DAM online"));
        empresa.addTrabajador(new Programador("32072455C", "Sofi", 10000, "Conejita"));

        // Añadir dos administrativos
        empresa.addTrabajador(new Administrativo("34334234P", "Juanito", 800, 6));
        empresa.addTrabajador(new Administrativo("45345346J", "Juanita", 1000, 2));

        // Añadir dos auxiliares
        empresa.addTrabajador(new Auxiliar("3234348U", "Joselin", 3000, 1));
        empresa.addTrabajador(new Auxiliar("4343548U", "Joselina", 3056, 4));

        for (Trabajador t : empresa.getTrabajadores()) {
            System.out.println(t);

        }

    }

}
