package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

public class AnimalSalvaje extends Animal {
    //Atributos

    //Constructores
    public AnimalSalvaje() {

    }

    public AnimalSalvaje(String reino, String tipo, String raza, String medio) {
        super(reino, tipo, raza, medio);
    }

    public AnimalSalvaje(String reino, String tipo, String raza, String medio, Genero genero) {
        super(reino, tipo, raza, medio, genero);
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
        return "AnimalSalvaje{"+
                "Reino='" + super.getReino() + '\'' +
                ", tipo='" + super.getTipo() + '\'' +
                ", raza='" + super.getRaza() + '\'' +
                ", medio='" + super.getMedio() + '\'' +
                ", genero='" + super.getGenero() + '\'' +
                "}";
    }


    //Getters y Setters

}
