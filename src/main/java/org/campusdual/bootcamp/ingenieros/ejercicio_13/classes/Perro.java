package org.campusdual.bootcamp.ingenieros.ejercicio_13.classes;

import org.campusdual.bootcamp.ingenieros.ejercicio_14.classes.ISexual;

import java.util.Random;

public class Perro extends Mascota {
    //Atributos

    //Constructores
    public Perro(){

    }

    public Perro(String reino, String tipo, String raza, String medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio, nombre, propietario);
    }

    public Perro(String raza, String medio, Genero genero, String nombre, String propietario) {
        super("Mamifero", "Perro", raza, medio, genero, nombre, propietario);
    }

    public Perro(String raza, String medio, Genero genero, int idPadre, int idMadre, String nombre, String propietario) {
        super("Mamifero", "Perro", raza, medio, genero, idPadre, idMadre, nombre, propietario);
    }

    public Perro(String [] perro) {
        super(perro[0], perro[1], perro[2], perro[3], perro[4], perro[5], perro[6], perro[7]);
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
            return new Perro(this.getRaza(), this.getMedio(), generoCria, idPadre, idMadre, this.getNombre(), this.getPropietario());
        }else System.out.println("No se pueden reproducir");
        return null;
    }

    @Override
    public String reproducirSonido(){
        return "Guau";
    }

    @Override
    public String desplazarse(){
        return "Corriendo";
    }
    @Override
    public String toString() {
        return "Perro{" +
                "Id='" + super.getId() + '\'' +
                ", nombre='" + super.getNombre() + '\'' +
                ", Reino='" + super.getReino() + '\'' +
                ", tipo='" + super.getTipo() + '\'' +
                ", raza='" + super.getRaza() + '\'' +
                ", medio='" + super.getMedio() + '\'' +
                ", genero='" + super.getGenero() + '\'' +
                ", propietario='" + super.getPropietario() + '\'' +
                '}';
    }

    //Getters y Setters

}
