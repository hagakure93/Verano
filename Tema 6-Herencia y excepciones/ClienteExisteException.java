public class ClienteExisteException extends Exception {
    private final Cliente cliente;
    /*Esto es una excepción añadida por mi, en el try la añado y en el catch al poner el exception la reconocería
     * 
     */

    public ClienteExisteException(Cliente cliente){ //Constructor utilizado en throw
        this.cliente = cliente;
    }

    @Override
    public String toString(){
        return "El cliente de nombre "+this.cliente.getNombre()+" ya existe.";
    }
    
}
