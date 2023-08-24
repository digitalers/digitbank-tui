package ar.digitalers.CreditCard;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

import ar.digitalers.RandomNum.RandomNum;

public class CreditCard {
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

    public void setCodigo() {

        ArrayList<String> code = new ArrayList<String>();

        int max = 4;

        for (int i = 0; i < max; i++) {
            Integer nums = new RandomNum(1111, 9999).random();
            code.add(nums.toString());
        }

        this.codigo = code.get(0) + " " + code.get(1) + " " + code.get(2) + " " + code.get(3);
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
