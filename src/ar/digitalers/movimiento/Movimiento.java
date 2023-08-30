package movimiento;

import java.util.Date;
import java.util.UUID;

/* id, tipo, monto, fecha, hora, concepto, cuenta origen, cuenta destino */
public class Movimiento {
    
    private long id;
    private int tipo;
    private int monto;
    private String fecha;
    private String hora;
    private String concepto;
    private String cuenta_origen;
    private String cuenta_destino;

    public Movimiento() {

    }

    public long getId() {
        return this.id;
    }

    public int getTipo() {
        return this.tipo;
    }

    public int getMonto() {
        return this.monto;
    }

    public String getFecha() {
        return this.fecha;
    }

    public String getHora() {
        return this.hora;
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

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
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
