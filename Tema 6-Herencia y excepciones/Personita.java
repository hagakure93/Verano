public class Personita {
    private final String nombre;
    private final int edad;

    public Personita(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
    }
    public String toString(){
        return "Nombre:" +nombre+" Edad: "+edad;
    }
}
