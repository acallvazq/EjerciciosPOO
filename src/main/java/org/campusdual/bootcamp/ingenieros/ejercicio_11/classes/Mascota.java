package org.campusdual.bootcamp.ingenieros.ejercicio_11.classes;

import org.campusdual.bootcamp.ingenieros.ejercicio_09.classes.Animal;

public class Mascota extends Animal implements IPropietario {
    //Atributos
    private String nombre;
    private String propietario;

    //Constructores
    public Mascota(String reino, String tipo, String raza, String medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio);
        this.nombre = nombre;
        this.propietario = propietario;
    }

    //Metodos
    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' + ", Reino='" + super.getReino() + '\'' + ", tipo='" + super.getTipo() + '\'' + ", raza='" + super.getRaza() + '\'' + ", medio='" + super.getMedio() + '\'' +
                ", propietario='" + propietario + '\'' +
                '}';
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos de la interfaz
    @Override
    public String getPropietario(){
        return propietario;
    }
    @Override
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }
}
