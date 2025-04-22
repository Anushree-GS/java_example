package com.tutorsdude.staticblock;

public  class keyboard {


    static String brand;
    static int price;
    int noOfKeys;



    public static void main(String[] args) {
        System.out.println("Main method of keyboard");
        keyboard.brand = "Samsung";
        keyboard.price = 500;

    }


    static {
        System.out.println("static block of keyboard");
        brand = "hp";
        price = 88999;

    }

    keyboard(int noOfKeys){
        System.out.println("Keyboard is good");
        this.noOfKeys = noOfKeys;
    }
}