package cuenta;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Cuenta {

    private int id;
    private String numero;
    private String tipo;
    private double saldo;
    private String moneda;
    private Date fechaApertura;
    private Date fechaVencimiento;

    public Cuenta(int id, String numero, String tipo, double saldo, String moneda, Date fechaApertura, Date fechaVencimiento) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
        this.moneda = moneda;
        this.fechaApertura = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

}