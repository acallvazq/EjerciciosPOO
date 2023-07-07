package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

public class Oveja extends AnimaldeGranja {
    //Atributos

    //Constructores
    public Oveja() {

    }

    public Oveja(String reino, String tipo, String raza, String medio, String propietario) {
        super(reino, tipo, raza, medio, propietario);
    }

    public Oveja(String raza, String medio, Genero genero, String propietario) {
        super("Mamifero", "Oveja", raza, medio, genero, propietario);
    }

    //Metodos
    @Override
    public String reproducirSonido(){
        return "Bee";
    }

    @Override
    public String desplazarse(){
        return "Corriendo";
    }

    @Override
    public String toString() {
        return "Oveja{" +
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
