package org.campusdual.bootcamp.ingenieros.ejercicio_12.classes;

public class Tucan extends AnimalSalvaje {
    //Atributos

    //Constructores
    public Tucan() {

    }

    public Tucan(String reino, String tipo, String raza, String medio) {
        super(reino, tipo, raza, medio);
    }

    //Metodos
    @Override
    public String toString() {
        return "Tucan{"+ "Reino='" + super.getReino() + '\'' + ", tipo='" + super.getTipo() + '\'' + ", raza='" + super.getRaza() + '\'' + ", medio='" + super.getMedio() + '\'' +
                "}";
    }

    //Getters y Setters
}
