public class Padre {

    String nombre;

    public Padre(String nombre){
        this.nombre = nombre;
        System.out.print(nombre);
    }

    public void mostrarInfo(){
        System.out.println("Padre: "+nombre);
    }
    
}
