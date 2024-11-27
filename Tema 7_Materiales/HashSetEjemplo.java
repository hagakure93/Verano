import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetEjemplo {
    public static void main(String[] args) {
        /*
         * Al indicar el tipo de la colección, si es un tipo primitivo como un int,
         * debemos poner
         * la clase envoltura (Integer,Double...). O cualquier clase que hayamos creado
         * puede ser utilizada
         * como por ejemplo la clase Persona.
         */
        Set<Integer> nums = new HashSet<>();
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println("Esto es con el HashSet, por lo que no se pueden repetir");
        System.out.println(nums);
        System.out.println(nums.contains(1));

        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(8);
        numeros.add(2);
        numeros.add(3);
        numeros.add(3);
        numeros.add(5);
        numeros.add(4);

        System.out.println("Y esto un ArrayList, por lo que se la pela que se repitan");
        System.out.println(numeros);

        // Si hiciese un hashHset de Strings---->
        /*
         * No los ordena porque son objetos y no tiene ninguna referencia, además, no se
         * pueden borrar
         * con un nombre.remove(2) por este motivo, habría que borrarlo con
         * nombres.remove("Tom")
         * Además , recuerda que la clase Set no implementa el método Get
         * para comprobar tendríamos que usar el método contains
         * 
         */
        System.out.println("Ahora lo siguiente es un HashSet de la clase objeto Alumno");
         Set<Alumno> dam = new HashSet<>();
         dam.add(new Alumno("Pep", "222A", 25));
         dam.add(new Alumno("Sam", "333B", 30));
         dam.add(new Alumno("Pablo", "444C", 32));

         Iterator<Alumno> iteratorAlumnos = dam.iterator();
         while(iteratorAlumnos.hasNext()){
            System.out.println(iteratorAlumnos.next().getNombre());
         }



    }
}
