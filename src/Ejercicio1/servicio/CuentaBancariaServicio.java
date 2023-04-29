package Ejercicio1.servicio;

import Ejercicio1.entidad.CuentaBancaria;

import java.util.Scanner;

public class CuentaBancariaServicio {

    public CuentaBancaria crearCuenta() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        System.out.println("**CREANCION DE CUENTAS**");
        System.out.println();
        System.out.println("Ingrese Numero de la Cuenta:");
        cuentaBancaria.setNumeroCuenta(sc.nextInt());
        System.out.println("Ingrese DNI del cliente:");
        cuentaBancaria.setDniCliente(sc.nextLong());
        System.out.println("Saldo actual de la cuenta:");
        cuentaBancaria.setSaldoActual(sc.nextDouble());
        return cuentaBancaria;
    }

    public void ingresar(CuentaBancaria cuentaBancaria) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dinero a ingresar:");
        double dinero = sc.nextDouble();
        cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() + dinero);
    }

    public void retirar(CuentaBancaria cuentaBancaria) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto desea retirar?:");
        double dinero = leer.nextDouble();
        if (dinero > cuentaBancaria.getSaldoActual()) {
            System.out.println("La cantidad ingresada excede el saldo actual");
            System.out.println("Se retiraron:");
            System.out.println(cuentaBancaria.getSaldoActual());
            cuentaBancaria.setSaldoActual(0);
        } else {
            System.out.println("Se retiraron $" + dinero + " de su cuenta");
            cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() - dinero);
        }
    }

    public void extraccionRapida(CuentaBancaria cuentaBancaria) {
        Scanner leer = new Scanner(System.in);
        double maximoRetirar = cuentaBancaria.getSaldoActual() * 0.2;
        System.out.println("Cuanto dinero quiere retirar de manera RAPIDA?: " + "Maximo: " + maximoRetirar);
        double dinero = leer.nextDouble();
        if (dinero > maximoRetirar) {
            System.out.println("Su retiro excede el maximo disponible para la operacion.");
        } else {
            cuentaBancaria.setSaldoActual(cuentaBancaria.getSaldoActual() - dinero);
        }
    }

    public void consultarSaldo(CuentaBancaria cuentaBancaria) {
        System.out.println("Saldo actual: " + cuentaBancaria.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuentaBancaria) {
        System.out.println("Numero de cuenta: " + cuentaBancaria.getNumeroCuenta());
        System.out.println("DNI Cliente: " + cuentaBancaria.getDniCliente());
        System.out.println("Saldo disponible: " + cuentaBancaria.getSaldoActual());
    }
}
