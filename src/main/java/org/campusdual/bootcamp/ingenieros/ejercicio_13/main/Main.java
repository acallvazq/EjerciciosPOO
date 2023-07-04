package org.campusdual.bootcamp.ingenieros.ejercicio_13.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;

public class Main {
    public static void main(String[] args) {
        //Crear los objetos
        Perro perro = new Perro("Mamifero", "Perro", "Pastor aleman", "Terrestre", "Pluto", "Manuel");
        Gato gato = new Gato("Mamifero", "Gato", "Snowshoe", "Terrestre", "Mochuelo", "Alba");
        Tucan tucan = new Tucan("Ave", "Tucan", "Toco", "Aereo");
        PezPayaso pez = new PezPayaso("Pez", "Pez payaso", "Comun", "Acuatico");
        Vaca vaca = new Vaca("Mamifero", "Vaca", "Rubia gallega", "Terrestre", "Francisco");
        Oveja oveja = new Oveja("Mamifero", "Oveja", "Texel", "Terrestre", "Francisco");

        //Mostrar por pantalla los datos
        System.out.println("**** Datos registrados ****");
        System.out.println("Perro: " + perro);
        System.out.println("Gato: " + gato);
        System.out.println("Tucan: " + tucan);
        System.out.println("Pez: " + pez);
        System.out.println("Vaca: " + vaca);
        System.out.println("Oveja: " + oveja);

        System.out.println('\n' + "**** Informacion ****");
        System.out.println("El perro " + perro.getNombre() + " esta " + perro.desplazarse() + " mientras dice '"+ perro.reproducirSonido() +"'");
        System.out.println("El gato " + gato.getNombre() + " esta " + gato.desplazarse() + " mientras dice '"+ gato.reproducirSonido() +"'");
        System.out.println("El tucan esta " + tucan.desplazarse() + " mientras dice '"+ tucan.reproducirSonido() +"'");
        System.out.println("La vaca de " + vaca.getPropietario() + " esta " + vaca.desplazarse() + " mientras dice '"+ vaca.reproducirSonido() +"'");
        System.out.println("La oveja de " + oveja.getPropietario() + " esta " + oveja.desplazarse() + " mientras dice '"+ oveja.reproducirSonido() +"'");
    }
}
