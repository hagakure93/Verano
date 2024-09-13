public class AplicacionTv {

    public static void main(String[] args) {
        // Desde aquí lo único que hago es llamar a los métodos creados en la clase
        // Televisor
        Televisor tv1 = new Televisor();
        Televisor tv2 = new Televisor();
        Televisor tv3 = new Televisor();
        
        tv1.subirCanal();
        tv1.subirCanal();
        tv1.subirVolumen();

        tv2.bajarCanal();
        tv2.bajarCanal();
        tv2.subirVolumen();

        tv3.subirCanal();
        tv3.bajarVolumen();

        tv1.mostrarDatos("TV1");
        tv2.mostrarDatos("TV2");
        tv3.mostrarDatos("TV3");

        

        
    }

}
