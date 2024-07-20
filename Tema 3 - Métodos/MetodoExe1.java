
import java.util.Scanner;

public class MetodoExe1 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Dime tu nombre");
            String nombre = entrada.nextLine();
            salu2(nombre);   // las variables aquí , no tienen nada que ver con las del método , son perímetros
        }

    }

    static void salu2(String nombre) {   //Aqui le he dado perímetros

        System.out.println("Yo te saludo " + nombre);

    }

}
