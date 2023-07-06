package org.campusdual.bootcamp.ingenieros.ejercicio_16.classes;

import java.util.ArrayList;
import java.util.List;

public class Mascota extends Animal implements Apropiable {
    //Atributos
    private String nombre;
    private String propietario;

    //Listas
    public static List<Mascota> mascotas = new ArrayList<>();

    //Constructores
    public Mascota() {

    }

    public Mascota(String nombre, String propietario) {
        this.nombre = nombre;
        this.propietario = propietario;
    }

    public Mascota(String reino, String tipo, String raza, String medio, Genero genero) {
        super(reino, tipo, raza, medio, genero);
    }

    public Mascota(String reino, String tipo, String raza, String medio, Genero genero, int idPadre, int idMadre, String nombre, String propietario) {
        super(reino, tipo, raza, medio, genero, idPadre, idMadre);
        this.nombre = nombre;
        this.propietario = propietario;
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
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", Reino='" + super.getReino() + '\'' +
                ", tipo='" + super.getTipo() + '\'' +
                ", raza='" + super.getRaza() + '\'' +
                ", medio='" + super.getMedio() + '\'' +
                ", id='" + super.getId() + '\'' +
                ", genero='" + super.getGenero() + '\'' +
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
