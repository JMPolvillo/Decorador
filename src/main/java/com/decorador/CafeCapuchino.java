package com.decorador;

public class CafeCapuchino implements Cafe {
    
    public String descripcion() {
        return "Café capuchino";
    }

    
    public double coste() {
        return 2.0;
    }
}