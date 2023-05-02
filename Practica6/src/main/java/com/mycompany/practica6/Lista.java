package com.mycompany.practica6;

/**
 *
 * @author marco
 */
public class Lista {
    
    private Cotizacion cotizacion;
    public  Nodo primero;
    
    public Lista(){
        cotizacion = null;
        primero = null;
    }
    
    public void agregarCotizacion(short cantDias,/* double subtotal, double IVA, double totalPagar, */double mensualidad, double destinoTuristico, double tipoHabitacion, String sDestinoTuristico, String sTipoHabitacion, String tipoPago){ 
        
       Cotizacion nueva = new Cotizacion(cantDias, /*subtotal, IVA, totalPagar,*/ mensualidad, destinoTuristico, tipoHabitacion,sDestinoTuristico, sTipoHabitacion, tipoPago);
       
       if(cotizacion == null){
           cotizacion = nueva;
       }
       else{
           Cotizacion aux = cotizacion;
           while(aux.getSigueinte() != null){
               aux = aux.getSigueinte();
           }
           aux.setSigueinte(nueva);
       }
    }
    
    public void agregarUsuario(Usuario usuario) {
       
        Nodo nuevoNodo = new Nodo(usuario);
        if (this.primero == null) {
            this.primero = nuevoNodo;
        } else {
            Nodo nodoActual = this.primero;
            while (nodoActual.getSiguiente() != null) {
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.siguiente = nuevoNodo;
        }
        
    }
    
    public String mostrarCotizaciones(){
        
        String mostrar = "";
        Cotizacion aux = cotizacion;
        
        if(cotizacion == null){
            mostrar = "Lista Vacia";
        }
        else{
            while(aux != null){
                mostrar = "Dias: "+aux.getCantDias()+"\n"+"Subtotal: "+aux.getSubtotal()+"\n"+"IVA: "+aux.getIVA()+"\n"+"Total pagar: "+aux.getTotalPagar()+"\n"+"Mensualidad: "+aux.getMensualidad()+"\n"+"Destino: "+aux.getsDestinoTuristico()+"\n"+"Tipo de habitacion: "+aux.getsTipoHabitacion()+"\n"+"Tipo de pago: "+aux.getTipoPago()+"\n"+"\n";
                aux = aux.getSigueinte();
            }
        }
        return mostrar;
    }
    
    public boolean estaVacio(){
        return cotizacion == null;
    }   
    
    public Nodo getPrimero(){
        return primero;
    }
    
    public Usuario buscarUsuario(String nombre) {
        Nodo nodoActual = this.primero;
        while (nodoActual != null) {
            if (nodoActual.usuario.getUsuario().equals(nombre)) {
                return nodoActual.usuario;
            }
            nodoActual = nodoActual.getSiguiente();
        }
        return null;
    }
    
}
