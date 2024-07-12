
public class BreakContinue {

    public static void main(String[] args) {

        System.out.println("Empezamos...");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Vuelta: " + i);
            if (i == 8) {    // Cuidado con los CORCHETES EN IF...
                break; // directamente sale del bucle
            }
            System.out.println("Terminada vuelta: " + i);
        }
        System.out.println("Terminado");
    
        for (int i = 1; i <= 8; i++) {    // el break salir(etiqueta) 
            System.out.println("Vuelta en nuevo bucle: "+i);
            salir:
            if (i==5){
                i++;
                break salir;   
            }
        }
    
        System.out.println("Fin del nuevo bucle");
    
    
    
    
    }
}
