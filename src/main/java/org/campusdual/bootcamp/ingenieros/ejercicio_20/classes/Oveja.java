package org.campusdual.bootcamp.ingenieros.ejercicio_20.classes;

import java.util.Random;

public class Oveja extends AnimaldeGranja {
    //Atributos

    //Constructores
    public Oveja() {

    }

    public Oveja(String raza, String medio, Genero genero, String propietario) {
        super("Mamifero", "Oveja", raza, medio, genero, propietario);
    }

    public Oveja(Oveja oveja) {
        super("Mamifero", "Oveja", oveja.getRaza(), oveja.getMedio(), oveja.getGenero(), oveja.getPropietario());
    }

    //Metodos
    @Override
    public Animal reproducirse(ISexual pareja){
        if(this.getClass() == pareja.getClass() && this.getGenero() != ((Animal) pareja).getGenero()){
            Random random = new Random();
            int aleatorio = random.nextInt(2);

            if(aleatorio == 0) return new Oveja(this);
            else return new Oveja((Oveja) pareja);
        }else System.out.println("No se pueden reproducir");
        return null;
    }

    @Override
    public String reproducirSonido(){
        return "Bee";
    }

    @Override
    public String desplazarse(){
        return "Corriendo";
    }

    @Override
    public String toString() {
        return "Oveja{" +
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
