package com.decorador;

public class ConNata extends Decorador {
    public ConNata(Cafe cafeDecorado) {
        super(cafeDecorado);
    }


    public String descripcion() {
        return cafeDecorado.descripcion() + ", con nata";
    }

    
    public double coste() {
        return cafeDecorado.coste() + 0.7;
    }
}