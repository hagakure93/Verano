package Tema9_InterfazGraficaJava;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

// Si lo quieres ejecutar ve abajo y borra el coment

public class SumadorEnteros extends JFrame {

    private JTextField campo1, campo2;
    private final JLabel suma;
    private JLabel resultado;
    private final JButton botonSumar;

    public SumadorEnteros() {

        // configuramos ventana
        setTitle("Sumador de Enteros");
        setSize(400, 100);
        setLayout(new FlowLayout());

        // creamos cajas de texto y etiquetas
        campo1 = new JTextField(4);
        campo2 = new JTextField(4);
        suma = new JLabel("+");
        resultado = new JLabel(" = ");

        // creamos botón y asignamos acción
        botonSumar = new JButton("Sumar"); // Lo que contiene el botón
        botonSumar.addActionListener(_ -> { // Lo que sucede al pulsarlo
            try {
                int num1 = Integer.parseInt(campo1.getText());
                int num2 = Integer.parseInt(campo2.getText());
                resultado.setText(" =  " + (num1 + num2)); // Modifíca la etiqueta resultado
            } catch (NumberFormatException ex) {
                // mensaje de error
                JOptionPane.showMessageDialog(null, "Debes introducir números enteros.", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        // añadir los componentes a la ventana
        add(botonSumar);
        add(campo1);
        add(suma);
        add(campo2);
        add(resultado);

        // mostramos JFrame y configuramos cierre
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        //new SumadorEnteros();
    }
}
