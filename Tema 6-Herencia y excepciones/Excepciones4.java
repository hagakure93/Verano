public class Excepciones4 {
    static void dividir(int n, int m) throws ArithmeticException {
        try {
            if (m == 0)
                throw new ArithmeticException(); // Lanzamos la excepción
            else
                System.out.println(n + "/" + m + "=" + (n / m));

        } catch (ArithmeticException e) {
            System.out.println("Capturando excepción dentro de un método");
        }
    }

    public static void main(String[] args) {
        try {
            dividir(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("Capturando excepción en el menú");
        }
    }

}
