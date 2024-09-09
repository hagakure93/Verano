public class Ejm1 {

    // Si alguna vez no compila bien una instancia , reinicia vs code

    public static void main(String[] args) {
        // Esto son instancias de la clase PERSONA
        Persona p1 = new Persona("Pablo", 31, "32033010b");
        Persona p2 = new Persona("Sofía", 28, "43534590h");
        // Esto son las instancias de la clase CuentaBancaria
        CuentaBancaria cuenta1 = new CuentaBancaria(1, p1);
        CuentaBancaria cuenta2 = new CuentaBancaria(2, p2);

        cuenta1.ingresar(100);
        cuenta2.ingresar(200);
        cuenta1.retirar(13.50);
        cuenta2.retirar(55.90);
        // MostrarDatos es un método creado en la clase CuentaBancaria
        cuenta1.mostrarDatos();
        cuenta2.mostrarDatos();

    }

}
