package com.mycompany.practica6;

/**
 *
 * @author marco
 */
public class Cotizacion {
    
    private  short  cantDias;
    private double subtotal;
    private double IVA;
    private double totalPagar;
    private double mensualidad;
    private double destinoTuristico;
    private double tipoHabitacion;
   
    
    private String sDestinoTuristico;
    private String sTipoHabitacion;
    private String tipoPago;
    
    private Cotizacion sigueinte;

    public Cotizacion getSigueinte() {
        return sigueinte;
    }

    public void setSigueinte(Cotizacion sigueinte) {
        this.sigueinte = sigueinte;
    }

    public short getCantDias() {
        return cantDias;
    }

    public void setCantDias(short cantDias) {
        this.cantDias = cantDias;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public double getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(double mensualidad) {
        this.mensualidad = mensualidad;
    }

    public double getDestinoTuristico() {
        return destinoTuristico;
    }

    public void setDestinoTuristico(double destinoTuristico) {
        this.destinoTuristico = destinoTuristico;
    }

    public double getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(double tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getsDestinoTuristico() {
        return sDestinoTuristico;
    }

    public void setsDestinoTuristico(String sDestinoTuristico) {
        this.sDestinoTuristico = sDestinoTuristico;
    }

    public String getsTipoHabitacion() {
        return sTipoHabitacion;
    }

    public void setsTipoHabitacion(String sTipoHabitacion) {
        this.sTipoHabitacion = sTipoHabitacion;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Cotizacion(short cantDias,/* double subtotal, double IVA, double totalPagar,*/ double mensualidad, double destinoTuristico, double tipoHabitacion,String sDestinoTuristico, String sTipoHabitacion, String tipoPago/*, Cotizacion sigueinte*/) {
        this.cantDias = cantDias;
        this.mensualidad = (cantDias * (destinoTuristico + tipoHabitacion))/mensualidad;
        this.destinoTuristico = destinoTuristico;
        this.tipoHabitacion = tipoHabitacion;
        this.sDestinoTuristico = sDestinoTuristico;
        this.sTipoHabitacion = sTipoHabitacion;
        this.tipoPago = tipoPago;
        this.sigueinte = null;
        
        this.subtotal = (cantDias * (destinoTuristico + tipoHabitacion));
        this.IVA = subtotal * 0.16;
        this.totalPagar = (cantDias * (destinoTuristico + tipoHabitacion)) + IVA;

    }
   
}
