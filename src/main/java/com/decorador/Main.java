package com.decorador;

public class Main {
    public static void main(String[] args) {

        Cafe cafe = new CafeExpreso();
        
        cafe = new ConLeche(cafe); 
        cafe = new ConChocolate(cafe); 

        System.out.println("Descripción: " + cafe.descripcion() + ", Coste: €" + cafe.coste());
    }
}