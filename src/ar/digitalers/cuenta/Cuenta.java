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

}