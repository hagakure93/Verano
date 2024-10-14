import java.util.ArrayList;

public class AppAnimales {

    public static void main(String[] args) {
        //Crea un arraylist de objetos llamado animales
        ArrayList<Object> animales = new ArrayList<>();
        //Crea instancias de objetos Animal, perro y pibul
        animales.add(new Animal());
        animales.add(new Perro());
        animales.add(new Pitbull());
        //Un foreach que recorre el array animales e imprime
        for (Object a : animales) {
            System.out.println("La clase del objeto es: "+a.getClass().getName());
            System.out.println(a);
        }           
    }
}
// Aquí ha creado diretamente las clases con su propio método toString y cada uno hace una cosa
class Animal {
    
    @Override
    public String toString() {
        return "El animal hace un ruido";
    }
}

class Perro extends Animal {

    @Override
    public String toString() {
        return "El perro ladra";
    }
}

class Pitbull extends Perro {
        
    @Override
    public String toString() {
        return "El pitbull tiene un ladrido profundo";
    }
}
