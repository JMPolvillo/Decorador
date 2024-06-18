package com.decorador;

public class CafeDescafeinado implements Cafe {
    
    public String descripcion() {
        return "Café descafeinado";
    }

   
    public double coste() {
        return 1.2;
    }
}