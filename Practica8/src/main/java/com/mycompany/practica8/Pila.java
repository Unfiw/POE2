package com.mycompany.practica8;

public class Pila {
    
    public int valor;
    
    public Nodo pila;
    
    public void push(int valor){
        
        Nodo nuevo = new Nodo(valor);
        if(pila == null){
            pila = nuevo;
        }else{
            Nodo aux = pila;
            pila = nuevo;
            nuevo.setSiguiente(aux);
        }
    }
    
    public void pop(){
        
        Nodo aux = pila;
        
        if(pila == null){
            
            System.out.println("La pila esta vacia");
            
        }else{
            
            if (aux.getSiguiente() == null) {
                
                pila = null;
                
            }else{
                pila = aux.getSiguiente();
            }
        }
    }
    
    public void recorrerPila(){
        
        Nodo aux = pila;
        
        if(pila == null){
            System.out.println("La pila esta vacia");
        }else{
            
            while(aux != null){
                System.out.println("Valor: "+aux.getValor() );
                aux.getSiguiente();
            }
        }
    }
    
}

