public class métodoSuma {
    public static void main(String[] args) {
        mostrarSumaDecreciente(4);
        mostrarSumaCreciente(4);

    }

    static void mostrarSumaDecreciente(int n) {

        sumaDecreciente(n, 0);
    }

    static void mostrarSumaCreciente(int n) {
        sumaCreciente(1, n, 0);
    }

    static void sumaDecreciente(int n, int total) {
        if (n == 1)
            System.out.println(1 + "=" + (total + 1));
        else {
            System.out.print(n + "+"); // va imprimiendo el valor de n
            total += n; // guarda en la variable total el valor de las sumas
            sumaDecreciente(n - 1, total); // va reduciendo el numero

        }

    }

    // igual pero de forma creciente , me parece más sencillo
    static void sumaCreciente(int contador, int n, int total) {

        if (contador <= n) {

            System.out.print(contador + "+");
            total += contador;
            contador++;
            sumaCreciente(contador, n, total);

        } else {
            System.out.println("\b=" + total);
        }
    }

}
