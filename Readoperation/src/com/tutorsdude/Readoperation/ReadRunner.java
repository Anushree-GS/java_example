package com.tutorsdude.Readoperation;

public class ReadRunner {

    public static void main(String[] args) {
        Homeappliances homeappliances = new Homeappliances();
        homeappliances.addAppliance("Television");
        homeappliances.addAppliance("Refrigerator");
        homeappliances.addAppliance("Sofa");
        homeappliances.addAppliance("Dinning Table");
        homeappliances.addAppliance("Mixer");

        String[] readApppliances = homeappliances.readAll();

        for (int i = 0; i < readApppliances.length; i++) {
            System.out.println(readApppliances[i]);

        }
    }

}
