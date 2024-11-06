import java.util.ArrayList;

public class Empresa {
    private final String cif;
    private final String nombre;
    private final ArrayList<Trabajador> trabajadores;

    public Empresa(String cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
        this.trabajadores = new ArrayList<>();
    }

   

    public void addTrabajador(Trabajador trabajador) {
        this.trabajadores.add(trabajador);
    }

    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    

}
