package com.mycompany.practica7;

public class Prestamo {
        
    private String banco;
    private String tipoPrestamo;
    private String intereses;
    private int cantidad;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getTipoPrestamo() {
        return tipoPrestamo;
    }

    public void setTipoPrestamo(String tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }

    public Prestamo(String banco, String tipoPrestamo, String intereses, int cantidad) {
        this.banco = banco;
        this.tipoPrestamo = tipoPrestamo;
        this.cantidad = cantidad;
        this.intereses = intereses;
    }
    
}
