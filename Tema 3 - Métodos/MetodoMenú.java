
import java.util.Scanner;

public class MetodoMenú {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Pulsa 0 para ir al menú");
            int pulsar = entrada.nextInt();
            if (pulsar == 0) {
                menu();
                int direccion = entrada.nextInt();
                
                
                switch (direccion) {
                    case 1 -> juegos();
                    case 2 -> musica();
                    case 3 -> cine();
                    default -> adios();
                }
                
            }
        }

    }

    static void menu() {
        System.out.println("Pulsa 1 para ir a juegos , 2 para música , 3 cine y 0 para salir");
    }

    static void musica() {
        System.out.println("Qué canción quieres escuchar?");
    }

    static void juegos() {
        System.out.println("A qué juego quieres jugar?");
    }

    static void cine() {
        System.out.println("Qué película quieres ver?");
    }

    static void adios() {
        System.out.println("Hasta otra");
    }

}
