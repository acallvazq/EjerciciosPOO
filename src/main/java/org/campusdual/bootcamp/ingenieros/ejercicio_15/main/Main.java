package org.campusdual.bootcamp.ingenieros.ejercicio_15.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;
import org.campusdual.bootcamp.ingenieros.ejercicio_14.classes.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DatosAnimales.crearDatos();

        //Clasificar animales
        clasificarAnimales();

        //Mostrar contenido de las listas AnimaldeGranja, AnimalSalvaje y Mascota
        imprimirLista(Mascota.mascotas, "Mostrando el contenido de la lista de mascotas...");
        imprimirLista(AnimaldeGranja.animalesGranja, "Mostrando el contenido de la lista de animales de granja...");
        imprimirLista(AnimalSalvaje.animaleSalvajes, "Mostrando el contenido de la lista de animales salvajes...");
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
