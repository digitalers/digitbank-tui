package movimiento;

import java.time.Instant;

import enumerados.TipoCuenta;
import movimiento.Exceptions.Exceptions;

/* id, tipo, monto, fecha, hora, concepto, cuenta origen, cuenta destino */
public class Movimiento {
    
    private Long id;
    private TipoCuenta tipo;
    private float monto;
    private Instant fecha;
    private long calculated;
    private String concepto;
    private String cuenta_origen;
    private String cuenta_destino;

    public Movimiento() throws Exceptions {
        throw new Exceptions("El movimiento no puede estar vacío");
    }

    public Movimiento(Long id, TipoCuenta tipo, int monto, Instant fecha, String concepto, String cuenta_origen, String cuenta_destino) {
        this.id = id;
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.calculated = Instant.now().getEpochSecond();
        this.concepto = concepto;
        this.cuenta_origen = cuenta_origen;
        this.cuenta_destino = cuenta_destino;
    }

    public long getId() {
        return this.id;
    }

    public TipoCuenta getTipo() {
        return this.tipo;
    }

    public float getMonto() {
        return this.monto;
    }

    public Instant getFecha() {
        return this.fecha;
    }

    public void getHora() {

        // Se calcula los segundos transcurrido desde el 1970 y se resta por el tiempo almacenado en la variable; 
        long seconds = Instant.now().getEpochSecond();
        long calculated = (seconds - this.calculated);

        // Un día equivale a 86400 segundos
        long days = (calculated / 86400);

        // Una hora equivale a 3600 segundos % 24 días
        long hours = ((calculated / 3600) % 24);

        // Un minuto equivale a 60 segundos % 60
        long minutes = ((calculated / 60) % 60);

        System.out.println();
        System.out.printf("El movimiento se hizo hace %d día(s), %d hora(s) y %d minuto(s)", days, hours, minutes);
    }

    public String getConcepto() {
        return this.concepto;
    }
    
    public String getCuenta_origen() {
        return this.cuenta_origen;
    }

    public String getCuenta_destino() {
        return this.cuenta_destino;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTipo(TipoCuenta tipo) {
        this.tipo = tipo;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public void setCuenta_origen(String cuenta_origen) {
        this.cuenta_origen = cuenta_origen;
    }

    public void setCuenta_destino(String cuenta_destino) {
        this.cuenta_destino = cuenta_destino;
    }
}
