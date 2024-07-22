public class PasoPorValor {

    static int num2 = 2; // esto es una variable global , si no hubiese una local , se usaría esta
    public static void main(String[] args) {

        int num = 10;   // la variable original no cambia , se pasa una copia del valor
        int doble = doble(num); // en variable doble se guarda un 20 , pero num sigue siendo 10
        System.out.println("num= "+num+"  doble = "+doble);
        System.out.println(num2+" Esta es la variable global");
        

    }
    
    static int doble(int num) {  // aunque se llame num no es una variable , es un parámetro 
        num*=2;
        return num;  // si es void no pones return , pero en los demás si
    }
}
