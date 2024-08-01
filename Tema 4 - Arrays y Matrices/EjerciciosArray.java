public class EjerciciosArray {
    public static void main(String[] args) {
        int[] array = { 1, 34, 53, 66, 89, 66, 78, 23, 66, 88, 78, 0, 12, 21, 12 }; // aquí he dado los valores al array
        cantidadVeces(array, 78); // invoco el metodo y paso un array antes definido y un entero

        String[] palabras = { "a", "aa", "aaa", "bbb", "esta es la cadena más larga" };
        System.out.println("La string más larga es: " + cadenaMasLarga(palabras));

    }

    static void cantidadVeces(int[] array, int numero) { // metodo pidiendo un array de enteros y un entero

        int contador = 0; // veces que aparece?... crea un contador
        for (int i = 0; i < array.length; i++) { // recorro el array
            if (array[i] == numero) // cada vez que aparezca dicho numero aumento contador
                contador++;
        }
        if (contador == 0)
            System.out.println("El valor " + numero + " no aparece en el Array");
        else
            System.out.println("El numero " + numero + " aparece " + contador + (contador == 1 ? " vez" : " veces")
                    + " en el array.");
        // hice una ternaria porque soy super listo
    }

    static String cadenaMasLarga(String[] cadena) {
        String palabraMax = "";

        for (String cadena1 : cadena) {
            if (cadena1.length() > palabraMax.length()) {
                palabraMax = cadena1;
            }
        }
        return palabraMax;
    }

}
