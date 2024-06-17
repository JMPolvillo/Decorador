package com.decorador;

public class ConChocolate extends Decorador {
    public ConChocolate(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    @Override
    public String descripcion() {
        return cafeDecorado.descripcion() + ", con chocolate";
    }

    @Override
    public double costo() {
        return cafeDecorado.costo() + 0.7;
    }
}
