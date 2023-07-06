package org.campusdual.bootcamp.ingenieros.ejercicio_16.classes;

import java.util.ArrayList;
import java.util.List;

public class AnimaldeGranja extends Animal implements Apropiable {
    //Atributos
    private String propietario;

    //Listas
    public static List<AnimaldeGranja> animalesGranja = new ArrayList<>();

    //Constructores
    public AnimaldeGranja(){

    }

    public AnimaldeGranja(String reino, String tipo, String raza, String medio, Genero genero, String propietario) {
        super(reino, tipo, raza, medio, genero);
        this.propietario = propietario;
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
        return "AnimaldeGranja{" +
                "Reino='" + super.getReino() + '\'' +
                ", tipo='" + super.getTipo() + '\'' +
                ", raza='" + super.getRaza() + '\'' +
                ", medio='" + super.getMedio() + '\'' +
                ", genero='" + super.getGenero() + '\'' +
                ", id='" + super.getId() + '\'' +
                ", propietario='" + propietario + '\'' +
                '}';
    }

    //Getters y Setters
    @Override
    public String getPropietario(){
        return propietario;
    }
    @Override
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }

}
