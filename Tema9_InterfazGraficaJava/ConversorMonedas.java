package Tema9_InterfazGraficaJava;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConversorMonedas extends JFrame {
    // Si lo quieres ejecutar, borra el comentario de la linea 64
    private JTextField campo;
    private JLabel resultado;
    private final JButton botonConvertir;
    private JComboBox<String> opciones; // Como un <select> de HTML

    public ConversorMonedas() {

        // configurar JFrame
        setTitle("Conversor de monedas");
        setSize(400, 100);
        setLayout(new FlowLayout());

        // añadir componentes
        campo = new JTextField(10);
        resultado = new JLabel("");
        opciones = new JComboBox<>(new String[] { "€ a $", "$ a €" });

        // botón y acción
        botonConvertir = new JButton("Convertir");
        botonConvertir.addActionListener((@SuppressWarnings("unused") ActionEvent e) -> {
            try {
                double cantidad = Double.parseDouble(campo.getText()); // Parsear el contenido
                String seleccion = opciones.getSelectedItem().toString();
                String mensaje;

                if (seleccion.equals("€ a $"))
                    mensaje = cantidad + "€ equivalen a " + (Math.round(cantidad / 0.91 * 100.0) / 100.0) + "$";
                else
                    mensaje = cantidad + "$ equivalen a " + (Math.round(cantidad * 0.91 * 100.0) / 100.0) + "€";

                resultado.setText(mensaje);

            } catch (NumberFormatException ex) {
                // mensaje de error
                resultado.setText("Debes introducir una cantidad numérica válida");
            }
        });

        // añadir los componentes a la ventana
        add(campo);
        add(opciones);
        add(botonConvertir);
        add(resultado);

        // mostrar JFrame y configurar cierre
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
         //new ConversorMonedas(); // eliminar el comentario para ejecutar
    }
}
