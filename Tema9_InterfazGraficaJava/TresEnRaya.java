package Tema9_InterfazGraficaJava;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TresEnRaya extends JFrame {

    private int ronda = 0;
    private boolean jugadorAzul = true;
    private final JButton[][] tablero = new JButton[3][3];

    public TresEnRaya() {

        // título, tamaño y layout manager
        setTitle("Tres en raya");
        setSize(400, 400);
        setLayout(new GridLayout(3, 3));

        // creamos los 9 botones y los añadimos al tablero
        for (JButton[] tablero1 : tablero) {
            for (int j = 0; j < tablero1.length; j++) {
                tablero1[j] = new JButton();
                tablero1[j].addActionListener(e -> jugar(e));
                add(tablero1[j]);
            }
        }

        // cierre y visibilidad
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void jugar(ActionEvent e) {

        // obtenemos el botón que se ha pulsado
        JButton botonPulsado = (JButton) e.getSource();

        // si juega el AZUL
        if (jugadorAzul) {
            botonPulsado.setBackground(Color.BLUE);
            botonPulsado.setEnabled(false);
            jugadorAzul = false;
        }
        // si juega el ROJO
        else {
            botonPulsado.setBackground(Color.RED);
            botonPulsado.setEnabled(false);
            jugadorAzul = true;
        }
        ronda++;
        verificarFinDelJuego();
    }

    private boolean verificar3EnRaya(JButton p1, JButton p2, JButton p3) {
        return p1.getBackground() == p2.getBackground() && p2.getBackground() == p3.getBackground()
                && (p1.getBackground() == Color.RED || p1.getBackground() == Color.BLUE);
    }

    private void verificarFinDelJuego() {

        // victoria en filas o columnas
        for (int i = 0; i < 3; i++) {
            if (verificar3EnRaya(tablero[i][0], tablero[i][1], tablero[i][2])
                    || verificar3EnRaya(tablero[0][i], tablero[1][i], tablero[2][i])) {
                victoria();
                return;
            }
        }

        // victoria con diagonales
        if (verificar3EnRaya(tablero[0][0], tablero[1][1], tablero[2][2])
                || verificar3EnRaya(tablero[0][2], tablero[1][1], tablero[2][0])) {
            victoria();
            return;
        }

        // empate
        if (ronda == 9)
            empate();
    }

    private void victoria() {
        JOptionPane.showMessageDialog(this, "El jugador " + (jugadorAzul ? "ROJO" : "AZUL") + " gana");
        reiniciarJuego();
    }

    private void empate() {
        JOptionPane.showMessageDialog(this, "Empate");
        reiniciarJuego();
    }

    private void reiniciarJuego() {

        // reiniciamos botones
        for (JButton[] tablero1 : tablero) {
            for (JButton item : tablero1) {
                item.setEnabled(true);
                item.setBackground(null);
            }
        }
        // reiniciamos juego
        jugadorAzul = true;
        ronda = 0;
    }

    public static void main(String[] args) {
        //new TresEnRaya();
    }
}
