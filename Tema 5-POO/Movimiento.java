
import java.time.LocalDateTime;

public class Movimiento {

    public static final byte INGRESO = 0;
    public static final byte RETIRO = 1;

    private LocalDateTime fechaHora;
    private double importe;
    private double saldoFinal;
    private byte tipo;

    // CONSTRUCTOR

    public Movimiento(LocalDateTime fechaHora, double importe, double saldoFinal, byte tipo) {
        this.fechaHora = fechaHora;
        this.importe = importe;
        this.saldoFinal = saldoFinal;
        this.tipo = tipo;

    }

}
