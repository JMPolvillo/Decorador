package com.decorador;

public class CafeCapuchino implements Cafe {
    @Override
    public String descripcion() {
        return "Café capuchino";
    }

    @Override
    public double costo() {
        return 2.0;
    }
}