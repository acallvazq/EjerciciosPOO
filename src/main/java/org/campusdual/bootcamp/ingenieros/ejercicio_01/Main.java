package org.campusdual.bootcamp.ingenieros.ejercicio_01;

import org.campusdual.bootcamp.ingenieros.util.Input;

public class Main {
    public static void main(String[] args) {
        int numero = Input.integer ("Introduce un numero entero: ");

        if (numero % 2 == 0) System.out.println ("El numero es par");
        else System.out.println ("El numero es impar");
    }
}