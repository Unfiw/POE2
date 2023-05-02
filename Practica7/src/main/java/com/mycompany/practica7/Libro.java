package com.mycompany.practica7;

public class Libro {
    
    private String nombre;
    private String autor;
    private String editorial;
    private int numPaginas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Libro(String nombre, String autor, String editorial, int numPaginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
    }
    
}
