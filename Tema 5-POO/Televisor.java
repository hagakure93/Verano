public class Televisor {
    private int canal; // Al ser ámbito private , solo se podrá acceder a través de los métodos de la
                       // clase Televisor, vamos los métodos que están aquí

    // constructor por defecto sin parámetros
    public Televisor() {
    }

    // constructor con un parámentro
    public Televisor(int n) {
        setCanal(n);
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
        if (valorCanal < 1)
            canal = 1;
        else if (valorCanal > 99)
            canal = 99;
        else
            canal = valorCanal;

    }

}
