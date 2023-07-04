package org.campusdual.bootcamp.ingenieros.ejercicio_04.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_04.classes.Input;

public class Main {
    public static void main(String[] args) {
        int factorial = 1;
        int numero = Input.integer("Introduce un numero entero: ");

        for(int i = numero; i >= 1; i--) factorial *= i;
        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}