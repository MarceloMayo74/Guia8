package Ejercicio1.entidad;

public class CuentaBancaria {

    private int NumeroCuenta;
    private long DniCliente;
    private double SaldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int NumeroCuenta, long DniCliente, double SaldoActual) {
        this.NumeroCuenta = NumeroCuenta;
        this.DniCliente = DniCliente;
        this.SaldoActual = SaldoActual;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public long getDniCliente() {
        return DniCliente;
    }

    public void setDniCliente(long DniCliente) {
        this.DniCliente = DniCliente;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{"
                + "numeroCuenta=" + NumeroCuenta
                + ", dniCliente=" + DniCliente
                + ", saldoActual=" + SaldoActual
                + '}';
    }
}
