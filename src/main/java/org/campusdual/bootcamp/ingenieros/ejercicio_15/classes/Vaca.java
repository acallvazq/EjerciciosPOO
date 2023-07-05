package org.campusdual.bootcamp.ingenieros.ejercicio_15.classes;

public class Vaca extends AnimaldeGranja {
    //Atributos

    //Constructores
    public Vaca() {

    }

    public Vaca(String raza, String medio, Genero genero, String propietario) {
        super("Mamifero", "Vaca", raza, medio, genero, propietario);
    }

    //Metodos
    @Override
    public String reproducirSonido(){
        return "Muuu";
    }

    @Override
    public String desplazarse(){
        return "Caminando";
    }
    @Override
    public String toString() {
        return "Vaca{" +
                "Reino='" + super.getReino() + '\'' +
                ", tipo='" + super.getTipo() + '\'' +
                ", raza='" + super.getRaza() + '\'' +
                ", medio='" + super.getMedio() + '\'' +
                ", genero='" + super.getGenero() + '\'' +
                ", propietario='" + super.getPropietario() + '\'' +
                '}';
    }

    //Getters y Setters

}


