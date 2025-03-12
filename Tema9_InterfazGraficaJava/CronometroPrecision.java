package Tema9_InterfazGraficaJava;

import java.awt.FlowLayout;
import java.awt.Font;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class CronometroPrecision extends JFrame {

    private long inicioTiempo;
    private long tiempoPausado;
    private boolean corriendo;
    private JLabel label;
    private Timer reloj;
    private JButton iniciarPausar;
    private final JButton reiniciar;

    public CronometroPrecision() {

        inicioTiempo = 0;
        tiempoPausado = 0;
        corriendo = false;

        // configuración del JFrame
        setTitle("Cronómetro");
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        setSize(400, 200);        

        // etiqueta del cronómetro
        label = new JLabel("00:00");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        add(label);

        // botón iniciar-pausar
        iniciarPausar = new JButton("Iniciar");
        add(iniciarPausar);

        // botón reiniciar
        reiniciar = new JButton("Reiniciar");
        add(reiniciar);

        // evento del contador cada 10ms
        reloj = new Timer(10, _ -> {
            if (corriendo) {
                long ahora = System.currentTimeMillis();
                long transcurrido = tiempoPausado + (ahora - inicioTiempo);

                DecimalFormat df = new DecimalFormat("00");
                long segundos = transcurrido / 1000;
                long centesimas = (transcurrido / 10) % 100;

                label.setText(df.format(segundos) + ":" + df.format(centesimas));
            }
        });

        // evento iniciar-pausar
        iniciarPausar.addActionListener(_ -> {
            if (corriendo) {
                tiempoPausado += System.currentTimeMillis() - inicioTiempo;
                corriendo = false;
                iniciarPausar.setText("Iniciar");
               
                // si paramos en 00, mostramos mensaje de enhorabuena
                if (label.getText().endsWith("00")) {
                    JOptionPane.showMessageDialog(null, "Has parado el cronómetro en 0 centésimas", "Enhorabuna",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                
            } else {
                inicioTiempo = System.currentTimeMillis();
                corriendo = true;
                iniciarPausar.setText("Pausar");
                reloj.start();
            }
        });

        // evento reiniciar
        reiniciar.addActionListener(_ -> {
            inicioTiempo = System.currentTimeMillis();
            tiempoPausado = 0;
            corriendo = false;
            iniciarPausar.setText("Iniciar");
            label.setText("00:00");
        });

        // visibilidad y cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        //new CronometroPrecision();
    }
}
