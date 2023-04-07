package Ejercicio2.entidad;

public class Cafetera {

    private int CapacidadMaxima;
    private int CantidadActual;

    public Cafetera() {
    }

    public Cafetera(int CapacidadMaxima, int CantidadActual) {
        this.CapacidadMaxima = CapacidadMaxima;
        this.CantidadActual = CantidadActual;
    }

    public int getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public void setCapacidadMaxima(int CapacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
    }

    public int getCantidadActual() {
        return CantidadActual;
    }

    public void setCantidadActual(int CantidadActual) {
        this.CantidadActual = CantidadActual;
    }
}
