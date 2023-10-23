package com.proyecto.clases;

public class Alumno extends Persona {
    private float nota;

    public Alumno(String nombre, int edad, float nota) {
        super(nombre, edad);
        this.nota = nota;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
