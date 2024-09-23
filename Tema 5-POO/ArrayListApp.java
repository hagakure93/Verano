
import java.util.ArrayList;

public class ArrayListApp {
    public static void main(String[] args) {
        // Hemos creado un ArrayList vacio y 4 instancias de la clase Punto
        ArrayList<Punto> puntos = new ArrayList<>();
        Punto p1 = new Punto(1, 2, "p1");
        Punto p2 = new Punto(1, "p2");
        Punto p3 = new Punto(1, 3, "p3");
        Punto p4 = new Punto(3, 3, "p4");
        // Con esto añadimos dichas instancias al Arraylist
        puntos.add(p1);
        puntos.add(p2);
        puntos.add(p3);
        // También se pueden añadir así directamente, me gusta más
        puntos.add(new Punto(2, 3, "autopunto"));
        // Aquí añadimos el p4 en la posicion 1
        puntos.add(1, p4);
        System.out.println(puntos.toString());

    }

}
