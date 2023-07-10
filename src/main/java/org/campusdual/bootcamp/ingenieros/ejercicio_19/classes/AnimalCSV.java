package org.campusdual.bootcamp.ingenieros.ejercicio_19.classes;

import com.opencsv.CSVReader;
import org.campusdual.bootcamp.ingenieros.ejercicio_13.classes.*;
import org.campusdual.bootcamp.ingenieros.ejercicio_14.classes.ISexual;

import java.io.FileReader;
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

    public List<ISexual> cargarDatos(){
        List<ISexual> animales = new ArrayList<>();

        try {
            System.out.println("\nLeyendo del archivo CSV...");
            int indiceTipo = 0;
            FileReader fichero = new FileReader(ruta);
            CSVReader lector = new CSVReader(fichero);
            //CSVReader lector = new CSVReaderBuilder(fichero).withSkipLines(1).build();

            List<String[]> contenido = lector.readAll();
            String[] cabecera = contenido.get(0);

            for (int i = 0; i < cabecera.length; i++){
                if(cabecera[i].equals("Tipo")){
                    indiceTipo = i;
                    break;
                }
            }

            for(String [] columna : contenido){
                if(columna[indiceTipo].equals("Gato")){
                    ISexual gato = new Gato(columna);
                    animales.add(gato);
                }else if(columna[indiceTipo].equals("Oveja")){
                    ISexual oveja = new Oveja(columna);
                    animales.add(oveja);
                }else if(columna[indiceTipo].equals("Perro")){
                    ISexual perro = new Perro(columna);
                    animales.add(perro);
                }else if(columna[indiceTipo].equals("Pez payaso")){
                    ISexual pezpayaso = new PezPayaso(columna);
                    animales.add(pezpayaso);
                }else if(columna[indiceTipo].equals("Tucan")){
                    ISexual tucan = new Tucan(columna);
                    animales.add(tucan);
                }else if(columna[indiceTipo].equals("Vaca")) {
                    ISexual vaca = new Vaca(columna);
                    animales.add(vaca);
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }

        return animales;
    }
}
