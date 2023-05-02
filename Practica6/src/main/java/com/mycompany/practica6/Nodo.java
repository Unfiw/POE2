/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica6;

/**
 *
 * @author marco
 */
public class Nodo {
    public Usuario usuario;
    
    
    private Lista lista;

    private Nodo anterior;
    private int cotizacion;

    // Constructor y otros métodos omitidos
    
    private Object valor;
    public Nodo siguiente;

    public Nodo(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public int getCotizacion() {
        return this.cotizacion;
    }

    public Lista getLista() {
        return this.lista;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

  

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo(Usuario usuario) {
        this.usuario = usuario;
        this.siguiente = null;
    }

}
