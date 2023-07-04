package org.campusdual.bootcamp.ingenieros.ejercicio_09.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_09.classes.Animal;
public class Main {

    public static void main(String[] args) {
        //Constructor vacio
        Animal animal1 = new Animal();

        //Definiendo todos los atributos
        Animal animal2 = new Animal("Ave","Ave rapaz", "Elanio azul", "Sabana");
        Animal animal3 = new Animal("Mamifero","Gato", "American shorthair", "Bosque");

        //Mostrar por pantalla los datos
        System.out.println("Animal 1: " + animal1);
        System.out.println("Animal 2: " + animal2);
        System.out.println("Animal 3: " + animal3);

    }
}
