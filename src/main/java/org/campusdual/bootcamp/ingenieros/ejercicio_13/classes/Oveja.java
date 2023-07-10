package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

import org.campusdual.bootcamp.ingenieros.ejercicio_14.classes.ISexual;

import java.util.Random;

public class Oveja extends AnimaldeGranja {
    //Atributos

    //Constructores
    public Oveja() {

    }

    public Oveja(String reino, String tipo, String raza, String medio, String propietario) {
        super(reino, tipo, raza, medio, propietario);
    }

    public Oveja(String raza, String medio, Genero genero, String propietario) {
        super("Mamifero", "Oveja", raza, medio, genero, propietario);
    }

    public Oveja(String raza, String medio, Genero genero, int idPadre, int idMadre, String propietario) {
        super("Mamifero", "Oveja", raza, medio, genero, idPadre, idMadre, propietario);
    }

    public Oveja(String [] oveja) {
        super(oveja[0], oveja[2], oveja[3], oveja[4], oveja[5], oveja[6], oveja[7]);
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
            return new Oveja(this.getRaza(), this.getMedio(), generoCria, idPadre, idMadre, this.getPropietario());
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
                "Id='" + super.getId() + '\'' +
                ", reino='" + super.getReino() + '\'' +
                ", tipo='" + super.getTipo() + '\'' +
                ", raza='" + super.getRaza() + '\'' +
                ", medio='" + super.getMedio() + '\'' +
                ", genero='" + super.getGenero() + '\'' +
                ", propietario='" + super.getPropietario() + '\'' +
                '}';
    }


    //Getters y Setters

}
