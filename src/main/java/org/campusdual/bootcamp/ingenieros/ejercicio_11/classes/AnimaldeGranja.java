package org.campusdual.bootcamp.ingenieros.ejercicio_11.classes;

public class AnimaldeGranja extends Animal implements Apropiable{
    //Atributos
    private String propietario;

    //Constructores
    public AnimaldeGranja(){

    }

    public AnimaldeGranja(String reino, String tipo, String raza, String medio, String propietario) {
        super(reino, tipo, raza, medio);
        this.propietario = propietario;
    }

    //Metodos
    @Override
    public String toString() {
        return "AnimaldeGranja{" + "Reino='" + super.getReino() + '\'' + ", tipo='" + super.getTipo() + '\'' + ", raza='" + super.getRaza() + '\'' + ", medio='" + super.getMedio() + '\'' +
                ", propietario='" + propietario + '\'' +
                '}';
    }

    //Getters y Setters
    public String getPropietario(){
        return propietario;
    }
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }

}
