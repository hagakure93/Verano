import java.util.Random;

public class ArrayPuntos {
    public static void main(String[] args) {
        // Crea un objeto tipo random
        Random r = new Random();
        // Crea un array de la "clase Punto" , llamado puntos y con un tamaño de 5
        Punto[] puntos = new Punto[5];
        // Recorre el array y asigna un entero aleatorio a cada uno de ellos
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = new Punto(r.nextInt(100), r.nextInt(100));
            puntos[i].mostrarDatos1();
        }
        // obtenemos la distancia del punto más lejano del centro(0,0)
        double max = 0;
        for (Punto punto : puntos) {
            if (max < punto.calcularDistanciaCentro()) {
                max = punto.calcularDistanciaCentro();
            }
        }
        System.out.println("La distancia máxima del centro es " + max);
    }

}
