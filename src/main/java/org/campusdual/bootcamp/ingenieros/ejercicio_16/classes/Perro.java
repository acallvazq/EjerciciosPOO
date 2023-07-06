package org.campusdual.bootcamp.ingenieros.ejercicio_16.classes;

import java.util.Random;

public class Perro extends Mascota {
    //Atributos

    //Constructores
    public Perro(){

    }

    public Perro(String nombre, String propietario) {
        super(nombre, propietario);
    }

    /*public Perro(String raza, String medio, Genero genero, String nombre, String propietario) {
        super("Mamifero", "Perro", raza, medio, genero, nombre, propietario);
    }*/

    public Perro(String raza, String medio, Genero genero, int idPadre, int idMadre, String nombre, String propietario) {
        super("Mamifero", "Perro", raza, medio, genero, idPadre, idMadre, nombre, propietario);
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
                "nombre='" + super.getNombre() + '\'' +
                ", Reino='" + super.getReino() + '\'' +
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
