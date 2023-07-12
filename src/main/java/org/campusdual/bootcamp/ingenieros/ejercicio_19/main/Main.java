package org.campusdual.bootcamp.ingenieros.ejercicio_19.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;
import org.campusdual.bootcamp.ingenieros.ejercicio_19.classes.AnimalCSV;

public class Main {
    public static void main(String[] args) {
        DatosAnimales.crearDatos();
        DatosAnimales.criarAnimales(2, 3);

        //Guardar en CSV
        AnimalCSV.guardarDatos(Animal.animales, "animales.csv");
    }
}
