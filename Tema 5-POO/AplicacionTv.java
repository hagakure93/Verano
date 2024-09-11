public class AplicacionTv {

    public static void main(String[] args) {
        // Desde aquí lo único que hago es llamar a los métodos creados en la clase
        // Televisor
        Televisor tv1 = new Televisor();
        Televisor tv2 = new Televisor(100);
        tv1.setCanal(47);
        System.out.println("Tv1 canal " + tv1.getCanal());
        System.out.println("Tv2 canal " + tv2.getCanal());

        tv1.subirCanal();
        tv2.subirCanal();

        System.out.println("Tv1 canal " + tv1.getCanal());
        System.out.println("Tv2 canal " + tv2.getCanal());

    }

}
