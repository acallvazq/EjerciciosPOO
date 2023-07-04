package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

import org.campusdual.bootcamp.ingenieros.ejercicio_12.classes.Animal;

public class AnimaldeGranja extends Animal implements Apropiable {
    //Atributos
    private String propietario;

    //Constructores
    public AnimaldeGranja(){

    }

    public AnimaldeGranja(String reino, String tipo, String raza, String medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio);
        this.propietario = propietario;
    }

    //Metodos

    @Override
    public String toString() {
        return "AnimaldeGranja{" +
                "propietario='" + propietario + '\'' +
                '}';
    }

    //Getters y Setters
    public String getPropietario(){
        return propietario;
    }
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }

}
