package org.campusdual.bootcamp.ingenieros.ejercicio_20.classes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnimalCSV {
    //Atributos
    private String ruta;

    //Constructores
    public AnimalCSV(String ruta){
        this.ruta = ruta;
    }

    //Metodos
    public void guardarDatos(List<ISexual> animales){
        try{
            /*String dirProyecto = System.getProperty("user.dir");
            String directorio = dirProyecto + "/src/main/java/org/campusdual/bootcamp/ingenieros/ejercicio_19/";*/

            FileWriter writer = new FileWriter(ruta);

            //Nombre de las columnas del fichero CSV
            writer.write("Id,Nombre,Propietario,Tipo,Raza,Genero,Medio,Reino\n");

            //Guardar los datos de los animales
            for(ISexual animal: animales){
                if(animal instanceof AnimalSalvaje){
                    writer.write(((AnimalSalvaje) animal).getId() + ",null,null," +
                            ((AnimalSalvaje) animal).getTipo() + "," +
                            ((AnimalSalvaje) animal).getRaza() + "," +
                            ((AnimalSalvaje) animal).getGenero() + "," +
                            ((AnimalSalvaje) animal).getMedio() + "," +
                            ((AnimalSalvaje) animal).getReino() + "\n");
                }else if (animal instanceof AnimaldeGranja){
                    writer.write(((AnimaldeGranja) animal).getId() + ",null," +
                            ((AnimaldeGranja) animal).getPropietario() + "," +
                            ((AnimaldeGranja) animal).getTipo() + "," +
                            ((AnimaldeGranja) animal).getRaza() + "," +
                            ((AnimaldeGranja) animal).getGenero() + "," +
                            ((AnimaldeGranja) animal).getMedio() + "," +
                            ((AnimaldeGranja) animal).getReino() + "\n");
                }else if (animal instanceof Mascota){
                    writer.write(((Mascota) animal).getId() + "," +
                            ((Mascota) animal).getNombre() + "," +
                            ((Mascota) animal).getPropietario() + "," +
                            ((Mascota) animal).getTipo() + "," +
                            ((Mascota) animal).getRaza() + "," +
                            ((Mascota) animal).getGenero() + "," +
                            ((Mascota) animal).getMedio() + "," +
                            ((Mascota) animal).getReino() + "\n");
                }
            }
            writer.close();
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
        System.out.println("Los animales se han guardado con exito.");
    }
/*
    public List<ISexual> cargarDatos(){
        List<ISexual> animales = new ArrayList<>();

        try{
            //CSVParser parser = new CSVParser(new FileReader(ruta), CSVFormat.DEFAULT.withHeader());

        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }*/
}
