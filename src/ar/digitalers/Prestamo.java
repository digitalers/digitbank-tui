package ar.digitalers;

public class Prestamo {
    private double monto;
    private double tasaInteres;
    private int plazoMeses;
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public double getTasaInteres() {
        return tasaInteres;
    }
    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    public int getPlazoMeses() {
        return plazoMeses;
    }
    /**
     * @param plazoMeses
     */
    public void setPlazoMeses(int plazoMeses) {
        this.plazoMeses = plazoMeses;
    }
    
    // Constructor, getters y setters, métodos específicos de préstamo
}