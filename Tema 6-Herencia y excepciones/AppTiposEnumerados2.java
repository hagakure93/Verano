import java.util.Arrays;
import java.util.Scanner;

public class AppTiposEnumerados2 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Dime un mes " + Arrays.toString(Mes.values()));
            String s = entrada.nextLine();
            Mes mesActual = Mes.valueOf(s); // s → deberá ser un tipo enumerado válido
            System.out.println(mesActual + " tiene " + mesActual.getDias() + " días");
        }
    }
}