public class Punto {
    public int x;
    public int y;
    

    public Punto(int a) {
        x = a;
        y = a;
       
    }

    public Punto(int a, int b) {
        x = a;
        y = b;
        
    }

    public double calcularDistanciaCentro() {
        return Math.sqrt((x * x) + (y * y));
    }

    private void mostrarDatos1(){
        System.out.println("X="+x);
        System.out.println("Y="+y);
        System.out.println("La distancia de el centro es: "+calcularDistanciaCentro());
        System.out.println("--------------------------------");

    }

    public void mostrarDatos2 (String s){
        System.out.println(s);
        mostrarDatos1();
    }

}
