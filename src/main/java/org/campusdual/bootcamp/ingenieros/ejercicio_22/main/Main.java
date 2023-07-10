package org.campusdual.bootcamp.ingenieros.ejercicio_22.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.Animal;
import org.campusdual.bootcamp.ingenieros.ejercicio_14.classes.ISexual;
import org.campusdual.bootcamp.ingenieros.ejercicio_19.classes.AnimalCSV;
import org.campusdual.bootcamp.ingenieros.util.Input;

public class Main {
    public static void main(String[] args) {
        init();


        mostrarAnimales();

    }

    private static void init(){
        //Cargar datos del CSV
        Animal.animales = AnimalCSV.cargarDatos("animales.csv");
    }

    private static void mostrarAnimales(){
        System.out.println("\nMostrando todos los animales...");

        for (ISexual animal : Animal.animales) {
            System.out.println(animal);
        }
    }
}
