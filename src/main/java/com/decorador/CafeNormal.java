package com.decorador;

public class CafeNormal implements Cafe {
    
    public String descripcion() {
        return "Café normal";
    }

    
    public double coste() {
        return 1.0;
    }
}