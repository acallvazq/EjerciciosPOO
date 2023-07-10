package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

import org.campusdual.bootcamp.ingenieros.ejercicio_14.classes.ISexual;

import java.util.Random;

public class Tucan extends AnimalSalvaje {
    //Atributos

    //Constructores
    public Tucan() {

    }

    public Tucan(String reino, String tipo, String raza, String medio) {
        super(reino, tipo, raza, medio);
    }

    public Tucan(String raza, String medio, Genero genero) {
        super("Ave", "Tucan", raza, medio, genero);
    }

    public Tucan(String raza, String medio, Genero genero, int idPadre, int idMadre) {
        super("Ave", "Tucan", raza, medio, genero, idPadre, idMadre);
    }

    public Tucan(String [] tucan) {
        super(tucan[0], tucan[3], tucan[4], tucan[5], tucan[6], tucan[7]);
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
            return new Tucan(this.getRaza(), this.getMedio(), generoCria, idPadre, idMadre);
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
                "Id='" + super.getId() + '\'' +
                ", reino='" + super.getReino() + '\'' +
                ", tipo='" + super.getTipo() + '\'' +
                ", raza='" + super.getRaza() + '\'' +
                ", medio='" + super.getMedio() + '\'' +
                ", genero='" + super.getGenero() + '\'' +
                "}";
    }

    //Getters y Setters
}
