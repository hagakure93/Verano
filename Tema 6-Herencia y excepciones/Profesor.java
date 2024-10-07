public class Profesor extends Personita {
    String departamento;

    public Profesor(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "Departamento: " + departamento;
    }

}
