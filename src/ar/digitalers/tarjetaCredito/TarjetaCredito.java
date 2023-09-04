package  tarjetaCredito;

import java.time.LocalDate;
import java.util.UUID;

public class TarjetaCredito {
    private UUID cuentabancariaID;
    private String tarjetaID;
    private String codigo;
    private LocalDate fecha_vencimiento;
    private int limite;

    public String getCodigo() {
        return codigo;
    }

    public UUID getCuentabancariaID() {
        return cuentabancariaID;
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public int getLimite() {
        return limite;
    }

    public String getTarjetaID() {
        return tarjetaID;
    }

    public void setCodigo(String code) {
        this.codigo = code;
    }

    public void setCuentabancariaID(UUID cuentabancariaID) {
        this.cuentabancariaID = cuentabancariaID;
    }
    
    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void setTarjetaID(String tarjetaID) {
        this.tarjetaID = tarjetaID;
    }
}