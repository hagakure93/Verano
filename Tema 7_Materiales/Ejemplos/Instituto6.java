
import java.util.LinkedList;

public class Instituto6 {
    public static void main(String[] args) {
        LinkedList<Alumno> dam = new LinkedList<>();

        //Métodos intarface COllecion
        dam.add(new Alumno("Paquito", "345453", 16));
        dam.add(new Alumno("Antonia", "454623", 15));
        dam.add(new Alumno("Maria", "919283", 20));
        dam.add(new Alumno("Josedeodo", "666004", 24));

        //Métodos interface List
        dam.set(2, new Alumno("Ana","77766",20));
        dam.set(2, new Alumno("Bil", "605930", 90));

        //Métodos interfaces Queue y Deque
        dam.pollFirst();
        dam.pollLast();
        dam.offerFirst(new Alumno("Jud", "6539400", 49));
        dam.offerLast(new Alumno("Kimyonum", "563453", 55));
        // Muestran por pantalla y eliminan, a partir de ahí ya no están en la List
        System.out.println(dam.removeFirst()); 
        System.out.println(dam.removeLast());

        System.out.println(dam);

        // contains() serviría para comprobar que un elemento está en la list

    }
}
