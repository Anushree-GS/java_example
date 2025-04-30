package com.tutorsdude.Updateoperation.app;

public class Vegetable {
    String[] vegetables = new String[5];

    public void addVegetable(String vegetable) {
        if (vegetables != null && vegetable.length() >= 5) {

            for (int i = 0; i < vegetable.length(); i++) {

                if (vegetables[i] == null) {
                    vegetables[i] = vegetable;


                    System.out.println("Its a " + vegetable);
                    return;
                } else {
                    System.out.println("index is filled");
                }
            }
            System.out.println("space is over");
        } else {
            System.out.println("appliance is not valid");
        }
    }

    public boolean find(String name){
        for(int i =0; i< vegetables.length; i++){
            if (vegetables[i].equals(name)){
                System.out.println("Vegetable found");
                return true;

            }else{
                return false;
            }
        }
        System.out.println("Vegetable not found");
        return false;
    }

    public String[] readAll() {
        return vegetables;
    }

    public boolean update(String oldValue, String newValue) {
        if (oldValue != null && newValue != null) {
            for (int i = 0; i < vegetables.length; i++) {
                if (vegetables[i].equals(oldValue)) {
                    vegetables[i] = newValue;
                    return true;
                }
            }
            System.out.println("The old value is not available");
        } else {
            System.out.println("Inputs are invalid");
            return false;

        }


        return false;
    }
    public boolean delete(String oldValue) {
        if (oldValue != null) {
            for (int i = 0; i < vegetables.length; i++) {
                if (vegetables[i].equals(oldValue)) {
                    vegetables[i] = null;
                    return true;
                }
            }
            System.out.println("The old value is not available");
            return false;
        } else {
            System.out.println("Inputs are invalid");
            return false;

        }
    }

}