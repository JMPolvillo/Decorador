package com.decorador;

public abstract class Decorador implements Cafe {
    protected Cafe cafeDecorado;

    public Decorador(Cafe cafeDecorado) {
        this.cafeDecorado = cafeDecorado;
    }

    public String descripcion() {
        return cafeDecorado.descripcion();
    }

    public double coste() {
        return cafeDecorado.coste();
    }
}