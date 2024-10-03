public class Hija extends Padre {
    
    int edad;
    
    public Hija(int edad, String padre, String hija) {
        super(padre);
        this.nombre = hija;
        this.edad = edad;
        System.out.println(" tiene una hija de " + edad + " años");
    }
    //Método mostrar info de la clase hija
    public void mostrarInfoHija() {

        System.out.println("Hija: " + nombre + ", edad: " + edad + " años");
        super.mostrarInfo(); // Aquí llama al método mostrar info de la clase Padre, a través del super
    }

   
}
