public class Bombilla {
    public static boolean interruptorGeneral = true;
    private boolean interruptor;

    public Bombilla() {
        interruptor = false;

    }

    public void enciende() {
        interruptor = true;
    }
    public static void apagarGeneral(){
        interruptorGeneral = false;
    }
    public static void encenderGeneral(){
        interruptorGeneral = true;
    }

    public void apaga() {
        interruptor = false;
    }

    public boolean estado() {
        return interruptorGeneral && interruptor;
    }
     /* La ternaria funcionaba así:
      * condicion ?  valor si es true : valor si es false
      */
    public String muestraEstado() {
        return estado() ? "Encendida" : "Apagada";
    }

}
