public class Parses {
    public static void main(String[] args) {
        int a = 3 , b= 3;
        String texto = "125"; // un número en una string
        int c = (int)Math.pow(a, b); // La funcion Math devuelve un double , usamos casting para que devuelva un int

        
        System.out.println(c);
        int t = Integer.parseInt(texto); //Convierte una string en int
        System.out.println(t);

        // Se puede usar un getNumericValue(variable) para convertirlo directamente
        







    }
    
}
