package com.proyecto.clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generador {
    public Persona[] personas = new Persona[10];

    ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    // ArrayList Profes
    ArrayList<Profesor> listaProfesores = new ArrayList<>();

    public void generarAlumnos(){
        Alumno al1=new Alumno("Christian", 27, 5);
        System.out.println(al1.getNombre()+" - "+al1.getEdad()+" - "+al1.getNota());
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }


    public List<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void leerProfesores(){
        // Archivo .txt
        String archivoProfes = "C:\\Users\\christian.campos\\IdeaProjects\\WebAppTomcat\\src\\main\\java\\com\\proyecto\\clases\\profes.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivoProfes));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(" ");
                if (datos.length == 4) {
                    String nombre = datos[0];
                    int edad = Integer.parseInt(datos[1]);
                    int numAula = Integer.parseInt(datos[2]);
                    int numHoras = Integer.parseInt(datos[3]);

                    // nuevo profesor y lo agrego a la lista
                    Profesor profe = new Profesor(nombre, edad, numAula, numHoras);
                    listaProfesores.add(profe);
                } else {
                    System.err.println("Formato incorrecto en una línea: " + linea);
                }
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ahora tienes la lista de alumnos en 'listaAlumnos'
        // Puedes hacer lo que necesites con esta lista
        for (Profesor profe : listaProfesores) {
            //System.out.println("Nombre: " + profe.getNombre() + ", Edad: " + profe.getEdad() + ", Aula: " + profe.getNumAula()+ ", Horas: " + profe.getNumHoras());
        }
    }
    public void leerAlumnos(){
        // Archivo .txt
        String archivoAlumnos = "C:\\Users\\christian.campos\\IdeaProjects\\WebAppTomcat\\src\\main\\java\\com\\proyecto\\clases\\alumnos.txt";

        // ArrayList Alumnos

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivoAlumnos));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(" ");
                if (datos.length == 3) {
                    String nombre = datos[0];
                    int edad = Integer.parseInt(datos[1]);
                    float nota = Float.parseFloat(datos[2]);

                    // Crear una instancia de Alumno y agregarla a la lista
                    Alumno alumno = new Alumno(nombre, edad, nota);
                    listaAlumnos.add(alumno);
                } else {
                    System.err.println("Formato incorrecto en una línea: " + linea);
                }
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ahora tienes la lista de alumnos en 'listaAlumnos'
        // Puedes hacer lo que necesites con esta lista
        for (Alumno alumno : listaAlumnos) {
            //System.out.println("Nombre: " + alumno.getNombre() + ", Edad: " + alumno.getEdad() + ", Nota: " + alumno.getNota());
        }


    }

    public void generarProfes(){
        Profesor pr1=new Profesor("Joan", 47, 20, 5);
        System.out.println(pr1.getNombre()+"" +
                " - "+pr1.getEdad()+
                " - "+pr1.getNumAula()+
                " - "+pr1.getNumHoras());
    }

    public void hacerMedia() {
        ArrayList<Integer> edades = new ArrayList<>();
        for (int i = 0; i < personas.length; i++) {

            try {
                int edad = personas[i].getEdad();
                // Agregar elementos al ArrayList
                edades.add(edad);
            } catch (Exception e) {
                break;
            }
        }
        double suma =0;
        System.out.println("Mayores de edad:");
        for (int i = 0; i < edades.size(); i++) {
            suma = suma + edades.get(i);
            if(edades.get(i) >= 17){
                System.out.println(personas[i].getNombre());
            }
        }
        double media = suma / edades.size();
        System.out.println("la edad media es : " + media + "años");
    }

    public void generarPersonas() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            personas[i] = new Persona(nombre, edad);

        }
        for (int i = 0; i < personas.length; i++) {
            try {
                System.out.println(personas[i].getNombre());
                System.out.println(personas[i].getEdad());
                System.out.println("-----------------");
            } catch (Exception e) {
                break;
            }
        }
    }
}
