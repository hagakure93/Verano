public class esBinario {
    public static void main(String[] args) {

        final int NUM = 2010101;
        if (esBin(NUM))
            System.out.println("Es binario");
        else
            System.out.println("No es binario");

    }

    static boolean esBin(int n) {
        // Base case, si n está entre 0 y 9
        if (n >= 0 && n < 10) {

            return n == 0 || n == 1;
        }
        // Caso general , es 10 o más
        if (n % 10 == 0 || n % 10 == 1)
            return esBin(n / 10); // n%10 checkea el último digit y n/10 reduce
        return false;
    }

}
