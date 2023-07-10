package org.campusdual.bootcamp.ingenieros.ejercicio_22.classes;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;

import java.util.List;

public class Granjero {
    //Atributos
    private String nombre;
    private int edad;
    private String dni;
    private List<Animal> animales;

    //Constructores
    public Granjero(String nombre, int edad, String dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;

    }

    //Metodos

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
