public class VargArgs {

    public static void main(String... args) { // VargArgs= Parametro de longitud Variable
        if (args.length > 0) {
            System.out.println("Hola mundo con " + args.length + " args");
            for (int i = 0; i < args.length; i++)
                System.out.println("arg[" + i + "] = " + args[i]);
        } else
            System.out.println("Hola mundo sin args");
    }
}
