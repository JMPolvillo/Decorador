package com.decorador;

public class ConNata extends Decorador {
    public ConNata(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String descripcion() {
        return cafeDecorado.descripcion() + ", con nata";
    }

    @Override
    public double costo() {
        return cafeDecorado.costo() + 0.7;
    }
}