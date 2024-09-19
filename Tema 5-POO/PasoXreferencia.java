public class PasoXreferencia {

    public static void main(String[] args) {
        int num = 1;
        String nombre = "String inmutable";
        /*
         * Al modificar una String , realmente se crea una copia
         * y se guarda en otro espacio de memoria
         */
        Punto p1 = new Punto(1, 1);

        modificarPunto(p1);
        modificarEntero(num);
        modificarString(nombre);
        System.out.println("Punto.x = " + p1.getX()); // Punto.x = 999
        System.out.println("num = " + num); // num = 1
        System.out.println("nombre = " + nombre); // nombre = String inmutable
    }

    public static void modificarPunto(Punto p) { // un método que te modifica el objeto
        p.setX(999);
        Punto p2 = p;
        p2.setX(5);
        /*
         * resumen rápido. el molde real sería la clase. y cada vez que haces un
         * "new Loquesea" estás creando un objeto de esa clase (es decir, una instancia
         * de ese objeto
         * 
         * luego, si pasas cómo parámetro ese objeto "p" a una función (que lo que le
         * pasa
         * es la referencia), y dentro de la función haces un "p = new...." (o sea, una
         * nueva instancia), ahí sí reasignas la referencia para que apunte a ese nuevo
         * objeto. esto solo se aplica de forma local, dentro de la función. fuera, el
         * objeto original no cambia
         * 
         * Al modificar un objeto dentro de un método , se modifican tanto la referencia
         * como el objeto
         * ya que ambos apuntan al mismo espacio de memoria.
         */

    }

    public static void modificarEntero(int n) { // modifica el primitivo entero
        n = 999;
    }

    public static void modificarString(String s) { // modifica String que es un objeto inmutable
        s = "String modificada";
    }
}
