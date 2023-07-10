package org.campusdual.bootcamp.ingenieros.ejercicio_11.classes;

import org.campusdual.bootcamp.ingenieros.ejercicio_09.classes.Animal;

public class AnimaldeGranja extends Animal implements IPropietario{
    //Atributos
    private String propietario;

    //Constructores
    public AnimaldeGranja(){

    }

    public AnimaldeGranja(String reino, String tipo, String raza, String medio, String propietario) {
        super(reino, tipo, raza, medio);
        this.propietario = propietario;
    }

    //Metodos
    @Override
    public String toString() {
        return "AnimaldeGranja{" +
                "Reino='" + super.getReino() + '\'' +
                ", tipo='" + super.getTipo() + '\'' +
                ", raza='" + super.getRaza() + '\'' +
                ", medio='" + super.getMedio() + '\'' +
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
