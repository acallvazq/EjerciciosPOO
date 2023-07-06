package org.campusdual.bootcamp.ingenieros.ejercicio_18.classes;

import java.util.ArrayList;
import java.util.List;

public class AnimalSalvaje extends Animal {
    //Atributos

    //Listas
    public static List<AnimalSalvaje> animaleSalvajes = new ArrayList<>();

    //Constructores
    public AnimalSalvaje() {

    }

    public AnimalSalvaje(String reino, String tipo, String raza, String medio, Genero genero) {
        super(reino, tipo, raza, medio, genero);
    }

    //Metodos
    @Override
    public String reproducirSonido(){
        return "";
    }
    @Override
    public String desplazarse(){
        return "";
    }
    @Override
    public String toString() {
        return "AnimalSalvaje{"+
                "Reino='" + super.getReino() + '\'' +
                ", tipo='" + super.getTipo() + '\'' +
                ", raza='" + super.getRaza() + '\'' +
                ", medio='" + super.getMedio() + '\'' +
                ", genero='" + super.getGenero() + '\'' +
                ", id='" + super.getId() + '\'' +
                "}";
    }


    //Getters y Setters

}
