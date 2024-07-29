public class Potencia {
    public static void main(String[] args) {
        final int BASE = 2;
        final int EXP = 4;
        System.out.println("El número " + BASE + " elevado a " + EXP + " es: " + potencia(BASE, EXP));

    }

    static int potencia(int base, int exp) {
        if (exp == 0)
            return 1;
        else
            return base * potencia(base, --exp);

    }

}
