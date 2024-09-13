public class Televisor {
    private int canal; // Al ser ámbito private , solo se podrá acceder a través de los métodos de la
                       // clase Televisor, vamos los métodos que están aquí
    private int volumen;

    // constructor por defecto sin parámetros
    public Televisor() {
        canal = 1;
        volumen = 5;
    }

    // constructor con un parámentro
    public Televisor(int n) {
        setCanal(n);
        volumen = 5;
    }

    // MÉTODOS PARA SUBIR Y BAJAR CANAL/VOLUMEN y método para mostrar todas las
    // vainas

    public void mostrarDatos(String nombre) {
        System.out.println("La televisión " + nombre + ":");
        System.out.println("Canal actual = " + canal);
        System.out.println("Volumen actual = " + volumen);
        System.out.println("----------------------------------");
    }

    public void subirVolumen() {
        setVolumen(volumen + 1);
    }

    public void bajarVolumen() {
        setVolumen(volumen - 1);

    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int valorVolumen) {
        if (valorVolumen >= 0 && valorVolumen <= 15)
            volumen = valorVolumen;
        else if (valorVolumen < 0)
            volumen = 0;
        else if (valorVolumen > 15)
            volumen = 15;

    }

    public void subirCanal() {
        setCanal(canal + 1);

    }

    public void bajarCanal() {
        setCanal(canal - 1);

    }

    public int getCanal() {
        return canal;
    }

    public final void setCanal(int valorCanal) {
        if (valorCanal >= 0 && valorCanal <= 10)
            canal = valorCanal;
        else if (valorCanal < 0)
            canal = 10;
        else if (valorCanal > 10)
            canal = 0;

    }

}
