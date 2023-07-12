package org.campusdual.bootcamp.ingenieros.ejercicio_13.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;
import org.campusdual.bootcamp.ingenieros.ejercicio_14.classes.ISexual;

public class Main {
    public static void main(String[] args) {
        //Inicializar datos
        DatosAnimales.crearDatos();

        //Mostrar por pantalla los datos
        DatosAnimales.mostrarDatos();

        System.out.println('\n' + "**** Informacion ****");
        for(ISexual animal : Animal.animales){
            if(animal instanceof Mascota) {
                System.out.println("El " + ((Mascota) animal).getTipo() + " " +
                                  ((Mascota) animal).getNombre() + " esta " +
                                  ((Mascota) animal).desplazarse() + " mientras dice '"+
                                  ((Mascota) animal).reproducirSonido() +"'");
            }
            else if(animal instanceof AnimaldeGranja) {
                System.out.println("La " + ((AnimaldeGranja) animal).getTipo() + " de " +
                        ((AnimaldeGranja) animal).getPropietario() + " esta " +
                        ((AnimaldeGranja) animal).desplazarse() + " mientras dice '"+
                        ((AnimaldeGranja) animal).reproducirSonido() +"'");
            }
            else if(animal instanceof AnimalSalvaje) {
                System.out.println("El " + ((AnimalSalvaje) animal).getTipo() + " esta " +
                        ((AnimalSalvaje) animal).desplazarse() + " mientras dice '"+
                        ((AnimalSalvaje) animal).reproducirSonido() +"'");
            }
        }

    }
}
