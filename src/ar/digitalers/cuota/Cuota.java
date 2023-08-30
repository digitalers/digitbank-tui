package cuota;

import java.util.Date;

public class Cuota {
    private long id;
    private long contrato;
    private String numero;
    private double monto;
    private Date fechaVencimiento;
    private Date fechaPago;

    public Cuota(long id, long contrato, String numero, double monto, Date fechaVencimiento, Date fechaPago) {
        this.id = id;
        this.contrato = contrato;
        this.numero = numero;
        this.monto = monto;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaPago = fechaPago;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getContrato() {
        return contrato;
    }
    public void setContrato(long contrato) {
        this.contrato = contrato;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public Date getFechaPago() {
        return fechaPago;
    }
    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }
    


}
