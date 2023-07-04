package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

public class AnimalSalvaje extends Animal {
    //Atributos

    //Constructores
    public AnimalSalvaje() {

    }

    public AnimalSalvaje(String reino, String tipo, String raza, String medio) {
        super(reino, tipo, raza, medio);
    }

    //Metodos
    @Override
    public String toString() {
        return "AnimalSalvaje{"+ "Reino='" + super.getReino() + '\'' + ", tipo='" + super.getTipo() + '\'' + ", raza='" + super.getRaza() + '\'' + ", medio='" + super.getMedio() + '\'' +
                "}";
    }


    //Getters y Setters

}
