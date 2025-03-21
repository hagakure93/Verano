package Tema9_InterfazGraficaJava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

public class MiniPaint {
    // PARA EJECUTAR BORRA COMENT DEL MAIN
    private JFrame ventana;
    private AreaDibujo areaDibujo;
    private Path2D.Float trazoActual;

    private Color colorActual = Color.BLACK;
    private float anchoTrazoActual = 1f;

    public MiniPaint() {

        ventana = new JFrame("Mini Paint");
        ventana.setSize(600, 600);
        areaDibujo = new AreaDibujo();
        ventana.add(areaDibujo, BorderLayout.CENTER);

        // evento al hacer clic
        areaDibujo.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // si es clic derecho, mostramos menú contextual
                if (SwingUtilities.isRightMouseButton(e)) {
                    mostrarMenuContextual(e.getX(), e.getY());
                }
                // si es clic izquierdo, creamos un nuevo trazo
                else {
                    trazoActual = new Path2D.Float();
                    trazoActual.moveTo(e.getX(), e.getY());
                    areaDibujo.agregarTrazo(trazoActual, colorActual, anchoTrazoActual);
                }
            }
        });

        // evento al arrastrar
        areaDibujo.addMouseMotionListener(new MouseMotionAdapter() {

            @Override
            public void mouseDragged(MouseEvent e) {
                // si mantenemos clic izquierdo, añadimos puntos al trazo actual
                if (!SwingUtilities.isRightMouseButton(e)) {
                    trazoActual.lineTo(e.getX(), e.getY());
                    areaDibujo.repaint();
                }
            }
        });

        // menu de opciones
        JMenuBar barraPrincipal = new JMenuBar();
        JMenu menuOpciones = new JMenu("Opciones");

        // opción guardar
        JMenuItem opcionGuardar = new JMenuItem("Guardar imagen");
        opcionGuardar.addActionListener(_ -> {
            JFileChooser selectorArchivo = new JFileChooser();
            int seleccion = selectorArchivo.showSaveDialog(ventana);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                // guardar imagen
                File archivo = new File(selectorArchivo.getSelectedFile() + ".jpg");
                guardarImagen(archivo);
            }
        });

        // opción limpiar
        JMenuItem opcionLimpiar = new JMenuItem("Borrar todo");
        opcionLimpiar.addActionListener(_ -> areaDibujo.borrarTrazos());

        // opción deshacer
        JMenuItem opcionDeshacer = new JMenuItem("Deshacer");
        opcionDeshacer.addActionListener(_ -> areaDibujo.borrarUltimoTrazo());

        // añadimos opciones y menú
        menuOpciones.add(opcionGuardar);
        menuOpciones.add(opcionLimpiar);
        menuOpciones.add(opcionDeshacer);
        barraPrincipal.add(menuOpciones);
        ventana.setJMenuBar(barraPrincipal);

        // visibilidad y cierre
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    private void guardarImagen(File archivo) {

        BufferedImage imagen = new BufferedImage(areaDibujo.getWidth(), areaDibujo.getHeight(),
                BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = imagen.createGraphics();

        // pintamos el fondo en blanco, cuando se crea una nueva BufferedImage, por
        // defecto todos los píxeles son negros
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, imagen.getWidth(), imagen.getHeight());

        areaDibujo.paint(g2);
        g2.dispose();

        try {
            ImageIO.write(imagen, "jpg", archivo);
            JOptionPane.showMessageDialog(ventana, "Imagen guardada de forma correcta", "Guardada",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(ventana, "Error al guardar la imagen", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mostrarMenuContextual(int x, int y) {

        JPopupMenu menuContextual = new JPopupMenu();

        // opciones de color
        JMenuItem opcionColor = new JMenuItem("Elegir color");
        opcionColor.addActionListener(_ -> {
            Color nuevoColor = JColorChooser.showDialog(ventana, "Selecciona un color", colorActual);
            if (nuevoColor != null)
                colorActual = nuevoColor;
        });
        menuContextual.add(opcionColor);

        // separador
        menuContextual.addSeparator();

        // opciones de ancho de trazo
        JMenuItem trazoFino = new JMenuItem("Trazo fino");
        trazoFino.addActionListener(_ -> anchoTrazoActual = 1f);
        menuContextual.add(trazoFino);

        JMenuItem trazoMedio = new JMenuItem("Trazo medio");
        trazoMedio.addActionListener(_ -> anchoTrazoActual = 3f);
        menuContextual.add(trazoMedio);

        JMenuItem trazoGrueso = new JMenuItem("Trazo grueso");
        trazoGrueso.addActionListener(_ -> anchoTrazoActual = 5f);
        menuContextual.add(trazoGrueso);

        menuContextual.show(areaDibujo, x, y);
    }

    public static void main(String[] args) {
        //new MiniPaint();
    }
}
