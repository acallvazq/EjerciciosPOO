package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

import org.campusdual.bootcamp.ingenieros.ejercicio_11.classes.IPropietario;
import java.util.ArrayList;
import java.util.List;

public class AnimaldeGranja extends Animal implements IPropietario {
    //Atributos
    private String propietario;

    //Listas
    public static List<AnimaldeGranja> animalesGranja = new ArrayList<>();

    //Constructores
    public AnimaldeGranja(String reino, String tipo, String raza, String medio, String propietario) {
        super(reino, tipo, raza, medio);
        this.propietario = propietario;
    }

    public AnimaldeGranja(String reino, String tipo, String raza, String medio, Genero genero, String propietario) {
        super(reino, tipo, raza, medio, genero);
        this.propietario = propietario;
    }

    public AnimaldeGranja(String reino, String tipo, String raza, String medio, Genero genero, int idPadre, int idMadre, String propietario) {
        super(reino, tipo, raza, medio, genero, idPadre, idMadre);
        this.propietario = propietario;
    }

    public AnimaldeGranja(String id, String propietario, String tipo, String raza, String genero, String medio, String reino, String idPadre, String idMadre) {
        super(id, tipo, raza, genero, medio, reino, idPadre, idMadre);
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
        return "AnimaldeGranja{" +
                "Reino='" + super.getReino() + '\'' +
                ", tipo='" + super.getTipo() + '\'' +
                ", raza='" + super.getRaza() + '\'' +
                ", medio='" + super.getMedio() + '\'' +
                ", genero='" + super.getGenero() + '\'' +
                ", id='" + super.getId() + '\'' +
                ", propietario='" + propietario + '\'' +
                '}';
    }

    //Getters y Setters
    @Override
    public String getPropietario(){
        return propietario;
    }
    @Override
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }

}
