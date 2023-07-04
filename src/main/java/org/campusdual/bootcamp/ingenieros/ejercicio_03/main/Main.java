package org.campusdual.bootcamp.ingenieros.ejercicio_03.main;

import org.campusdual.bootcamp.ingenieros.util.Input;
public class Main {
    public static void main(String [] args) {
        int numero = Input.integer("Introduce un numero entero: ");

        System.out.print ("Los divisores de " + numero + " son: ");
        for(int i = 1; i <= numero; i++){
            if (numero % i == 0) System.out.print (i + " ");
        }
    }
}