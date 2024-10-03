public class AppEstudiante {
    public static void main(String[] args) {
        
        Estudiante e = new Estudiante("Luis Garcia",20);
        Personita p = new Personita("Marta Gomez",20);
        System.out.println(p.getNombre()); 
        System.out.println(e.getNombre()+" : "+e.getCreditos()+" créditos.");

        /*En resúmen, como la clase Estudiante está herendado de la clase Persona, desde Estudiante podemos
         * acceder tanto a sus atributos como sus métodos, por eso podemos acceder al getNombre() que es de la 
         * clase Persona, desde la clase Estudiante.
         */

       

    
    }
    
}
