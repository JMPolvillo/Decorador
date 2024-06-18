package com.decorador;

public class CafeExpreso implements Cafe {
   
    public String descripcion() {
        return "Café expreso";
    }

    public double coste() {
        return 1.5;
    }
}
