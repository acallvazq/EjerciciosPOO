package org.campusdual.bootcamp.ingenieros.ejercicio_12.classes;

public class Vaca extends AnimaldeGranja {
    //Atributos

    //Constructores
    public Vaca() {

    }

    public Vaca(String reino, String tipo, String raza, String medio, String propietario) {
        super(reino, tipo, raza, medio, propietario);
    }

    //Metodos
    @Override
    public String toString() {
        return "Vaca{" + "Reino='" + super.getReino() + '\'' + ", tipo='" + super.getTipo() + '\'' + ", raza='" + super.getRaza() + '\'' + ", medio='" + super.getMedio() + '\'' +
                ", propietario='" + super.getPropietario() + '\'' +
                '}';
    }

    //Getters y Setters

}


