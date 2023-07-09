package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

import org.campusdual.bootcamp.ingenieros.ejercicio_14.classes.ISexual;

import java.util.Random;

public class Vaca extends AnimaldeGranja {
    //Atributos

    //Constructores
    public Vaca() {

    }

    public Vaca(String reino, String tipo, String raza, String medio, String propietario) {
        super(reino, tipo, raza, medio, propietario);
    }

    public Vaca(String raza, String medio, Genero genero, String propietario) {
        super("Mamifero", "Vaca", raza, medio, genero, propietario);
    }

    public Vaca(String raza, String medio, Genero genero, int idPadre, int idMadre, String propietario) {
        super("Mamifero", "Vaca", raza, medio, genero, idPadre, idMadre, propietario);
    }

    //Metodos
    @Override
    public Animal reproducirse(ISexual pareja){
        if(this.getClass() == pareja.getClass() && this.getGenero() != ((Animal) pareja).getGenero()){
            Random random = new Random();
            Genero generoCria;
            int idPadre, idMadre;
            int aleatorio = random.nextInt(2);

            if(aleatorio == 0) generoCria = this.getGenero();
            else generoCria = ((Animal) pareja).getGenero();

            if(this.getGenero() == Genero.Macho){
                idPadre = this.getId();
                idMadre = ((Animal) pareja).getId();
            }else{
                idPadre = ((Animal) pareja).getId();
                idMadre = this.getId();

            }

            return new Vaca(this.getRaza(), this.getMedio(), generoCria, idPadre, idMadre, this.getPropietario());
        }else System.out.println("No se pueden reproducir");
        return null;
    }

    @Override
    public String reproducirSonido(){
        return "Muuu";
    }

    @Override
    public String desplazarse(){
        return "Caminando";
    }

    @Override
    public String toString() {
        return "Vaca{" +
                "Reino='" + super.getReino() + '\'' +
                ", tipo='" + super.getTipo() + '\'' +
                ", raza='" + super.getRaza() + '\'' +
                ", medio='" + super.getMedio() + '\'' +
                ", genero='" + super.getGenero() + '\'' +
                ", id='" + super.getId() + '\'' +
                ", propietario='" + super.getPropietario() + '\'' +
                '}';
    }

    //Getters y Setters

}


