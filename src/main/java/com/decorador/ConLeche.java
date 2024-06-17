package com.decorador;

public class ConLeche extends Decorador {
    public ConLeche(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String descripcion() {
        return cafeDecorado.descripcion() + ", con leche";
    }

    @Override
    public double costo() {
        return cafeDecorado.costo() + 0.5;
    }
}
