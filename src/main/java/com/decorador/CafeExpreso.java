package com.decorador;

public class CafeExpreso implements Cafe {
    @Override
    public String descripcion() {
        return "Café expreso";
    }

    @Override
    public double coste() {
        return 1.5;
    }
}
