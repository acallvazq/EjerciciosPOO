package org.campusdual.bootcamp.ingenieros.ejercicio_16.classes;

import java.util.Random;

public class PezPayaso extends AnimalSalvaje {
    //Atributos

    //Constructores
    public PezPayaso() {

    }

    public PezPayaso(String raza, String medio, Genero genero) {
        super("Pez", "Pez payaso", raza, medio, genero);
    }

    public PezPayaso(PezPayaso pezPayaso){
        super("Pez", "Pez payaso", pezPayaso.getRaza(), pezPayaso.getMedio(), pezPayaso.getGenero());
    }

    //Metodos
    @Override
    public Animal reproducirse(ISexual pareja){
        if(this.getClass() == pareja.getClass() && this.getGenero() != ((Animal) pareja).getGenero()){
            Random random = new Random();
            int aleatorio = random.nextInt(2);

            if(aleatorio == 0) return new PezPayaso(this);
            else return new PezPayaso((PezPayaso) pareja);
        }else System.out.println("No se pueden reproducir");
        return null;
    }

    @Override
    public String reproducirSonido(){
        return "...";
    }
    @Override
    public String desplazarse(){
        return "Nadando";
    }
    @Override
    public String toString() {
        return "Tucan{"+
                "Reino='" + super.getReino() + '\'' +
                ", tipo='" + super.getTipo() + '\'' +
                ", raza='" + super.getRaza() + '\'' +
                ", genero='" + super.getGenero() + '\'' +
                ", medio='" + super.getMedio() + '\'' +
                ", id='" + super.getId() + '\'' +
                "}";
    }
    //Getters y Setters
}
