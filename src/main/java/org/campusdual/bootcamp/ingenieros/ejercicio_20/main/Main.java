package org.campusdual.bootcamp.ingenieros.ejercicio_20.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_14.classes.ISexual;
import org.campusdual.bootcamp.ingenieros.ejercicio_19.classes.AnimalCSV;
import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Crear los objetos
        Perro perro1 = new Perro("Pastor aleman", "Terrestre", Animal.Genero.Macho, "Pluto", "Manuel");
        Perro perro2 = new Perro("Pator suizo", "Terrestre", Animal.Genero.Hembra, "Kida", "Manuel");
        Gato gato1 = new Gato("Snowshoe", "Terrestre", Animal.Genero.Macho, "Mochuelo", "Alba");
        Gato gato2 = new Gato("American Shorthair", "Terrestre", Animal.Genero.Hembra, "Lana", "Alba");
        Tucan tucan1 = new Tucan("Toco", "Aereo", Animal.Genero.Macho);
        Tucan tucan2 = new Tucan("Toco", "Aereo", Animal.Genero.Hembra);
        PezPayaso pez1 = new PezPayaso("Comun", "Acuatico", Animal.Genero.Macho);
        PezPayaso pez2 = new PezPayaso("Comun", "Acuatico", Animal.Genero.Hembra);
        Vaca vaca1 = new Vaca("Rubia gallega", "Terrestre", Animal.Genero.Macho, "Francisco");
        Vaca vaca2 = new Vaca("Rubia gallega", "Terrestre", Animal.Genero.Hembra, "Francisco");
        Oveja oveja1 = new Oveja("Texel", "Terrestre", Animal.Genero.Macho, "Francisco");
        Oveja oveja2 = new Oveja("Texel", "Terrestre", Animal.Genero.Hembra, "Francisco");

        //Guardar los animales en la lista
        Animal.animales.add(perro1);
        Animal.animales.add(perro2);
        Animal.animales.add(gato1);
        Animal.animales.add(gato2);
        Animal.animales.add(tucan1);
        Animal.animales.add(tucan2);
        Animal.animales.add(pez1);
        Animal.animales.add(pez2);
        Animal.animales.add(vaca1);
        Animal.animales.add(vaca2);
        Animal.animales.add(oveja1);
        Animal.animales.add(oveja2);

        //Cargar datos del CSV
        List<ISexual> animales2;
        animales2 = AnimalCSV.cargarDatos("animales.csv");

        //Imprime lista
        for (ISexual animal1 : animales2) {
            System.out.println(animal1);
        }
    }
}
