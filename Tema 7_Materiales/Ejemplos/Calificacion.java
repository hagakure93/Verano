import java.util.ArrayList;

public class Calificacion {

    private final Modulo modulo;
    private final ArrayList<Double> notas;

    public Calificacion(Modulo modulo) {
        this.modulo = modulo;
        this.notas = new ArrayList<>();
    }

    public Modulo getModulo() {
        return modulo;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }
    
}