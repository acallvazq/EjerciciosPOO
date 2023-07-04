package org.campusdual.bootcamp.ingenieros.ejercicio_14.classes;

public class Perro extends Mascota {
    //Atributos

    //Constructores
    public Perro(){

    }

    public Perro(String nombre, String propietario) {
        super(nombre, propietario);
    }

    public Perro(String raza, String medio, Genero genero, String nombre, String propietario) {
        super("Mamifero", "Perro", raza, medio, genero, nombre, propietario);
    }


    //Metodos
    @Override
    public String reproducirSonido(){
        return "Guau";
    }

    @Override
    public String desplazarse(){
        return "Corriendo";
    }
    @Override
    public String toString() {
        return "Perro{" +
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
