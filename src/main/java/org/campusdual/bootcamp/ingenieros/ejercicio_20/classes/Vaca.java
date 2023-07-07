package org.campusdual.bootcamp.ingenieros.ejercicio_20.classes;

import java.util.Random;

public class Vaca extends AnimaldeGranja {
    //Atributos

    //Constructores
    public Vaca() {

    }

    public Vaca(String raza, String medio, Genero genero, String propietario) {
        super("Mamifero", "Vaca", raza, medio, genero, propietario);
    }

    public Vaca(Vaca vaca){
        super("Mamifero", "Vaca", vaca.getRaza(), vaca.getMedio(), vaca.getGenero(), vaca.getPropietario());
    }

    //Metodos
    @Override
    public Animal reproducirse(ISexual pareja){
        if(this.getClass() == pareja.getClass() && this.getGenero() != ((Animal) pareja).getGenero()){
            Random random = new Random();
            int aleatorio = random.nextInt(2);

            if(aleatorio == 0) return new Vaca(this);
            else return new Vaca((Vaca)pareja);
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