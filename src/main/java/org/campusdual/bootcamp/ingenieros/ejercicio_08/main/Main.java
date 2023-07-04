package org.campusdual.bootcamp.ingenieros.ejercicio_08.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_08.classes.Input;
import java.util.Stack;

public class Main {
    static Stack<Double> numeros = new Stack<>();

    public static void main(String[] args) {
        boolean salida = true;
        caratula();

        do{
            System.out.println("\n" + "A) Registrar un numero");
            System.out.println("S) Sumar los numeros registrados");
            System.out.println("D) Eliminar el ultimo numero registrado");
            System.out.println("X) Salir");

            char respuesta = Input.character("Elige una opcion: ");

            switch(Character.toUpperCase(respuesta)){
                case 'A':
                    registrarNumero();
                    break;
                case 'S':
                    sumarNumeros();
                    break;
                case 'D':
                    eliminarNumero();
                    break;
                case 'X':
                    System.out.println("\n" + "Cerrando sesion...");
                    salida = false;
                    break;
            }
        }while(salida);

    }

    private static void caratula(){
        String titulo = "MENU DE OPCIONES";
        for(int i = 0; i < 50; i++) System.out.print('-');
        System.out.print("\n|");
        for(int i = 0; i < (50-(titulo).length()-2)/2; i++) System.out.print(" ");
        System.out.print(titulo);
        for(int i = 0; i < (50-(titulo).length()-2)/2; i++) System.out.print(" ");
        System.out.print("|\n");
        for(int i = 0; i < 50; i++) System.out.print('-');
        System.out.print("\n");
    }

    private static void registrarNumero(){
        double numero = Input.real("\n" + "Introduce el numero a registrar: ");
        numeros.push(numero);
        listarNumeros();
    }

    private static void sumarNumeros(){
        double suma = 0;
        for(double numero: numeros){
            suma += numero;
        }
        System.out.println("\n"+"El resultado de la suma es: "+ suma);
    }

    private static void eliminarNumero(){
        if(!numeros.isEmpty()) numeros.pop();
        listarNumeros();
    }

    private static void listarNumeros(){
        System.out.println("\nContenido actual de la lista: ");
        for(double numero: numeros){
            System.out.print(numero + " ");
        }
        System.out.print("\n");
    }
}