package com.decorador;

public class CafeDescafeinado implements Cafe {
    @Override
    public String descripcion() {
        return "Café descafeinado";
    }

    @Override
    public double costo() {
        return 1.2;
    }
}