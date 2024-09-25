import java.util.ArrayList;

public final class objetoInmutable3 {

    private final ArrayList<Punto> listaPuntos;

    public objetoInmutable3(ArrayList<Punto> listaPuntos) {
        this.listaPuntos = obtenerCopia(listaPuntos);
    }

    public ArrayList<Punto> getListaPuntos() {
        return obtenerCopia(listaPuntos);
    }

    private ArrayList<Punto> obtenerCopia(ArrayList<Punto> lista) {
        // Esto es un deep copy
        ArrayList<Punto> copia = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            copia.add(new Punto(lista.get(i).getX(), lista.get(i).getY()));
        }
        return copia;
    }
}
