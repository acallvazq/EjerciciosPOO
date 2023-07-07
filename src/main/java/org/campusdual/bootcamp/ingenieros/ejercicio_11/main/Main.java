package org.campusdual.bootcamp.ingenieros.ejercicio_11.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_09.classes.Animal;
import org.campusdual.bootcamp.ingenieros.ejercicio_11.classes.*;

public class Main {
    public static void main(String[] args) {
        //Crear instancias
        Animal animal1 = new Animal("Ave","Ave rapaz", "Elanio azul", "Aereo");
        Animal animal2 = new AnimaldeGranja("Ave", "Pato", "Rouen", "Acuatico", "Miguel");
        AnimaldeGranja oveja = new AnimaldeGranja("Mamifero", "Oveja", "Texel", "Terrestre", "Francisco");
        Mascota gato = new Mascota("Mamifero", "Gato", "Snowshoe", "Terrestre", "Mochuelo", "Alba");

        //Mostrar por pantalla los datos
        System.out.println("Animal 1: " + animal1);
        System.out.println("Animal 2: " + animal2);
        System.out.println("Oveja: " + oveja);
        System.out.println("Gato: " + gato);
    }

}
