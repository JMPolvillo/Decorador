package com.decorador;

public class Main {
    public static void main(String[] args) {

        Cafe cafe = new CafeExpreso();
        
        System.out.println("Descripción: " + cafe.descripcion() + ", Costo: $" + cafe.costo());

        cafe = new ConLeche(cafe);
        cafe = new ConChocolate(cafe);
        cafe = new ConNata(cafe);

        System.out.println("Descripción: " + cafe.descripcion() + ", Costo: $" + cafe.costo());
    }
}