package org.campusdual.bootcamp.ingenieros.ejercicio_19.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;
import org.campusdual.bootcamp.ingenieros.ejercicio_19.classes.AnimalCSV;

public class Main {
    public static void main(String[] args) {
        //Crear los objetos
        Perro perro1 = new Perro("Pastor aleman", "Terrestre", Animal.Genero.Macho, "Pluto", "Manuel");
        Perro perro2 = new Perro("Pator suizo", "Terrestre", Animal.Genero.Hembra, "Kida", "Manuel");
        Perro perro3 = new Perro("Pator suizo", "Terrestre", Animal.Genero.Hembra, perro1.getId(), perro2.getId(), "Mora", "Manuel");
        Gato gato1 = new Gato("Snowshoe", "Terrestre", Animal.Genero.Macho, "Mochuelo", "Alba");
        Gato gato2 = new Gato("American Shorthair", "Terrestre", Animal.Genero.Hembra, "Lana", "Alba");
        Gato gato3 = new Gato("Siames", "Terrestre", Animal.Genero.Macho, gato1.getId(), gato2.getId(), "Don gato", "Alba");
        Tucan tucan1 = new Tucan("Toco", "Aereo", Animal.Genero.Macho);
        Tucan tucan2 = new Tucan("Toco", "Aereo", Animal.Genero.Hembra);
        Tucan tucan3 = new Tucan("Toco", "Aereo", Animal.Genero.Hembra, tucan1.getId(), tucan2.getId());
        PezPayaso pez1 = new PezPayaso("Comun", "Acuatico", Animal.Genero.Macho);
        PezPayaso pez2 = new PezPayaso("Comun", "Acuatico", Animal.Genero.Hembra);
        PezPayaso pez3 = new PezPayaso("Comun", "Acuatico", Animal.Genero.Hembra, pez1.getId(), pez2.getId());
        Vaca vaca1 = new Vaca("Rubia gallega", "Terrestre", Animal.Genero.Macho, "Francisco");
        Vaca vaca2 = new Vaca("Rubia gallega", "Terrestre", Animal.Genero.Hembra, "Francisco");
        Vaca vaca3 = new Vaca("Rubia gallega", "Terrestre", Animal.Genero.Macho, vaca1.getId(), vaca2.getId(), "Francisco");
        Oveja oveja1 = new Oveja("Texel", "Terrestre", Animal.Genero.Macho, "Francisco");
        Oveja oveja2 = new Oveja("Texel", "Terrestre", Animal.Genero.Hembra, "Francisco");
        Oveja oveja3 = new Oveja("Texel", "Terrestre", Animal.Genero.Hembra, oveja1.getId(), oveja2.getId(), "Francisco");

        //Guardar los animales en la lista
        Animal.animales.add(perro1);
        Animal.animales.add(perro2);
        Animal.animales.add(perro3);
        Animal.animales.add(gato1);
        Animal.animales.add(gato2);
        Animal.animales.add(gato3);
        Animal.animales.add(tucan1);
        Animal.animales.add(tucan2);
        Animal.animales.add(tucan3);
        Animal.animales.add(pez1);
        Animal.animales.add(pez2);
        Animal.animales.add(pez3);
        Animal.animales.add(vaca1);
        Animal.animales.add(vaca2);
        Animal.animales.add(vaca3);
        Animal.animales.add(oveja1);
        Animal.animales.add(oveja2);
        Animal.animales.add(oveja3);

        //Guardar en CSV
        AnimalCSV.guardarDatos(Animal.animales, "animales.csv");
    }
}
