package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

public class Perro extends Mascota {
    //Atributos

    //Constructores
    public Perro(){

    }

    public Perro(String reino, String tipo, String raza, String medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio, nombre, propietario);
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
