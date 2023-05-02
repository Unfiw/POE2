package com.mycompany.practica7;

public class Pila {
    
    public String valor1;
    public String valor2;
    public String valor3;
    public int valor4;
    
    public Nodo pila;
    
    public void push(String valor1, String valor2, String valor3, int valor4){
        
        Nodo nuevo = new Nodo(valor1, valor2, valor3, valor4);
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
                System.out.println("valor1: "+aux.getValor1() + "valor2: "+aux.getValor2() +"valor3: "+aux.getValor3() + "valor4: "+aux.getValor4());
                aux.getSiguiente();
            }
        }
    }
    
}
