

public class Matemáticas {

    public static void main(String[] args) {

        // cuidado con los paréntesis
        
        int n = 2 , m = 4;
        int radio = (int) (Math.random()*11);// si quiero que sea un numero aleatorio entre 0 y 10 por ejm, *10
        double resultado = Math.pow(n, m);  // n elevado a m
        double area = Math.PI*(Math.pow(radio,2));

        System.out.println("\nEl radio random es: "+radio);

        System.out.println("\nSi elevamos "+n+" a "+m+ " el resultado es "+(int)resultado); 
        // eso de (int) convierte el resultado de esa variable double a entero

        double raiz = Math.sqrt(resultado);
        System.out.println("\nLa raiz cuadrada de "+resultado+" es "+(int)raiz);

        System.out.println("\nEl área randomizada es "+area);
        System.out.println("\nEl área redondeada es :" + Math.round(area)); // la \n en rojo no es que esté mal
        System.out.println("\nEl área por arriba es "+ Math.ceil(area)); // el casting es para que me de un entero pero no mola
        System.out.println("\nEl área por abajo es "+Math.floor(area));




    }
    
}
