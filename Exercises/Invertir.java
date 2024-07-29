public class Invertir {
    public static void main(String[] args) {
        int NUM= 1349;
        invertir(NUM);

    }

    static void invertir(int n) {

        if (n >= 0 && n < 10) // el caso base , la posibilidad más sencilla
            System.out.println(n);

        else {
            System.out.print(n % 10); // esto imprime el último número
            invertir(n / 10); // y esto quita ese último número ya impreso
        }

    }

}
