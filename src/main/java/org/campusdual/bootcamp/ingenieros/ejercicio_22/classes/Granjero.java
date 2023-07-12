package org.campusdual.bootcamp.ingenieros.ejercicio_22.classes;

import org.campusdual.bootcamp.ingenieros.ejercicio_11.classes.IPropietario;
import org.campusdual.bootcamp.ingenieros.ejercicio_14.classes.ISexual;

import java.util.ArrayList;
import java.util.List;

public class Granjero {
    //Atributos
    private String nombre;
    private List<ISexual> animales = new ArrayList<>();

    //Constructores
    public Granjero(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    public void asignarAnimales(List<ISexual> animales){
        for(ISexual animal: animales){
            if(animal instanceof IPropietario){
                if(((IPropietario)animal).getPropietario().equals(this.getNombre())){
                    this.animales.add(animal);
                }
            }
        }
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ISexual> getAnimales() {
        return animales;
    }

    public void setAnimales(List<ISexual> animales) {
        this.animales = animales;
    }

}
