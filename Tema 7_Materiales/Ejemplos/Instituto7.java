
import java.util.HashSet;
import java.util.Set;

public class Instituto7 {

    public static void main(String[] args) {

        Set<Alumno> dam = new HashSet<>();
        Alumno a1 = new Alumno("Samuel", "666A", 33);
        Alumno a2 = new Alumno("Antonio", "333H", 40);
        Alumno a3 = new Alumno("Joselito", "666A", 23);

        dam.add(a1);
        dam.add(a2);
        dam.add(a3);

        dam.add(a1);

        dam.add(new Alumno("Sam", "666A", 18));
        for (Alumno a : dam) {
            System.out.println(a);
        }


    }

}
