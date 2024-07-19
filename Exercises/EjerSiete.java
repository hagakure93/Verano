import java.util.Scanner;

public class EjerSiete {  // Te dice cuantas palabras tiene una frase

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Dime una frase");
            String frase = entrada.nextLine().trim();
            int palabras = 1;
            
            for (int i = 0; i < frase.length() - 1; i++) {
                if (frase.charAt(i) == ' ' && frase.charAt(i + 1) != ' ')
                    palabras++;
            }
            
            if (frase.equals(""))
                System.out.println("La frase no tiene ninguna palabra");
            else
                System.out.println("La frase tiene " + palabras + " palabra" + (palabras > 1 ? "s" : ""));


            
        }
    }     
     
}


