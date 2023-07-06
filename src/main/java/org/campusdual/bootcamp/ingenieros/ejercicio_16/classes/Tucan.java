package org.campusdual.bootcamp.ingenieros.ejercicio_16.classes;

import java.util.Random;

public class Tucan extends AnimalSalvaje {
    //Atributos

    //Constructores
    public Tucan() {

    }

    public Tucan(String raza, String medio, Genero genero) {
        super("Ave", "Tucan", raza, medio, genero);
    }

    public Tucan(Tucan tucan){
        super("Ave", "Tucan", tucan.getRaza(), tucan.getMedio(), tucan.getGenero());
    }

    //Metodos
    @Override
    public Animal reproducirse(ISexual pareja){
        if(this.getClass() == pareja.getClass() && this.getGenero() != ((Animal) pareja).getGenero()){
            Random random = new Random();
            int aleatorio = random.nextInt(2);

            if(aleatorio == 0) return new Tucan(this);
            else return new Tucan((Tucan)pareja);
        }else System.out.println("No se pueden reproducir");
        return null;
    }

    @Override
    public String reproducirSonido(){
        return "Canto de tucán toco...";
    }

    @Override
    public String desplazarse(){
        return "Volando";
    }

    @Override
    public String toString() {
        return "Tucan{"+
                "Reino='" + super.getReino() + '\'' +
                ", tipo='" + super.getTipo() + '\'' +
                ", raza='" + super.getRaza() + '\'' +
                ", medio='" + super.getMedio() + '\'' +
                ", genero='" + super.getGenero() + '\'' +
                "}";
    }

    //Getters y Setters
}
