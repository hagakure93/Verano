/**
 * Pruebas
 */
public class Pruebas {

    public static void main(String[] args) {
        int num1 = 0xff;
        byte num2 = (byte)0xff;
        String nombre = "Pepe";
        String apellidos = " Martinez García ";
        String nombreCompleto = (nombre + apellidos);
        char letra = apellidos.charAt(3);
        String cadena1 = nombreCompleto.substring(0,5);
        boolean iguales = nombre.equals(apellidos);
    

        //Para comparar variables tipo string se usa .equals , para números los operadores normales
        // También puedes usar .equalsIgnoreCase para que no importen las mayusculas


        System.out.println(iguales);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(nombreCompleto);
        System.out.println(letra);
        System.out.println(cadena1);
        
            
    }
}
// Cada variable tiene una cantidad de bits reservados , una mitad para valores positivos y otros para negativos y el cero , depende del tipo se alcanzará antes o después.

// charAt cuenta desde el 0 y te dice donde está un valor en una cadena , .length cuenta desde el 1 y dice el número de caracteres //