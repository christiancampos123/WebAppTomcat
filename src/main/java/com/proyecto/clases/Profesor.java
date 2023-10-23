package com.proyecto.clases;

public class Profesor extends Persona {
    private int numHoras;
    private int numAula;

    public Profesor(String nombre, int edad, int numAula, int numHoras) {
        super(nombre, edad);
        this.numHoras = numHoras;
        this.numAula = numAula;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public int getNumAula() {
        return numAula;
    }

    public void setNumAula(int numAula) {
        this.numAula = numAula;
    }
}
