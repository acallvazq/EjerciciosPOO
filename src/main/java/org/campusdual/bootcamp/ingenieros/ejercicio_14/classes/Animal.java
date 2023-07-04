package org.campusdual.bootcamp.ingenieros.ejercicio_14.classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements Cloneable, ISexual {
    public enum Genero {
        Macho,
        Hembra
    }
    //Atributos
    private String reino;  //mamifero, ave
    private String tipo;  //gato, periquito
    private String raza;
    private String medio;  //acuatico, aereo
    private Genero genero;

    //Listas
    public static List<ISexual> animales = new ArrayList<>();

    //Constructores
    public Animal(){

    }

    public Animal(String reino, String tipo, String raza, String medio, Genero genero){
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
        this.genero = genero;
    }

    //Constructor de copia
    public Animal(Animal animal){
        this.reino = animal.reino;
        this.tipo = animal.tipo;
        this.raza = animal.raza;
        this.medio = animal.medio;
        this.genero = animal.genero;
    }

    //Metodos
    public void reproducirse(ISexual pareja){
        if(this.getClass() == pareja.getClass() && this.getGenero() != ((Animal) pareja).getGenero()){
            System.out.println("Reproduciendo...");
        }else System.out.println("No se pueden reproducir");
    }

    @Override
    public Animal clone() throws CloneNotSupportedException {
        return (Animal) super.clone();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "reino='" + reino + '\'' +
                ", tipo='" + tipo + '\'' +
                ", raza='" + raza + '\'' +
                ", medio='" + medio + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    //Metodos abstractos
    public abstract String reproducirSonido();
    public abstract String desplazarse();


    //Getters y Setters
    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
