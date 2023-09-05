package ar.digitalers;

public class TarjetaCredito {
    
        private double limiteCredito;
        private double tasaInteres;
        public double getLimiteCredito() {
                return limiteCredito;
        }
        public void setLimiteCredito(double limiteCredito) {
                this.limiteCredito = limiteCredito;
        }
        public double getTasaInteres() {
                return tasaInteres;
        }
        public void setTasaInteres(double tasaInteres) {
                this.tasaInteres = tasaInteres;
        }
        public TarjetaCredito(double limiteCredito, double tasaInteres) {
                this.limiteCredito = limiteCredito;
                this.tasaInteres = tasaInteres;
        }
        
        // Constructor, getters y setters, métodos específicos de tarjeta de crédito
    
    
}
