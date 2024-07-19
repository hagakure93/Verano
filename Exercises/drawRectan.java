
import java.util.Scanner;

/*Dibuja un rectángulo formado por asteriscos
 * se debe pedir la base y la altura por teclado
 * además añade código adicional para que los dibuje sin relleno
 * ejemplo para entrada: base 10 , altura 5
 * salida: + + + + + + + + + +
 *         + + + + + + + + + +
 *         + + + + + + + + + +
 *         + + + + + + + + + +
 *         + + + + + + + + + +
 * 
 *         + + + + + + + + + + 
 *         +                 +
 *         +                 +
 *         +                 +
 *         + + + + + + + + + +        
 */
public class drawRectan {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Introduce la base del rectángulo");
            int base = entrada.nextInt();   // Recuerda que elcodigo lee de arriba a abajo
            System.out.println("Ahora introduce la altura del rectángulo");
            int altura = entrada.nextInt();
            
            for (int i = 1; i <= altura; i++) {    // esto determinará las filas , cuantas filas?
                for (int j = 1; j <= base; j++) {   // esto es lo que va pintando , hasta el salto de linea
                    System.out.print("* ");
                }
                System.out.println();
                
            }
            System.out.println();

            // sin relleno
            for (int i = 0; i < altura; i++) {  //cuantas filas?
                for (int j = 0; j < base; j++) {    // altura -1 es la última vuelta de altura
                    // primera fila ,ult fila     prim columna, ult columna
                    if(i == 0 || i == altura - 1 || j == 0 || j == base-1) System.out.print("* ");
                    else System.out.print("  ");
                }
                System.out.println();  // para cambiar de linea al terminar bucle interno
            }
        }
    }  

}
