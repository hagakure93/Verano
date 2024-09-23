public class Punto {

    private static int puntos = 0;

    private int x;
    private int y;
    private String nombre;
    /*El override es porque todos los objetos ya tienen la funcion toString
     * así que lo que hace es sobreescribirlo para este objeto en concreto
     */
    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + ", nombre=" + nombre + "]";
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
        puntos += 2;
    }

    /**
     * Este constructor está auto generado con la bombillita , es útil
     * 
     * @param x
     * @param y
     * @param nombre
     */
    public Punto(int x, int y, String nombre) {
        this.x = x;
        this.y = y;
        this.nombre = nombre;
        puntos++;
    }

    public Punto(int x, String n) {
        // El This se usa para señalar que es un atributo de la instancia , el declarado
        // en la clase
        this.x = x;
        this.y = x;
        puntos += 3;
        this.nombre = n;
        // En estos casos , hemos asignado el valor de x(recibido como parámetro) a
        // this.x (de la instancia)

    }

    public double calcularDistanciaCentro() {
        return Math.sqrt((x * x) + (y * y));
    }

    public void mostrarDatos1() {
        System.out.println("X=" + x);
        System.out.println("Y=" + y);
        System.out.println("La distancia de el centro es: " + calcularDistanciaCentro());

        System.out.println("--------------------------------");

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void getPuntos() {
        System.out.println("Puntos = " + puntos);
    }

   

}
