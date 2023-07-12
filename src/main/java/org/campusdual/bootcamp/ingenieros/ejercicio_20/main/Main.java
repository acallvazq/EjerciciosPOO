package org.campusdual.bootcamp.ingenieros.ejercicio_20.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_14.classes.ISexual;
import org.campusdual.bootcamp.ingenieros.ejercicio_19.classes.AnimalCSV;
import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;

public class Main {
    public static void main(String[] args) {
        //Cargar datos del CSV
        System.out.println("\nLeyendo del archivo CSV...");
        Animal.animales = AnimalCSV.cargarDatos("animales.csv");

        DatosAnimales.mostrarDatos();
    }
}
