package ar.digitalers;

public class Seguro  {
    private String tipo;
    private double prima;
    private String coberturas;
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getPrima() {
        return prima;
    }
    public void setPrima(double prima) {
        this.prima = prima;
    }
    public String getCoberturas() {
        return coberturas;
    }
    public void setCoberturas(String coberturas) {
        this.coberturas = coberturas;
    }
    
    // Constructor, getters y setters, métodos específicos de seguro
}