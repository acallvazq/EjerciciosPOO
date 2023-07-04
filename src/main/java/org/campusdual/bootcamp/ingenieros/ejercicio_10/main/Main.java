package org.campusdual.bootcamp.ingenieros.ejercicio_10.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_10.classes.Animal;

public class Main {

    public static void main(String[] args) {
        //Constructor vacio
        Animal animal1 = new Animal();

        //Definiendo todos los atributos
        Animal animal2 = new Animal("Ave","Ave rapaz", "Elanio azul", "Aereo");
        Animal animal3 = new Animal("Mamifero","Gato", "American shorthair", "Terrestre");

        //Constructor de copia
        Animal animal4 = new Animal(animal3);

        //Metodo clone
        Animal animal5 = null;
        try {
            animal5 = animal3.clone();
        }catch(CloneNotSupportedException cnse){
            cnse.printStackTrace();
        }

        //Mostrar por pantalla los datos
        System.out.println("Animal 1: " + animal1);
        System.out.println("Animal 2: " + animal2);
        System.out.println("Animal 3: " + animal3);
        System.out.println("Animal 4: " + animal4);
        System.out.println("Animal 5: " + animal5);
    }
}