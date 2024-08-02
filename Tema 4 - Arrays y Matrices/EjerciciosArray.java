public class EjerciciosArray {
    public static void main(String[] args) {
        int[] array = { 1, 34, 53, 66, 89, 66, 78, 23, 66, 88, 78, 0, 12, 21, 12 }; // aquí he dado los valores al array
        cantidadVeces(array, 78); // invoco el metodo y paso un array antes definido y un entero

        String[] palabras = { "a", "aa", "Aaa", "bbb", "esta es la cadena más larga" };
        System.out.println("La string más larga es: \"" + cadenaMasLarga(palabras) + "\"");
        int[] array1 = {1,2,3,4,1,13,8};
        int[] array2 = {8,1,5,2,7,9,1};

        
        ejercicio3(palabras, 'a');
        mostrarArray(comparaArray(array1, array2));

    }

    static int[] comparaArray(int[] array1, int[]array2){

        int[] c;
        if (array1.length > array2.length)
            c = new int[array2.length];
        else
            c = new int[array1.length];

        for (int i = 0; i < c.length; i++) {  //compara lo que mida el array más pequeño 
            if (array1[i] > array2[i])
                c[i] = array1[i];
            else
                c[i] = array2[i];
        }
        return c;


    }

    static void mostrarArray(int[] m){
        for (int i = 0; i < m.length; i++) {
            System.out.print("["+m[i]+"]");
            
        }
        System.out.println();
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

    static String cadenaMasLarga(String[] cadena) { // metodo devuelve una String , pidiendo una array de Strings.
        String palabraMax = ""; // aquí vamos guardando la palabra que sea más larga en cada vuelta

        for (String cadena1 : cadena) { // bucle for each , como una ternaria con el if/else , pero para bucles for
            if (cadena1.length() > palabraMax.length()) { // compara cada palabra del array con la anterior en cada
                                                          // pasada
                palabraMax = cadena1; // si la nueva palabra es más larga , la asigna a palabraMax
            }
        }
        return palabraMax;

    }

    static void ejercicio3(String[] cadenaPalabras, char letra) {

        for (int i = 0; i < cadenaPalabras.length; i++) {
            if (cadenaPalabras[i].toLowerCase().charAt(0) == Character.toLowerCase(letra))
                System.out.println(cadenaPalabras[i]);

        }
    }

}
