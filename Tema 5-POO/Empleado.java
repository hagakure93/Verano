public class Empleado {

    /* VARIABLES DE LA CLASE */
    private String nombreComp;
    private int permanencia;
    private int salario;

    /* CONSTRUCTORES */
    public Empleado() {

    }

    public Empleado(String n, int p, int s) {
        this.nombreComp = n;
        this.permanencia = p;
        this.salario = s;
    }

    /* MÉTODOS */
    public void mostrarDatos() {
        System.out.println("\nNombre completo: " + getNombreComp());
        System.out.println("\nPermanencia: " + getPermanencia());
        System.out.println("\nSalario: " + getSalario());
        System.out.println();
        rank(permanencia);
        System.out.println("-------------------------------------------");
    }

    public void rank(int p) {

        if (p <= 3)
            System.out.println("Rango principiante");
        else if (p > 3 && p < 18)
            System.out.println("Rango intermedio");

        else if (p >= 18)
            System.out.println("Rango senior");

    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int porcentaje) {
        this.salario += this.salario * porcentaje / 100;
    }

    public String getNombreComp() {
        return nombreComp;
    }

    public int getPermanencia() {
        return permanencia;
    }

}
