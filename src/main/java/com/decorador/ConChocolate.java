package com.decorador;

public class ConChocolate extends Decorador {
    public ConChocolate(Cafe cafeDecorado) {
        super(cafeDecorado);
    }

   
    public String descripcion() {
        return cafeDecorado.descripcion() + ", con chocolate";
    }

    
    public double coste() {
        return cafeDecorado.coste() + 0.7;
    }
}
