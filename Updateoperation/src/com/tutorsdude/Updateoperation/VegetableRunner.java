package com.tutorsdude.Updateoperation;

import com.tutorsdude.Updateoperation.app.Vegetable;

public class VegetableRunner {
    public static void main(String[] args) {
        Vegetable vegetable = new Vegetable();
        vegetable.addVegetable("Onion");
        vegetable.addVegetable("Tomato");
        vegetable.addVegetable("Carrot");
        vegetable.addVegetable("Betroot");
        vegetable.addVegetable("Radish");

        String[] readVegetable = vegetable.readAll();

        for (int i = 0; i < readVegetable.length; i++) {
            System.out.println(readVegetable[i]);

        }

        System.out.println("--------------------------");
        boolean result = vegetable.update("Tomatoooo", "Sweet Tomato");
        System.out.println(result);

        String[] readVegetable1 = vegetable.readAll();

        for (int i = 0; i < readVegetable1.length; i++) {
            System.out.println(readVegetable1[i]);


        }
        System.out.println("-------------------------");
        boolean result2 = vegetable.delete("Tomato" );
        System.out.println(result2);

        String[] readVegetable2 = vegetable.readAll();

        for (int i = 0; i < readVegetable2.length; i++) {
            System.out.println(readVegetable2[i]);


        }
    }
}
