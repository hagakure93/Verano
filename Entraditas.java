import java.util.Scanner;

public class Entraditas {

    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in) 
        ) {
            String nombre;
            int n;
            System.out.print("Introduzca un número entero: ");
            n = entrada.nextInt();  // El import aparece cuando pongo el nextInt()
            entrada.nextLine(); // se usa un nextLine para borrar el intro del buffer
            System.out.println("El cuadrado es: " + Math.pow(n,2));
            System.out.print("Introduzca su nombre: ");
            nombre = entrada.nextLine();  //leemos correctamente la String
            System.out.println("Hola " + nombre + "!!");
            // Primero se hace un nextInt y luego un nextline para limpiar el buffer
        }
    }
    
}
