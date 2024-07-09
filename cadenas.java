public class cadenas {
    public static void main(String[] args) {
        String cadena = "      Curso de programación en Java          ".trim();
        int longitudTexto = cadena.length();
        char letraFinal = cadena.charAt(cadena.length()-1);
        String cadenaMayusculas = cadena.toUpperCase();
        String palabra = cadena.substring(0, 5);

        System.out.println("["+cadena +"] tiene "+longitudTexto+" letras ");
        System.out.println(" La letra final es "+cadena.charAt(cadena.length()-1));
        System.out.println(" vamos que es "+ letraFinal);
        System.out.println(" En masyusculas sería " + cadenaMayusculas);
        System.out.println("La primera palabra es ["+palabra+"]") ;
        
        
    }    
}

// Los parentesis despues del length es por si añado parámetros a la función , pero no tiene por qué haber nada
// en el charAt la primera letra seria el 0 (index:0)

// SUBSTRING(int desde, int hasta) varias letras a partir de una posición dada
// TRIM elimina los espacios del final y del principio
//starWith/endWith(string subcadena) te devuelve un booleano de si termina con una letra o no
// compareTo compara la cadena y la ordena.
