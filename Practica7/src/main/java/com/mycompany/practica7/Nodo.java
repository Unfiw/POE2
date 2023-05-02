package com.mycompany.practica7;

public class Nodo {
    
    private String valor1;
    private String valor2;
    private String valor3;
    private int valor4;
    
    private Nodo siguiente;

    public String getValor1() {
        return valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    public String getValor3() {
        return valor3;
    }

    public void setValor3(String valor3) {
        this.valor3 = valor3;
    }

    public int getValor4() {
        return valor4;
    }

    public void setValor4(int valor4) {
        this.valor4 = valor4;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo(String valor1, String valor2, String valor3, int valor4) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
        this.valor4 = valor4;
        this.siguiente = null;
    }

    
    
}
