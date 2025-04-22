package com.tutorsude.inheritance.multilevel;

public class multilevelRunner {
    public static void main(String[] args) {
        Vechile vechile = new Vechile();
        System.out.println(vechile.name);

        MotorBike motorbike = new MotorBike();
        System.out.println(motorbike.name);

        RoyalEnfield royalEnfield = new RoyalEnfield();
        System.out.println(royalEnfield.colour);
    }
}
