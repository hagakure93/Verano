
import java.util.ArrayList;

public class GraficoLineas2D {

    private ArrayList<Punto> puntos;

    public GraficoLineas2D() {
        this.puntos = new ArrayList<>();
    }

    public boolean esPositivo(Punto p) {
        return p.getX() >= 0 && p.getY() >= 0;
    }

    public void eliminarPunto(Punto p) {
        if (!puntos.isEmpty()) { // Si NO está vacio
            puntos.remove(puntos.size() - 1); // Elimina el último elemento
            System.out.println("Punto eliminado correctamente");

        } else
            System.out.println("No se ha podido eliminar el punto, lista vacia");
    }

    public void agregarPunto(Punto p) {
        // SI la lista está vacía, agregamos el primer punto
        if (puntos.isEmpty()) {
            puntos.add(p);
            System.out.println("Punto agregado correctamente");
            return;
        }
        // SI ya hay otro punto
        Punto anterior = puntos.get(puntos.size() - 1);

        if (esPositivo(p) && Punto.distintos(p, anterior) && p.getX() >= anterior.getX()) {
            puntos.add(p);
            System.out.println("Punto agregado correctamente");
        } else
            System.out.println("ERROR: no se ha podido agregar el punto");

    }
}
