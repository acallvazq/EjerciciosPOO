package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

public class Gato extends Mascota {
    //Atributos

    //Constructores
    public Gato() {

    }

    public Gato(String reino, String tipo, String raza, String medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio, nombre, propietario);
    }

    public Gato(String raza, String medio, Genero genero, String nombre, String propietario) {
        super("Mamifero", "Gato", raza, medio, genero, nombre, propietario);
    }

    //Metodos
    @Override
    public String reproducirSonido(){
        return "Miau";
    }

    @Override
    public String desplazarse(){
        return "Caminando";
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + super.getNombre() + '\'' +
                ", Reino='" + super.getReino() + '\'' +
                ", tipo='" + super.getTipo() + '\'' +
                ", raza='" + super.getRaza() + '\'' +
                ", medio='" + super.getMedio() + '\'' +
                ", genero='" + super.getGenero() + '\'' +
                ", propietario='" + super.getPropietario() + '\'' +
                '}';
    }

    //Getters y Setters

}
