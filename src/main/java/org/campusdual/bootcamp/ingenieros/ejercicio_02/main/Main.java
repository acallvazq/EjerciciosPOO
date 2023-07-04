package org.campusdual.bootcamp.ingenieros.ejercicio_02.main;

import org.campusdual.bootcamp.ingenieros.ejercicio_02.classes.Input;
import java.util.List;
import java.util.ArrayList;

public class Main {
    final static int MINIMO = 1;
    final static int MAXIMO = 10;

    public static void main(String[] args) {
        List<Integer> primos;
        primos = obtenerPrimos();

        //Pedir numero al usuario
        int numero = Input.integer("Introduce un numero entero: ");

        //Comprobar si es multiplo de alguno de los primos hallados
        comprobarMultiplo(primos, numero);
    }

    private static List<Integer> obtenerPrimos(){
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Obteniedo numeros primos del "+ MINIMO + " al "+ MAXIMO + "...");

        for(int i = MINIMO; i <= MAXIMO; i++){
            for(int j = MINIMO+1; j <= MAXIMO; j++){
                if(i%j == 0 && j != i) break;
                else if (i%j == 0 && (j == i)){
                    numeros.add(i);
                    break;
                }

            }
        }
        return numeros;
    }

    private static void comprobarMultiplo(List<Integer> primos, int numero){
        for(int primo: primos){
            if(numero%primo == 0) {
                System.out.println("El numero " + numero + " es multiplo de " + primo);
            }
        }
    }
}