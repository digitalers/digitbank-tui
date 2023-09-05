package ar.digitalers;

public class Inversion {
    
  private String tipo;
  private double montoInicial;
  private double tasaRendimiento;
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  public double getMontoInicial() {
    return montoInicial;
  }
  public void setMontoInicial(double montoInicial) {
    this.montoInicial = montoInicial;
  }
  public double getTasaRendimiento() {
    return tasaRendimiento;
  }
  public void setTasaRendimiento(double tasaRendimiento) {
    this.tasaRendimiento = tasaRendimiento;
  }
  public Inversion(String tipo, double montoInicial, double tasaRendimiento) {
    this.tipo = tipo;
    this.montoInicial = montoInicial;
    this.tasaRendimiento = tasaRendimiento;
  }
public Inversion() {
}


 // Constructor, getters y setters, métodos específicos de inversión
    
}
