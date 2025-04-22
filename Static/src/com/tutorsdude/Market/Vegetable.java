package com.tutorsdude.Market;

public class Vegetable {
  static  String name ;
    int price;
   static String color;
    static String owner;
    static String marketName;

    static{
        String owner = "Adya";
        String marketName = "GreenVegetables";
        String color = "multiColors";

        System.out.println("ownerName is :" + owner);
        System.out.println("market name is:" + marketName);

        System.out.println("vegetables color is :" + color);


    }

        public static void main(String[] args) {
            System.out.println("heyyy its a market!!!!");
            Vegetable.name ="Onion";



        }
        Vegetable(int price){
            this.price=price;





    }






}
