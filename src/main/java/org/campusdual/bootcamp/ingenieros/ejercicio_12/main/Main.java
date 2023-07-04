package org.campusdual.bootcamp.ingenieros.ejercicio_12.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_12.classes.*;

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
        System.out.println("Perro: " + perro);
        System.out.println("Gato: " + gato);
        System.out.println("Tucan: " + tucan);
        System.out.println("Pez: " + pez);
        System.out.println("Vaca: " + vaca);
        System.out.println("Oveja: " + oveja);
    }
}
