
public class Llaves {

    public static void main(String[] args) {

        int a = 1, b = 2, c = 3;

        {
            a++;
            b += c;  // Las variables solo funcionan dentro de sus {}
            System.out.println(a+b+c); // para que no salga en amarillo , no hagas caso

        }

    }

}
