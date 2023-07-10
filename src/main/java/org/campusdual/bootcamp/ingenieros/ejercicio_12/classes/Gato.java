package org.campusdual.bootcamp.ingenieros.ejercicio_12.classes;

import org.campusdual.bootcamp.ingenieros.ejercicio_11.classes.Mascota;

public class Gato extends Mascota {
    //Atributos

    //Constructores
    public Gato(String reino, String tipo, String raza, String medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio, nombre, propietario);
    }

    //Metodos
    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + super.getNombre() + '\'' + ", Reino='" + super.getReino() + '\'' + ", tipo='" + super.getTipo() + '\'' + ", raza='" + super.getRaza() + '\'' + ", medio='" + super.getMedio() + '\'' +
                ", propietario='" + super.getPropietario() + '\'' +
                '}';
    }

    //Getters y Setters

}
