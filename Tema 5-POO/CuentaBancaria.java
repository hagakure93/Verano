public class CuentaBancaria {
    /*Esto son los distintos atributos de la clase , que se guardan en "variables de instancia"
     * Cada objeto particular puede tener valores distintos para estas variables.
     * Las variables de instancia son DECLARADAS en la clase(al principio) pero sus valores son fijados
     * en el objeto.
     */
    int id;
    private double saldo;
    Persona propietario;

    // Aquí creo la instancia de la clase , asignándole parámetros
    public CuentaBancaria(int num, Persona p) {

        id = num;
        propietario = p;
        saldo = 0;

    }

    // Aquí creo los diferentes métodos de la clase CuentaBancaria
    public void verSaldo() {
        System.out.println("El saldo de la cuenta " + id + " es: " + saldo + " euros.");
    }

    public void ingresar(double n) {
        saldo += n;
    }

    public void retirar(double n) {

        if (saldo >= n)
            saldo -= n;
        else
            System.out.println("ERROR: No hay suficiente saldo.");

    }

    public void mostrarDatos() {

        propietario.mostrarDatos();
        verSaldo();
        System.out.println("--------------------------------");
    }

}
