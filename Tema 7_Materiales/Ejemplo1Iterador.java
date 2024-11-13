
import java.util.ArrayList;
import java.util.Iterator;

public class Ejemplo1Iterador {

    public static void main(String[] args) {
        // Creo un ArrayList de clientes y añado unos cuantos
        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Pepe Garcia");
        clientes.add("Toni Perez");
        clientes.add("Marta Gómez");
        clientes.add("Sara Martinez");
        //Creo un Iterator de Strings y le paso el ArrayList de clientes
        Iterator<String> clienteIterator = clientes.iterator();
        while (clienteIterator.hasNext()) {
            String cliente = clienteIterator.next();
            if (cliente.equals("Toni Perez"))
                clienteIterator.remove();
            System.out.println(cliente);
        }
        // Aunque en el while haya eliminado un cliente, no saldrá en pantalla, hay que imprimirlo de nuevo
        System.out.println(clientes);
    }

}
