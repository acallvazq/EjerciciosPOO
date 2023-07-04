package org.campusdual.bootcamp.ingenieros.ejercicio_06.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_05.classes.Input;

public class Main {
    public static void main(String[] args) {
        int numero = Input.integer("Introduce el numero de elementos: ");

        for(int n1 = 1, n2 = 0, n3 = 0, i = 0; i < numero; i++){
            n2 = n3;
            n3 += n1;
            n1 = n2;

            System.out.print(n1+ " ");
        }
    }
}