
import java.time.LocalDate;

public class AppCuentas {


   public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Pablo", "Martinez", "C/Martinete", "Madrid", LocalDate.of(1993, 01, 02));

        Cliente cliente2 = new Cliente("Sofi", "Fernandez", "/Madriguera", "Barcelona", LocalDate.of(1995, 12, 13));

        Cuenta cuenta1 = new Cuenta(111, 1000, cliente1);
        Cuenta cuenta2 = new Cuenta(222, 2000, cliente2);
        
        cuenta1.ingreso(100);
        cuenta1.ingreso(500);
        cuenta1.retiro(50);

        cuenta2.ingreso(1000);
        cuenta2.ingreso(2000);
        cuenta2.retiro(50);

        cuenta1.verDatos();
        cuenta2.verDatos();
       



    }

}
