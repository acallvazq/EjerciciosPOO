package org.campusdual.bootcamp.ingenieros.ejercicio_21.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;
import org.campusdual.bootcamp.ingenieros.ejercicio_14.classes.ISexual;
import org.campusdual.bootcamp.ingenieros.ejercicio_19.classes.AnimalCSV;
import org.campusdual.bootcamp.ingenieros.util.Input;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        boolean salida = true;
        init();
        imprimirCaratula();

        do{
            System.out.println("\n" + "A) Mostrar todos los animales");
            System.out.println("C) Consultar los antepasados");
            System.out.println("X) Salir");

            char respuesta = Input.character("Elige una opcion: ");

            switch(Character.toUpperCase(respuesta)){
                case 'A':
                    mostrarAnimales();
                    break;
                case 'C':
                    consultarAntepasados();
                    break;
                case 'X':
                    System.out.println("\n" + "Cerrando sesion...");
                    salida = false;
                    break;
            }
        }while(salida);
    }

    private static void init(){
        //Cargar datos del CSV
        Animal.animales = AnimalCSV.cargarDatos("animales.csv");
    }

    private static void imprimirCaratula(){
        String titulo = "FAUNAPEDIA";
        System.out.println((titulo).length());
        for(int i = 0; i < 50; i++) System.out.print('-');
        System.out.print("\n" + "|");
        for(int i = 0; i < (50-(titulo).length()-2)/2; i++) System.out.print(" ");
        System.out.print(titulo);
        for(int i = 0; i < (50-(titulo).length()-2)/2; i++) System.out.print(" ");
        System.out.print("|" + "\n");
        for(int i = 0; i < 50; i++) System.out.print('-');
        System.out.println();
    }

    private static void consultarAntepasados(){
        int id = Input.integer("\nIntroduzca el id del animal: ");

        System.out.println("\nMostrando informacion de los antepasados...");
        buscarAntepasados(id);

    }

    public static void buscarAntepasados(int id){
        int idPadre = 0;
        int idMadre = 0;
        for(ISexual animal: Animal.animales){
            if(id == ((Animal)animal).getId()){
                idPadre = ((Animal)animal).getIdPadre();
                idMadre = ((Animal)animal).getIdMadre();

                if(idPadre == 0 || idMadre == 0) return;

                for(ISexual padre: Animal.animales){
                    if(idPadre == ((Animal)padre).getId()){
                        System.out.println(padre);
                        break;
                    }
                }

                for(ISexual madre: Animal.animales){
                    if(idMadre == ((Animal)madre).getId()){
                        System.out.println(madre);
                        break;
                    }
                }
                break;
            }
        }

        buscarAntepasados(idPadre);
        buscarAntepasados(idMadre);
    }

    private static void mostrarAnimales(){
        System.out.println("\nMostrando todos los animales...");

        for (ISexual animal : Animal.animales) {
            System.out.println(animal);
        }
    }
}
