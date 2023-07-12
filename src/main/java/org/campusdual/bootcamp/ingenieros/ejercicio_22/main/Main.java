package org.campusdual.bootcamp.ingenieros.ejercicio_22.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;
import org.campusdual.bootcamp.ingenieros.ejercicio_14.classes.ISexual;
import org.campusdual.bootcamp.ingenieros.ejercicio_19.classes.AnimalCSV;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*List<Granjero> granjeros = new ArrayList<>();

        Datos.crearDatos();
        granjeros = Datos.getGranjeros();

        for(Granjero granjero : granjeros){
            granjero.asignarAnimales(Animal.animales);
        }
        //mostrarAnimalesGranjero(granjeros);
        //mostrarAnimales();

        AnimalCSV.guardarDatos(Animal.animales, "animalesGranjero.csv");*/

    }

    /*private static void mostrarAnimalesGranjero(List<Granjero> granjeros){
        for(Granjero granjero : granjeros){
            System.out.println("Mostrando animales del granjero " + granjero.getNombre());
            System.out.println(granjero.getAnimales());
        }
    }*/

    private static void mostrarAnimales(){
        System.out.println("\nMostrando todos los animales...");

        for (ISexual animal : Animal.animales) {
            System.out.println(animal);
        }
    }
}
