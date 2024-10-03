public class Estudiante extends Personita {

    private final int creditos;
    //Cómo la clase Estudiante está heredando de Persona, necesita nombre y edad
    public Estudiante(String nombre, int edad) {
        super(nombre, edad); // A través del super invocamos al constructor de la clase Padre(Persona)
        this.creditos = 60;
    }

    public int getCreditos() {
        return this.creditos;
    }

}
