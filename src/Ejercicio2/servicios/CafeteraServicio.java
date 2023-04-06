package Ejercicio2.servicios;

import Ejercicio2.entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    public int llenarCafetera(Cafetera cafetera) {
        return cafetera.getCapacidadMaxima();
    }

    public void servirTaza(Cafetera cafetera) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la taza en ml:");
        int taza = leer.nextInt();
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
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafetera) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de café a agregar:  (en ml)");
        int cafe = leer.nextInt();
        int restante = cafetera.getCapacidadMaxima() - cafetera.getCantidadActual();
        if (cafe <= restante) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cafe);
        } else {
            System.out.println("La cantidad que quiso agregar excede la capacidad de la cafetera.");
        }

    }

}
