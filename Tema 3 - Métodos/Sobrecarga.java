public class Sobrecarga {

    public static void main(String[] args) {
        String nombre = "Pablo";
        String ciudad = "Jerez";

        System.out.println(saludar(nombre, ciudad));
        System.out.println(saludar(nombre));
        saludar();
        
        // Mientras alguno de los parámetros sea distinto , puedes poner el mismo nombre a los métodos...
    }
    static void saludar(){
         System.out.println("Hola , como estás?");
    }

    static String saludar(String nombre){
        return "Hola "+nombre+", como estás?";
    }
    static String saludar(String nombre,String ciudad){
        return "Hola "+nombre+" , qué tal por "+ciudad+ " ?";
    }
    
}
