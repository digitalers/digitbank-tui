package entidades;

public class CuentaBancaria {
    private int numeroCuenta;
    private Titular titular;
    private double saldo;

    public CuentaBancaria(Titular titular, double saldo) {
        this.numeroCuenta = generarNumeroCuenta();
        this.titular = titular;
        this.saldo = saldo;
    }


    private static int numeroCuentaActual = 0;

    private int generarNumeroCuenta() {
        return ++numeroCuentaActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getNumeroCuentaActual() {
        return numeroCuentaActual;
    }

    public static void setNumeroCuentaActual(int numeroCuentaActual) {
        CuentaBancaria.numeroCuentaActual = numeroCuentaActual;
    }
    @Override
    public String toString() {
        return "Número de cuenta: " + numeroCuenta + "\nTitular: " + titular + "\nSaldo: $" + saldo;
    }
}
