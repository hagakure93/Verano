import java.util.HashSet;
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

        System.out.println(nums);
        System.out.println(nums.contains(1));

    }
}
