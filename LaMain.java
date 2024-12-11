public class LaMain {
    public static void main(String[] args) {
        Bombilla b1, b2;
        b1 = new Bombilla();
        b2 = new Bombilla();

        b1.enciende();
        System.out.println(b1.muestraEstado());
        b2.apaga();
        System.out.println(b2.muestraEstado());
        b2.enciende();
        


        Bombilla.apagarGeneral();
        Bombilla.encenderGeneral();

        

        System.out.println("b1 = " + b1.muestraEstado());
        System.out.println("b2 = " + b2.muestraEstado());

    }
    
}
