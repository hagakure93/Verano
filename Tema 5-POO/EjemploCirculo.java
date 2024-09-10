public class EjemploCirculo {

    public static void main(String[] args) {
        // Crear instancias de la clase Circulo
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(100);

        c1.setRadio(35);
        c1.mostrarDatos();

        c2.setCentroX(50);
        c2.setCentroY(50);
        c2.setRadio(15);
        c2.mostrarDatos(); // cuidado con el orden de los métodos

    }

}
