package org.campusdual.bootcamp.ingenieros.ejercicio_19.classes;

import java.util.Random;

public class Gato extends Mascota {
    //Atributos

    //Constructores
    public Gato() {

    }

    public Gato(String nombre, String propietario) {
        super(nombre, propietario);
    }

    public Gato(String raza, String medio, Genero genero, String nombre, String propietario) {
        super("Mamifero", "Gato", raza, medio, genero, nombre, propietario);
    }

    public Gato(Gato gato) {
        super("Mamifero", "Gato", gato.getRaza(), gato.getMedio(), gato.getGenero(), gato.getNombre(), gato.getPropietario());
    }

    //Metodos
    @Override
    public Animal reproducirse(ISexual pareja){
        if(this.getClass() == pareja.getClass() && this.getGenero() != ((Animal) pareja).getGenero()){
            Random random = new Random();
            int aleatorio = random.nextInt(2);

            if(aleatorio == 0) return new Gato(this);
            else return new Gato((Gato) pareja);
        }else System.out.println("No se pueden reproducir");
        return null;
    }
    @Override
    public String reproducirSonido(){
        return "Miau";
    }

    @Override
    public String desplazarse(){
        return "Caminando";
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + super.getNombre() + '\'' +
                ", Reino='" + super.getReino() + '\'' +
                ", tipo='" + super.getTipo() + '\'' +
                ", raza='" + super.getRaza() + '\'' +
                ", medio='" + super.getMedio() +
                ", genero='" + super.getGenero() + '\'' +
                ", propietario='" + super.getPropietario() + '\'' +
                '}';
    }

    //Getters y Setters

}
