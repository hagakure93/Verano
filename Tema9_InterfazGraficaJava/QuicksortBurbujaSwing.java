package Tema9_InterfazGraficaJava;

import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public final class QuicksortBurbujaSwing extends JPanel {

    private final int dimension;
    private final int espaciado;
    private final int rectangulos;
    private final int intervalo;
    private final int[] alturas;

    public QuicksortBurbujaSwing(int dimension, int espaciado, int rectangulos, int intervalo) {

        this.dimension = dimension;
        this.espaciado = espaciado;
        this.rectangulos = rectangulos;
        this.intervalo = intervalo;

        // creamos las alturas
        alturas = new int[rectangulos];
        for (int i = 0; i < rectangulos; i++) {
            alturas[i] = dimension * (i + 1);
        }

        // desordenamos array
        desordenar();
    }

    public void desordenar() {

        Random r = new Random();
        for (int i = 0; i < alturas.length; i++) {
            int indice = r.nextInt(alturas.length);
            int temp = alturas[indice];
            alturas[indice] = alturas[i];
            alturas[i] = temp;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < rectangulos; i++) {
            int x = i * (dimension + espaciado) + 5;
            int y = getHeight() - alturas[i];
            g.fillRect(x, y, dimension, alturas[i]);
        }
    }

    public void burbuja() {
        try {
            Thread.sleep(5000);
            // ordenamos con burbuja
            int aux;
            for (int i = 0; i < alturas.length; i++) {
                for (int j = 0; j < alturas.length - i - 1; j++) {
                    // El valor máximo lo más a la derecha posible
                    if (alturas[j] > alturas[j + 1]) {
                        aux = alturas[j];
                        alturas[j] = alturas[j + 1];
                        alturas[j + 1] = aux;

                        // esperamos el intervalo en ms
                        Thread.sleep(intervalo);
                        // **USAR invokeLater AQUÍ para burbuja**
                        SwingUtilities.invokeLater(() -> {
                            super.repaint();
                        });
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Se ha ordenado el array de " + rectangulos + " elementos",
                    "Ordenación con burbuja finalizada",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (InterruptedException e) {
            System.out.println("Error al ordenar");
        }
    }

    public void quickSort() {
        try {
            Thread.sleep(5000);
            // ordenamos con quicksort
            quicksort(alturas, 0, alturas.length - 1);
            JOptionPane.showMessageDialog(null, "Se ha ordenado el array de " + rectangulos + " elementos",
                    "Ordenación con quicksort finalizada",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (InterruptedException e) {
            System.out.println("Error al ordenar");
        }
    }

    private void quicksort(int A[], int izq, int der) throws InterruptedException {

        int pivote = A[izq];
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            while (A[i] <= pivote && i < j)
                i++;
            while (A[j] > pivote)
                j--;
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;

                // esperamos el intervalo en ms
                Thread.sleep(intervalo);
                // **USAR invokeLater AQUÍ para quicksort (intercambio)**
                SwingUtilities.invokeLater(() -> {
                    super.repaint();
                });
            }
        }

        A[izq] = A[j];
        A[j] = pivote;
        // esperamos el intervalo en ms
        Thread.sleep(intervalo);
        // **USAR invokeLater AQUÍ para quicksort (pivote)**
        SwingUtilities.invokeLater(() -> {
            super.repaint();
        });

        if (izq < j - 1)
            quicksort(A, izq, j - 1);
        if (j + 1 < der)
            quicksort(A, j + 1, der);
    }

    public static void main(String[] args) {

        int dimension = 20; // px
        int espaciado = 5; // px
        int rectangulos = 40; // px
        int intervalo = 100; // ms

        JFrame ventana = new JFrame("Ordenar con Quicksort");
        QuicksortBurbujaSwing rects = new QuicksortBurbujaSwing(dimension, espaciado, rectangulos, intervalo);
        ventana.add(rects);
        ventana.setSize((dimension + espaciado) * rectangulos + 20, dimension * rectangulos + 40);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

        JFrame ventana2 = new JFrame("Ordenar con Burbuja");
        QuicksortBurbujaSwing rects2 = new QuicksortBurbujaSwing(dimension, espaciado, rectangulos, intervalo);
        ventana2.add(rects2);
        ventana2.setSize((dimension + espaciado) * rectangulos + 20, dimension * rectangulos + 40);
        ventana2.setLocationRelativeTo(null);
        ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana2.setVisible(true);

        // creando primer hilo
        Thread thread1 = new Thread(() -> rects.quickSort());
        // creando segundo hilo
        Thread thread2 = new Thread(() -> rects2.burbuja());

        // iniciando los hilos
        thread1.start();
        thread2.start();
    }
}
