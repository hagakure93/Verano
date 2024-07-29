public class RecursividadExe {

    public static void main(String[] args) {

        final int NUM = 1349;  // Esto es una variable global
        System.out.println(NUM + " tiene " + digitos(NUM) + " dígito" + (digitos(NUM) > 1 ? "s." : "."));

    }

    static int digitos(int n) { // al dividir entre 10 quito el último dígito

        if (n == 0)
            return 0;
        else
            return 1 + digitos(n / 10);

    }

    






}
