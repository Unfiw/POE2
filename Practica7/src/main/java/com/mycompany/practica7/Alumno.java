package com.mycompany.practica7;

public class Alumno {
    
    private String nombre;
    private String apellido;
    private String semestre;
    private int id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Alumno(String nombre, String apellido, String semestre, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.semestre = semestre;
        this.id = id;
    }
    
}
