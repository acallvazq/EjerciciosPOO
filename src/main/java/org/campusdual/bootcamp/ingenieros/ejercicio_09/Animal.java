package org.campusdual.bootcamp.ingenieros.ejercicio_09;

public class Animal {
    //Atributos
    private String reino;  //mamifero, ave
    private String tipo;  //gato, periquito
    private String raza;
    private String medio;  //acuatico, aereo

    //Constructores
    public Animal(){

    }

    public Animal(String reino, String tipo, String raza, String medio){
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
    }

    //Metodos
    @Override
    public String toString() {
        return "Animal{" +
                "reino='" + reino + '\'' +
                ", tipo='" + tipo + '\'' +
                ", raza='" + raza + '\'' +
                ", medio='" + medio + '\'' +
                '}';
    }

    //Getters y Setters
    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }
}