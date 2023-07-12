package org.campusdual.bootcamp.ingenieros.ejercicio_17.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;
import org.campusdual.bootcamp.ingenieros.ejercicio_14.classes.ISexual;
import org.campusdual.bootcamp.ingenieros.ejercicio_22.classes.Datos;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        DatosAnimales.crearDatos();

        //Criar animales
        DatosAnimales.criarAnimales(4, 3);
    }

}
