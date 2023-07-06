package org.campusdual.bootcamp.ingenieros.ejercicio_16.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_16.classes.*;

import java.util.List;
import java.util.ArrayList;

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

        for (ISexual animal1 : Animal.animales) {
            System.out.println(animal1);
        }

        //Criar animales
        //criarAnimales();
    }

    private static void criarAnimales(){
        List<ISexual> crias = new ArrayList<>();

        for(int i = 1; i <= 2; i++) {
            System.out.println("\n\nAgregando la generacion " + i + "...");

            for (ISexual animal1 : Animal.animales) {
                for (ISexual animal2 : Animal.animales) {
                    if ((animal2.getClass() == animal1.getClass()) && ((Animal) animal2).getGenero() != ((Animal) animal1).getGenero()) {
                        crias.add(animal1.reproducirse(animal2));
                        System.out.println(((Animal) animal1).getTipo() + " y " + ((Animal) animal2).getTipo() + " han tenido una cria");
                    }
                }
            }

            for (ISexual cria : crias) {
                Animal.animales.add(cria);
            }
        }
    }

    private static void clasificarAnimales(){
        for(ISexual animal: Animal.animales){
            if((animal.getClass().getSuperclass().getName()).contains("Mascota")) {
                Mascota.mascotas.add((Mascota) animal);

            }else if((animal.getClass().getSuperclass().getName()).contains("AnimaldeGranja")){
                AnimaldeGranja.animalesGranja.add((AnimaldeGranja) animal);

            }else if((animal.getClass().getSuperclass().getName()).contains("AnimalSalvaje")){
                AnimalSalvaje.animaleSalvajes.add((AnimalSalvaje) animal);
            }
        }
    }

    private static void imprimirLista(List<? extends ISexual> animales, String texto){
        System.out.println("\n" + texto);
        for(ISexual animal: animales){
            System.out.println(animal);
        }
    }
}
