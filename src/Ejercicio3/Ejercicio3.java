/*
 * Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos:
 * nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir
 * algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.
 * En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
 * Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
 * Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y
 * después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba
 * que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 * Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta
 * fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y
 * la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que
 * la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un
 * valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 */
package Ejercicio3;

import Ejercicio3.entidades.Persona;
import Ejercicio3.servicios.PersonaServicio;

/**
 *
 * @author Marcelo
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        PersonaServicio servicio = new PersonaServicio();
        int[] IMC = new int[4];
        boolean[] EDADES = new boolean[4];
//        Persona persona1 = new Persona("Yasar",29,"h",114,1.79);
//        Persona persona2 = new Persona("Victoria",31,"m",80,1.69);
//        Persona persona3 = new Persona("Enzo",17,"h",75,1.83);
//        Persona persona4 = new Persona("Eric",25,"h",50,1.75);

        Persona persona1 = servicio.crearPersona();
        servicio.calcularIMC(persona1);
        servicio.esMayorDeEdad(persona1);
        IMC[0] = servicio.calcularIMC(persona1);
        EDADES[0] = servicio.esMayorDeEdad(persona1);

        Persona persona2 = servicio.crearPersona();
        servicio.calcularIMC(persona2);
        servicio.esMayorDeEdad(persona2);
        IMC[1] = servicio.calcularIMC(persona2);
        EDADES[1] = servicio.esMayorDeEdad(persona2);

        Persona persona3 = servicio.crearPersona();
        servicio.calcularIMC(persona3);
        servicio.esMayorDeEdad(persona3);
        IMC[2] = servicio.calcularIMC(persona3);
        EDADES[2] = servicio.esMayorDeEdad(persona3);

        Persona persona4 = servicio.crearPersona();
        servicio.calcularIMC(persona4);
        servicio.esMayorDeEdad(persona4);
        IMC[3] = servicio.calcularIMC(persona4);
        EDADES[3] = servicio.esMayorDeEdad(persona4);

        calcularPromEdades(EDADES);
        calcularPromImc(IMC);

    }

    public static void calcularPromEdades(boolean[] Edades) {
        int mayores = 0;
        int menores = 0;
        int porcMayores = 0;
        int porcMenores = 0;
        for (int i = 0; i < Edades.length; i++) {
            if (Edades[i]) {
                mayores++;
            } else {
                menores++;
            }
        }
        porcMayores = ((mayores * 100) / Edades.length);
        System.out.println("Porcentaje Mayores: " + porcMayores + "%");
        porcMenores = ((menores * 100) / Edades.length);
        System.out.println("Porcentaje Menores: " + porcMenores + "%");

    }

    public static void calcularPromImc(int[] IMC) {
        //bajo peso -1
        //ideal 0
        //sobrepeso 1
        int bajoPeso = 0;
        int pesoIdeal = 0;
        int sobrePeso = 0;
        int porBajo = 0;
        int porIdeal = 0;
        int porSobre = 0;
        for (int i = 0; i < IMC.length; i++) {
            if (IMC[i] == -1) {
                bajoPeso++;
            }
            if (IMC[i] == 0) {
                pesoIdeal++;
            }
            if (IMC[i] == 1) {
                sobrePeso++;
            }
        }
        porBajo = ((bajoPeso * 100) / IMC.length);
        System.out.println("Porcentaje bajo peso: " + porBajo + "%");
        porIdeal = ((pesoIdeal * 100) / IMC.length);
        System.out.println("Porcentaje peso ideal: " + porIdeal + "%");
        porSobre = ((sobrePeso * 100) / IMC.length);
        System.out.println("Porcentaje sobrepeso: " + porSobre + "%");
    }

}
