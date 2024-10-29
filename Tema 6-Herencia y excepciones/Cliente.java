public class Cliente {
    String nombre;

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

    public Cliente(String nombre){
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
