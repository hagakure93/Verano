
import java.util.ArrayList;

public class AppClientes {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Pepe"));
        clientes.add(new Cliente("Tom"));
        clientes.add(new Cliente("Kal"));

        try {
            nuevoCliente("Tom", clientes);
            nuevoCliente("Eddie", clientes);

        } catch (ClienteExisteException e) {
            System.out.println("ERROR: "+e);
        }
        System.out.println(clientes);
        
    }

    public static void nuevoCliente(String nombre, ArrayList<Cliente> clientes) throws ClienteExisteException {
        for (Cliente c : clientes) {
            if (c.getNombre().equals(nombre))
                throw new ClienteExisteException(c);
        }
        clientes.add(new Cliente(nombre));
        System.out.println("Cliente dado de alta correctamente");
    }

}
