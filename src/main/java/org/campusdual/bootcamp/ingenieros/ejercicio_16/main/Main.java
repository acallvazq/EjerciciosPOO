package org.campusdual.bootcamp.ingenieros.ejercicio_16.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;
import org.campusdual.bootcamp.ingenieros.ejercicio_14.classes.ISexual;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Crear los objetos
        Perro perro1 = new Perro("Pastor aleman", "Terrestre", Animal.Genero.Macho, -1, -1, "Pluto", "Manuel");
        Perro perro2 = new Perro("Pastor suizo", "Terrestre", Animal.Genero.Hembra, -1, -1, "Kida", "Manuel");
        Perro perro3 = new Perro("Husky", "Terrestre", Animal.Genero.Hembra, -1, -1, "Luna", "Esteban");
        Perro perro4 = new Perro("Husky", "Terrestre", Animal.Genero.Macho, -1, -1, "Colmillo", "Esteban");
        Gato gato1 = new Gato("Snowshoe", "Terrestre", Animal.Genero.Macho, -1, -1, "Mochuelo", "Alba");
        Gato gato2 = new Gato("American Shorthair", "Terrestre", Animal.Genero.Hembra, -1, -1, "Lana", "Alba");
        Gato gato3 = new Gato("Persa", "Terrestre", Animal.Genero.Hembra, -1, -1, "Jenni", "Lucia");
        Gato gato4 = new Gato("Persa", "Terrestre", Animal.Genero.Macho, -1, -1, "Don Gato", "Lucia");
        Tucan tucan1 = new Tucan("Toco", "Aereo", Animal.Genero.Macho, -1, -1);
        Tucan tucan2 = new Tucan("Toco", "Aereo", Animal.Genero.Hembra, -1, -1);
        Tucan tucan3 = new Tucan("Toco", "Aereo", Animal.Genero.Hembra, -1, -1);
        Tucan tucan4 = new Tucan("Toco", "Aereo", Animal.Genero.Hembra, -1, -1);
        PezPayaso pez1 = new PezPayaso("Comun", "Acuatico", Animal.Genero.Macho, -1, -1);
        PezPayaso pez2 = new PezPayaso("Comun", "Acuatico", Animal.Genero.Hembra, -1, -1);
        PezPayaso pez3 = new PezPayaso("Comun", "Acuatico", Animal.Genero.Hembra, -1, -1);
        PezPayaso pez4 = new PezPayaso("Comun", "Acuatico", Animal.Genero.Macho, -1, -1);
        Vaca vaca1 = new Vaca("Rubia gallega", "Terrestre", Animal.Genero.Macho, -1, -1, "Francisco");
        Vaca vaca2 = new Vaca("Rubia gallega", "Terrestre", Animal.Genero.Hembra, -1, -1, "Francisco");
        Vaca vaca3 = new Vaca("Holstein", "Terrestre", Animal.Genero.Hembra, -1, -1, "Alejandro");
        Vaca vaca4 = new Vaca("Holstein", "Terrestre", Animal.Genero.Macho, -1, -1, "Alejandro");
        Oveja oveja1 = new Oveja("Texel", "Terrestre", Animal.Genero.Macho, -1, -1, "Francisco");
        Oveja oveja2 = new Oveja("Texel", "Terrestre", Animal.Genero.Hembra, -1, -1, "Francisco");
        Oveja oveja3 = new Oveja("Dorper", "Terrestre", Animal.Genero.Hembra, -1, -1, "Samuel");
        Oveja oveja4 = new Oveja("Dorper", "Terrestre", Animal.Genero.Macho, -1, -1, "Samuel");

        //Guardar los animales en la lista
        Animal.animales.add(perro1);
        Animal.animales.add(perro2);
        Animal.animales.add(perro3);
        Animal.animales.add(perro4);
        Animal.animales.add(gato1);
        Animal.animales.add(gato2);
        Animal.animales.add(gato3);
        Animal.animales.add(gato4);
        Animal.animales.add(tucan1);
        Animal.animales.add(tucan2);
        Animal.animales.add(tucan3);
        Animal.animales.add(tucan4);
        Animal.animales.add(pez1);
        Animal.animales.add(pez2);
        Animal.animales.add(pez3);
        Animal.animales.add(pez4);
        Animal.animales.add(vaca1);
        Animal.animales.add(vaca2);
        Animal.animales.add(vaca3);
        Animal.animales.add(vaca4);
        Animal.animales.add(oveja1);
        Animal.animales.add(oveja2);
        Animal.animales.add(oveja3);
        Animal.animales.add(oveja4);

        //Criar animales
        criarAnimales();
    }

    private static void criarAnimales(){
        Map <Integer, Integer> nCrias = new HashMap<>();
        List<ISexual> crias = new ArrayList<>();
        int pareja;
        int clave = 1;
        String concatena;
        boolean tieneCrias = false;

        for(int i = 1; i <= 2; i++) {
            System.out.println("\n\n[Consultoria] -> Agregando la generacion " + i + "...");

            for (ISexual animal1 : Animal.animales) {
                for (ISexual animal2 : Animal.animales) {
                    if ((animal2.getClass() == animal1.getClass()) && ((Animal) animal2).getGenero() != ((Animal) animal1).getGenero() && ((Animal) animal1).getGenero() == Animal.Genero.Macho) {
                        System.out.println("[Servidor] -> Preparandose " + ((Animal) animal1).getId() + " y " + ((Animal) animal2).getId());

                        if(((Animal) animal1).getIdPadre() == ((Animal) animal2).getIdPadre() || ((Animal) animal1).getIdMadre() == ((Animal) animal2).getIdMadre()) {
                            if (((Animal) animal1).getIdPadre() != -1 || ((Animal) animal2).getIdPadre() != -1){
                                System.out.println("[Base de datos] -> " + ((Animal) animal1).getId() + " y " + ((Animal) animal2).getId() + " son hermanos. Saliendo...");
                                continue;
                            }

                        }

                        if(((Animal) animal1).getIdPadre() == ((Animal) animal2).getId() || ((Animal) animal1).getIdMadre() == ((Animal) animal2).getId() || ((Animal) animal2).getIdPadre() == ((Animal) animal1).getId() || ((Animal) animal2).getIdMadre() == ((Animal) animal1).getId()){
                            System.out.println("[Base de datos] -> " + ((Animal) animal1).getId() + " y " + ((Animal) animal2).getId() + " son padre e hijo. Saliendo...");
                            continue;
                        }

                        String id1 = String.valueOf(((Animal) animal1).getId());
                        String id2 = String.valueOf(((Animal) animal2).getId());

                        if(((Animal) animal1).getId() <= ((Animal) animal2).getId()) {
                            concatena = id1 + id2;
                        }else{
                            concatena = id2 + id1;
                        }

                        pareja = Integer.parseInt(concatena);

                        for(Map.Entry<Integer, Integer> mapa: nCrias.entrySet()){
                            if(mapa.getValue() == pareja){
                                System.out.println("[Base de datos] -> " + ((Animal) animal1).getId() + " y " + ((Animal) animal2).getId() + " ya tuvieron crias. Saliendo...");
                                tieneCrias = true;
                                break;
                            }else tieneCrias = false;
                        }
                        if(tieneCrias == false) {
                            nCrias.put(clave, pareja);
                            clave++;
                        }else continue;

                        ISexual cria1 = animal1.reproducirse(animal2);
                        ISexual cria2 = animal1.reproducirse(animal2);
                        ISexual cria3 = animal1.reproducirse(animal2);

                        crias.add(cria1);
                        crias.add(cria2);
                        crias.add(cria3);
                        System.out.println("[Servidor] -> " + ((Animal) animal1).getId() + " y " + ((Animal) animal2).getId() + " han tenido 3 crias con id "+ ((Animal) cria1).getId() + ", "+ ((Animal) cria2).getId() + " y " + ((Animal) cria3).getId());

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
