package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

import org.campusdual.bootcamp.ingenieros.ejercicio_14.classes.ISexual;

import java.util.Random;

public class PezPayaso extends AnimalSalvaje {
    //Atributos

    //Constructores
    public PezPayaso(String reino, String tipo, String raza, String medio) {
        super(reino, tipo, raza, medio);
    }

    public PezPayaso(String raza, String medio, Genero genero) {
        super("Pez", "Pez payaso", raza, medio, genero);
    }

    public PezPayaso(String raza, String medio, Genero genero, int idPadre, int idMadre) {
        super("Pez", "Pez payaso", raza, medio, genero, idPadre, idMadre);
    }

    public PezPayaso(String [] pez) {
        super(pez[0], pez[3], pez[4], pez[5], pez[6], pez[7], pez[8], pez[9]);
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
            return new PezPayaso(this.getRaza(), this.getMedio(), generoCria, idPadre, idMadre);
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
        return "PezPayaso{"+
                "Id='" + super.getId() + '\'' +
                ", reino='" + super.getReino() + '\'' +
                ", tipo='" + super.getTipo() + '\'' +
                ", raza='" + super.getRaza() + '\'' +
                ", genero='" + super.getGenero() + '\'' +
                ", medio='" + super.getMedio() + '\'' +
                ", padre='" + super.getIdPadre() + '\'' +
                ", madre='" + super.getIdMadre() + '\'' +
                "}";
    }
    //Getters y Setters
}
