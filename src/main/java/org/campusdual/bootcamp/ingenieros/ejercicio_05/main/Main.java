package org.campusdual.bootcamp.ingenieros.ejercicio_05.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_05.classes.Input;

public class Main {
    public static void main(String[] args) {
        double numero = Input.real("Introduce un numero entero: ");

        String cadena = String.valueOf(numero);
        float decimal = Float.parseFloat(cadena.substring(cadena.indexOf('.')));

        System.out.println("El numero "+ numero + " tiene como parte entera " + (int)numero + " y parte decimal " + decimal);
    }
}