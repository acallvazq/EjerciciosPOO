package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

public class PezPayaso extends AnimalSalvaje {
    //Atributos

    //Constructores
    public PezPayaso() {

    }

    public PezPayaso(String reino, String tipo, String raza, String medio) {
        super(reino, tipo, raza, medio);
    }

    //Metodos
    @Override
    public String reproducirSonido(){
        return "...";
    }
    @Override
    public String desplazarse(){
        return "Nadando";
    }
    @Override
    public String toString() {
        return "Tucan{"+ "Reino='" + super.getReino() + '\'' + ", tipo='" + super.getTipo() + '\'' + ", raza='" + super.getRaza() + '\'' + ", medio='" + super.getMedio() + '\'' +
                "}";
    }
    //Getters y Setters
}
