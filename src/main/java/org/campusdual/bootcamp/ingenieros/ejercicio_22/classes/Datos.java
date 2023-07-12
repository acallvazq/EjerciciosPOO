package org.campusdual.bootcamp.ingenieros.ejercicio_22.classes;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;
import org.campusdual.bootcamp.ingenieros.ejercicio_14.classes.ISexual;

import java.util.*;

public class Datos {
    //Atributos
    private static final String[] tipos = {"Perro", "Gato", "Tucan", "PezPayaso", "Oveja", "Vaca"};
    private static final String[] nombres = {"Luna", "Simba", "Lana", "Pipa", "Coco", "Mochuelo", "Pluto", "Kida", "Jenni", "Colmillo", "Kiara"};
    private static final String[] gatos = {"Snowshoe", "Siames", "Persa", "American shorthair", "British shorthair", "Angora", "Bobtail"};
    private static final String[] perros = {"Pastor aleman", "Pastor suizo", "Husky", "Yorkshire", "Caniche", "Shiba inu", "Bulldog francces"};
    private static final String[] nombresgranjeros = {"Alba", "Manuel", "Francisco", "Lucia", "Alejandro", "Maria", "Samuel"};
    private static final List<Granjero> granjeros = new ArrayList<>();
    private static final Random aleatorio = new Random();

    //metodos
    public static void crearDatos(){
        String tipo, raza, nombre;

        for(int i = 0; i < 50; i++) {
            tipo = tipos[aleatorio.nextInt(tipos.length)];
            Granjero granjero;
            Animal.Genero genero;
            ISexual animal = null;

            crearGranjeros();

            if (aleatorio.nextDouble() == 0) genero = Animal.Genero.Hembra;
            else genero = Animal.Genero.Macho;

            switch (tipo) {
                case "Perro":
                    raza = perros[aleatorio.nextInt(perros.length)];
                    nombre = nombres[aleatorio.nextInt(nombres.length)];
                    granjero = granjeros.get(aleatorio.nextInt(granjeros.size()));

                    animal = new Perro(raza, "Terrestre", genero, -1, -1, nombre, granjero.getNombre());

                    break;
                case "Gato":
                    raza = gatos[aleatorio.nextInt(gatos.length)];
                    nombre = nombres[aleatorio.nextInt(nombres.length)];
                    granjero = granjeros.get(aleatorio.nextInt(granjeros.size()));

                    animal = new Gato(raza, "Terrestre", genero, -1, -1, nombre, granjero.getNombre());

                    break;
                case "Tucan":
                    animal = new Tucan("Toco", "Aereo", genero, -1, -1);

                    break;
                case "PezPayaso":
                    animal = new PezPayaso("Comun", "Acuatico", genero, -1, -1);

                    break;
                case "Oveja":
                    granjero = granjeros.get(aleatorio.nextInt(granjeros.size()));
                    animal = new Oveja("Texel", "Terrestre", Animal.Genero.Macho, -1, -1, granjero.getNombre());

                    break;
                case "Vaca":
                    granjero = granjeros.get(aleatorio.nextInt(granjeros.size()));
                    animal = new Vaca("Rubia gallega", "Terrestre", genero, -1, -1, granjero.getNombre());

                    break;
            }

            Animal.animales.add(animal);
        }

    }

    private static void criarAnimales(){
        Map<Integer, Integer> nCrias = new HashMap<>();
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

    private static void crearGranjeros(){
        for(String name : nombresgranjeros){
            Granjero granjero = new Granjero(name);
            System.out.println(granjero.getNombre());
            granjeros.add(granjero);
        }
    }

    //Getters y Setters
    public static List<Granjero> getGranjeros() {
        return granjeros;
    }
}
