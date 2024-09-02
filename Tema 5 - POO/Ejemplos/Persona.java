public class Persona {
    /* Persona es la CLASE , cada persona creada será una INSTANCIA */
    String nombre;
    int edad;
    String ciudadResidencia;
    String profesion;
    String dni;


    /* Para crear instancias de una clase , se usa un CONSTRUCTOR */

    public Persona(){

        nombre = "Pablo";
        edad = 15;
        ciudadResidencia = "Jerez";
        profesion = "Estudiante";
        dni = "23023023A";
    }



    public void mostrarDatos(){

        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Ciudad de residencia: "+ciudadResidencia);
        System.out.println("Profesión: "+profesion);
        System.out.println("Dni: "+dni);


    }


    
}
