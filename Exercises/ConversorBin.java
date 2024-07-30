public class ConversorBin {
    public static void main(String[] args) {

        final int NUM = 15;
        System.out.println("El número " + NUM + " en binario es: " + convertir(NUM));
        imprimirBin(NUM);

    }

    static int convertir(int n) {

        if (n == 0 || n == 1) // caso base
            return n;
        else
            // modulo 2 saca el binario , es una fumada
            return n % 2 + 10 * convertir(n / 2);
    }

    // otra forma más sencilla

    static void imprimirBin(int n) {

        if (n == 0 || n == 1)
            System.out.print(n);
        else {
            imprimirBin(n / 2);
            System.out.print(n % 2);
        }

    }
}
