package com.mycompany.practica4;

public class Reciclaje {

    private String tipo;
    private String nombre;
    private double cantidad;
    private double peso;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Reciclaje(String tipo, String nombre, double cantidad, double peso) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.peso = peso;
    }
    
    public Reciclaje() {
        this.tipo = "";
        this.nombre = "";
        this.cantidad = 0;
        this.peso = 0;
    }
    
}
