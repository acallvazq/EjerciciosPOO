package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

public class Oveja extends AnimaldeGranja {
    //Atributos

    //Constructores
    public Oveja() {

    }

    public Oveja(String reino, String tipo, String raza, String medio, String propietario) {
        super(reino, tipo, raza, medio, propietario);
    }

    //Metodos
    @Override
    public String toString() {
        return "Oveja{" + "Reino='" + super.getReino() + '\'' + ", tipo='" + super.getTipo() + '\'' + ", raza='" + super.getRaza() + '\'' + ", medio='" + super.getMedio() + '\'' +
                ", propietario='" + super.getPropietario() + '\'' +
                '}';
    }


    //Getters y Setters

}
