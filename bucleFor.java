import java.util.Scanner;

public class bucleFor {
    public static void main(String[] args) {
        double media = 0; // las variables en minúscula 
        try (Scanner entrada = new Scanner(System.in)) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Dime un número ");
                int num = entrada.nextInt();  // El import aparece cuando pongo el nextInt
                System.out.println("El primer número introducido es: "+i);
                media = media += num;
                
            }
            System.out.println("La media de los cinco números introducidos es: "+media/5);
        }
    }
    
}
