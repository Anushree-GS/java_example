package com.tutorsdude.create;

public class CreateOperation {
    static String[] employeNames = new String[5];

    public static void main(String[] args) {
        addString("Anu");
        addString("Hema");
        addString("Diksha");
        addString("Lakshmi");
        addString("Priya");


        for(int i=0; i< employeNames.length; i++){
            System.out.println(employeNames[i]);
        }
    }
    public static void addString(String name){
        for(int i=2; i<employeNames.length; i++){
            if(employeNames[i]==null){
                employeNames[i] = name;
                return;
            }
        }
    }


}
