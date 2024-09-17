public class ApliPunto {

    public static void main(String[] args) {
        

        Punto p1 = new Punto(2);
        Punto p2 = new Punto(1, 3);
        Punto p3 = new Punto(1);

        p1.mostrarDatos2("Este es Punto 1");
        p2.mostrarDatos2("Este es Punto 2");
        p3.mostrarDatos2("Este es Punto 3");

        p1.toString();
    }
    
}
