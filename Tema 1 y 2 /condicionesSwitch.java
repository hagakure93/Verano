
public class condicionesSwitch {

    public static void main(String[] args) {

        int x = 10;   // también se podrían usar char 'A' por ejemplo y con strings

        switch (x) {
            case 1, 2, 3 ->
                System.out.println("El valor de x estaba entre 1 y");
            case 4, 5 ->
                System.out.println("El valor de x era 4 o 5");
            case 6 -> {             // aquí usa corchetes porque hay más de una instrucción , si no , no hace falta.
                System.out.println("El valor de x era 6");
                x = 10;
                System.out.println("Operaciones auxiliares completadas");
                System.out.println("x ahora vale " + x);
            }
            default ->
                System.out.println("El valor de x no estaba entre 1 y 6");

        }

    }

}
