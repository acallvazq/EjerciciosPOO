package org.campusdual.bootcamp.ingenieros.ejercicio_22.classes;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;

import java.util.List;

public class Granjero {
    //Atributos
    private String nombre;
    private List<Animal> animales;

    //Constructores
    public Granjero(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    void agregarAnimal(Animal animal){
        animales.add(animal);
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

}
