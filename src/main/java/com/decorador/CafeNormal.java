package com.decorador;

public class CafeNormal implements Cafe {
    @Override
    public String descripcion() {
        return "Café normal";
    }

    @Override
    public double coste() {
        return 1.0;
    }
}