public class Precedencia {
    public static void main(String[] args) {

        int n = 2;
        int m = n++*3+2+(++n); //  2*3+2+4   Los incrementos o decrementos los evaluamos de izq a derecha , aunque esté entre paréntesis. 


        // QUEDATE CON QUE ++5 se incrementa antes y 5++ primero se asigna y luego se incrementa.

        System.out.println(m);
        
        n = 2;

        int x = ++n+2+3*(n++); // 3+2+3*3    Aquí se haría tres por tres nueve , más tres 12 , más dos , catorce

        int lion = 3;
        int tiger = ++lion * 5 / lion--;
        System.out.println("lion is " + lion);
        System.out.println("tiger is " + tiger);


        int a = 5;
        double b = (double) a++ / a++;
        System.out.println(b);

        double num6 = 6;
        double num5 = 5;
        System.out.println(num5/num6);

        // los += o los *= y esas mierdas es lo que menos prioridad tiene

        System.out.println(x);

    }
    
}
