package com.mycompany.practica8;

public class Cola {
    
    public Nodo cola;
    
    public Cola(){
        cola = null;
    }
    
    public void encolar(int valor){
        
        Nodo nuevo = new Nodo(valor);
        
        if(cola == null){
            cola = nuevo;
        }else{
            Nodo aux = cola;
            
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    
    public void recorrerCola(){
        
        Nodo aux = cola;
        
        if(cola == null){
            System.out.println("La cola esta vacia");
        }else{
            
            while(aux != null){
                System.out.println("Valor: "+aux.getValor());
                aux = aux.getSiguiente();
            }
        }
    }
    
    public void desencolar(){
        
        Nodo aux = cola;
        
        if(cola == null){
            System.out.println("La cola esta vacia");
        }else{
            if(aux.getSiguiente() == null){
                cola = null;
            }else{
                cola = aux.getSiguiente();
            }
            System.out.println("Primer elemento eliminado");
        }
    }
}
