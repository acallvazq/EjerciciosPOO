package org.campusdual.bootcamp.ingenieros.ejercicio_15.classes;

public class PezPayaso extends AnimalSalvaje {
    //Atributos

    //Constructores
    public PezPayaso() {

    }

    public PezPayaso(String raza, String medio, Genero genero) {
        super("Pez", "Pez payaso", raza, medio, genero);
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
        return "Tucan{"+
                "Reino='" + super.getReino() + '\'' +
                ", tipo='" + super.getTipo() + '\'' +
                ", raza='" + super.getRaza() + '\'' +
                ", genero='" + super.getGenero() + '\'' +
                ", medio='" + super.getMedio() + '\'' +
                "}";
    }
    //Getters y Setters
}
