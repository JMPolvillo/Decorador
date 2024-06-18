package com.decorador;

public class ConLeche extends Decorador {
    public ConLeche(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

    
    public String descripcion() {
        return cafeDecorado.descripcion() + ", con leche";
    }

    
    public double coste() {
        return cafeDecorado.coste() + 0.5;
    }
}
