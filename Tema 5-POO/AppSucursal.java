
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class AppSucursal {

    private static Scanner introducirDatos = new Scanner(System.in);
    private static Cuenta cuentaActiva = null;
    private static int contadorCuenta = 1;

    public static void main(String[] args) {

        int opcion = 0;
        while (opcion != 4) {
            menuPrincipal();
            opcion = introducirDatos.nextInt();
            switch (opcion) {
                case 1 -> crearCliente();
                case 2 -> crearCuenta();
                case 3 -> seleccionarCuenta(); // todavía no se ha creado el método
                case 4 -> System.out.println("Fin del programa");

                default -> System.out.println("Opción no válida, selecciona una opción entre 1 y 4");
            }
        }
    }

    // Arraylist de cuentas y de clientes
    private static ArrayList<Cuenta> listadoCuentas = new ArrayList<>();
    private static ArrayList<Cliente> listadoClientes = new ArrayList<>();

    //////////////////////////////////////////
    // MÉTODOS //
    //////////////////////////////////////////

    public static void crearCliente() {
        introducirDatos.nextLine();

        System.out.println("Introduce nombre del cliente");
        String nombre = introducirDatos.nextLine();

        System.out.println("Introduce Apellidos del cliente");
        String apellidos = introducirDatos.nextLine();

        System.out.println("Introduce la localidad del cliente");
        String localidad = introducirDatos.nextLine();

        System.out.println("Introduce la fecha de nacimiento del cliente (AAAA-MM-DD)");
        String fecha = introducirDatos.nextLine();

        Cliente nuevoCliente = new Cliente(nombre, apellidos, apellidos, localidad,
                LocalDate.parse(fecha));
        listadoClientes.add(nuevoCliente);

    }

    public static void crearCuenta() {
        if (listadoClientes.isEmpty()) {
            System.out.println("Registra el cliente antes de crear la cuenta.");

        }

        String nombre;
        Cliente cliente;
        do {
            System.out.println("Dime el nombre del cliente al que quieres abrirle una cuenta");
            for (Cliente c : listadoClientes) {
                System.out.println(c.getNombre());
            }
            nombre = introducirDatos.nextLine();
            cliente = validarCliente(nombre);

        } while (listadoClientes == null);
        listadoCuentas.add(new Cuenta(contadorCuenta++, 0, cliente));

    }

    static Cliente validarCliente(String nombre) {
        for (Cliente cliente : listadoClientes) {
            if (cliente.getNombre().equals(nombre)) {
                return cliente;
            }

        }
        return null;
    }

    static void seleccionarCuenta() {
        if (listadoCuentas.isEmpty()) {
            System.out.println("No hay ninguna cuenta en la sucursal, primero debe crear una");

        }
        int numCuenta;
        do {
            System.out.println("Selecciona un numero de cuenta");
            for (Cuenta c : listadoCuentas) {
                System.out.println(c.toString());
            }
            numCuenta = introducirDatos.nextInt();

        } while (!validarCuenta(numCuenta));

        seleccionarOpcionCuenta();

    }
    // Me va a dar problemas aquí porque quiero que CuentaACtiva sea igual a c

    static boolean validarCuenta(int numCuenta) {
        for (Cuenta c : listadoCuentas) {
            if (c.getNumeroCuenta() == numCuenta) {
                cuentaActiva = c;
                return true;
            }

        }
        return false;
    }

    static void seleccionarOpcionCuenta() {

        int opcionCuenta = 0;
        while (opcionCuenta != 4) {
            menuCuenta();
            opcionCuenta = introducirDatos.nextInt();
            switch (opcionCuenta) {
                case 1:
                    System.out.println("Introduce la cantidad que quieres ingresar");
                    double cantidadIngreso = introducirDatos.nextDouble();
                    cuentaActiva.ingreso(cantidadIngreso); // Si no funciona crea los métodos aquí
                    break;
                case 2:
                    System.out.println("Introduce la cantidad que quieres retirar");
                    double cantidadRetiro = introducirDatos.nextDouble();
                    cuentaActiva.retiro(cantidadRetiro);
                    break;
                case 3:
                    cuentaActiva.verDatos();
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal");

                default:
                    System.out.println("Opción no válida");
                    break;
            }

        }
    }

    static void menuCuenta() {
        String s = """
                MENÚ PRINCIPAL
                1 - Ingresar
                2 - Retirar
                3 - Ver datos de la cuenta
                4 - Volver al menú principal

                """;
        System.out.println(s);
    }

    static void menuPrincipal() {
        String s = """

                MENÚ CUENTA
                1 - Crear Cliente
                2 - Crear Cuenta
                3 - Mantenimiento Cuenta
                4 - Salir

                """;
        System.out.println(s);
    }

    public void mantenimientoCuenta() {

    }

    public void salir() {

    }

}
