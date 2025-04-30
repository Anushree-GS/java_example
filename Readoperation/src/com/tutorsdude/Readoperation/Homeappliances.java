package com.tutorsdude.Readoperation;

public class Homeappliances {

    String[] appliances = new String[5];

    public void addAppliance(String appliance){
        if(appliances!=null && appliance.length() >= 5) {

            for (int i = 0; i < appliance.length(); i++) {

                if (appliances[i] == null){
                    appliances[i]= appliance;


                    System.out.println("We need " + appliance);
                    return;
                }
                else {
                    System.out.println("index is filled");
                }
            }
            System.out.println("space is over");
        }
        else  {
            System.out.println("appliance is not valid");
        }
    }

    public String[] readAll() {
        return appliances;
    }
}
