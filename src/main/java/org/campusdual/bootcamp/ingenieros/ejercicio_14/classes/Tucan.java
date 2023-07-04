package org.campusdual.bootcamp.ingenieros.ejercicio_14.classes;

public class Tucan extends AnimalSalvaje {
    //Atributos

    //Constructores
    public Tucan() {

    }

    public Tucan(String raza, String medio, Genero genero) {
        super("Ave", "Tucan", raza, medio, genero);
    }

    //Metodos
    @Override
    public String reproducirSonido(){
        return "Canto de tucán toco...";
    }

    @Override
    public String desplazarse(){
        return "Volando";
    }

    @Override
    public String toString() {
        return "Tucan{"+
                "Reino='" + super.getReino() + '\'' +
                ", tipo='" + super.getTipo() + '\'' +
                ", raza='" + super.getRaza() + '\'' +
                ", medio='" + super.getMedio() + '\'' +
                ", genero='" + super.getGenero() + '\'' +
                "}";
    }

    //Getters y Setters
}
