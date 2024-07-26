public class TriangRecursivas {

    static void filaTriangulo(int n) {
        if (n > 0) {
            System.out.print("* ");
            filaTriangulo(n - 1);
        } else
            System.out.println();
    }
    /**
     * Cuando n vale 0 , se desapila la llamada y n vuelve a valer 1 , pero metodo triángulo
     * ya ha terminado y pasa a método filaTriangulo
     * @param n
     */
    static void triangulo(int n) {
        if (n > 0) {
            triangulo(n - 1);   
            filaTriangulo(n);
        }
    }

    public static void main(String[] args) {
        triangulo(3);
    }

}
