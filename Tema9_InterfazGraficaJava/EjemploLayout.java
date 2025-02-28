package Tema9_InterfazGraficaJava;

import javax.swing.JFrame;

public class EjemploLayout {

    public static void main(String[] args) {
        JFrame ventana1 = new JFrame("Mi primera ventana");
        ventana1.setVisible(true);  // Sin esto no sería visible
        ventana1.setSize(500, 200);
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para que se pare la ejecución 

        JFrame ventana2 = new JFrame("Segunda ventana");
        ventana2.setVisible(true);
        ventana2.setSize(500,200);
        ventana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
