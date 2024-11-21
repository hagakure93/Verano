import java.util.Comparator;

public class NombreComparator implements Comparator<Object> {
    @Override
    public int compare(Object obj1, Object obj2) {

        String nombre1 = null;
        String nombre2 = null;

        if (!(obj1 instanceof Alumno))
            if (!(obj1 instanceof Docente)) {
            } else {
                nombre1 = ((Docente) obj1).getNombre();
            }
        else nombre1 = ((Alumno) obj1).getNombre();

        if (obj2 instanceof Alumno alumno)
            nombre2 = alumno.getNombre();
        else if (!(obj2 instanceof Docente)) {
        } else {
            nombre2 = ((Docente) obj2).getNombre();
        }

        if (nombre1 != null && nombre2 != null)
            return nombre1.compareTo(nombre2);
        else if (nombre1 != null)
            return -1;
        else if (nombre2 != null)
            return 1;

        return 0;
    }

}
