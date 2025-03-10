package Tema9_InterfazGraficaJava;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class EjemploJFileChooser extends JFrame {

    private final JLabel etiquetaImagen;
    private BufferedImage imagen;

    public EjemploJFileChooser() {

        // configuramos JFrame
        setTitle("Ejemplo JFileChooser");
        setSize(500, 500);
        setLayout(new BorderLayout());

        // añadimos JLabel al centro
        etiquetaImagen = new JLabel();
        add(etiquetaImagen, BorderLayout.CENTER);

        // añadimos JButton en la parte inferior
        JButton botonSeleccionarImagen = new JButton("Seleccionar Imagen");
        add(botonSeleccionarImagen, BorderLayout.SOUTH);

        // evento al pulsar el botón
        botonSeleccionarImagen.addActionListener(_ -> {
            JFileChooser chooser = new JFileChooser();
            int opcion = chooser.showOpenDialog(this);
            if (opcion == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();
                cargarImagen(file);
            }
        });

        // visibilidad y cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void cargarImagen(File file) {
        try {
            imagen = ImageIO.read(file);
            etiquetaImagen.setIcon(new ImageIcon(escalarImagen(imagen)));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar la imagen.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Image escalarImagen(BufferedImage imagenOriginal) {

        double proporcionOriginal = (double) imagenOriginal.getWidth() / (double) imagenOriginal.getHeight();
        int ancho = getWidth();
        int alto = (int) (getWidth() / proporcionOriginal);

        if (alto > getHeight()) {
            alto = getHeight();
            ancho = (int) (getHeight() * proporcionOriginal);
        }

        return imagenOriginal.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new EjemploJFileChooser()); 
    }
}
