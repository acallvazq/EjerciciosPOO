package org.campusdual.bootcamp.ingenieros.ejercicio_07;

public class Main {
    public static void main(String[] args) {
        float numero = 10.2F;

        imprimirValor(10);
        imprimirValor(3.1492);
        imprimirValor(numero);
        imprimirValor('c');
        imprimirValor("prueba");
        imprimirValor(false);
    }

    public static void imprimirValor(int entero){
        System.out.println("El entero es " + entero);
    }

    public static void imprimirValor(float flotante){
        System.out.println("El flotante es " + flotante);
    }

    public static void imprimirValor(double doble){
        System.out.println("El doble es " + doble);
    }

    public static void imprimirValor(char caracter){
        System.out.println("El caracter es " + caracter);
    }

    public static void imprimirValor(String cadena){
        System.out.println("La cadena es " + cadena);
    }

    public static void imprimirValor(boolean booleano){
        System.out.println("El booleano es " + booleano);
    }
}