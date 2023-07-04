package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

public class Perro extends Mascota {
    //Atributos

    //Constructores
    public Perro(){

    }

    public Perro(String nombre, String propietario) {
        super(nombre, propietario);
    }

    public Perro(String reino, String tipo, String raza, String medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio, nombre, propietario);
    }


    //Metodos
    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + super.getNombre() + '\'' + ", Reino='" + super.getReino() + '\'' + ", tipo='" + super.getTipo() + '\'' + ", raza='" + super.getRaza() + '\'' + ", medio='" + super.getMedio() + '\'' +
                ", propietario='" + super.getPropietario() + '\'' +
                '}';
    }

    //Getters y Setters

}
