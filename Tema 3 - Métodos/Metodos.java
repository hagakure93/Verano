
public class Metodos {

    public static void main(String[] args) {

        int num1 = 2, num2 = 4;
        int num3 = suma(num1, num2); // invoca el método suma
        System.out.println(num3);
        System.out.println(areaCuadrado(3)); // invoca directo al metodo areaCuadrado
        prueba(); // esto también es invocar
        

    }

    static void prueba() {
        System.out.println("Prueba buena");
        
        
        // no hace falta poner return , pero puedes
    }

    static int suma(int a, int b) { // esto es un método

        return a + b;  // o poner una variable resultado = a+b y luego poner return resultado
    }

    static int areaCuadrado(int lado) {

        return lado * lado;

    }

}
