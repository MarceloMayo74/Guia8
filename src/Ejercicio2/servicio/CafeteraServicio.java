package Ejercicio2.servicio;

import Ejercicio2.entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    public Cafetera crearCafetera() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Cafetera cafetera = new Cafetera();
        System.out.println("Primer uso Cafetera");
        System.out.println();
        System.out.println("Ingrese capacidad maxima en ml");
        cafetera.setCapacidadMaxima(sc.nextInt());
        System.out.println("Ingrese cantidad actual en ml");
        cafetera.setCantidadActual(sc.nextInt());
        return cafetera;
    }

    public int llenarCafetera(Cafetera cafetera) {
        System.out.println("Cafetera Llena");
        return cafetera.getCapacidadMaxima();
    }

    public void servirTaza(Cafetera cafetera) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la taza en ml:");
        int taza = sc.nextInt();
        if (taza > cafetera.getCantidadActual()) {
            System.out.print("No había suficiente cafe en la cafetera para llenar la taza, se pudo llenar : " + cafetera.getCantidadActual());
            System.out.println(" ml.");
            cafetera.setCantidadActual(0);
        } else {
            System.out.println("Se llenó la taza.");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
        }
    }

    public void vaciarCafetera(Cafetera cafetera) {
        System.out.println("Cafetera Vacia");
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafetera) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de café a agregar:  (en ml)");
        int cafe = sc.nextInt();
        int restante = cafetera.getCapacidadMaxima() - cafetera.getCantidadActual();
        if (cafe <= restante) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cafe);
        } else {
            System.out.println("La cantidad que quiso agregar excede la capacidad de la cafetera.");
        }

    }

}
