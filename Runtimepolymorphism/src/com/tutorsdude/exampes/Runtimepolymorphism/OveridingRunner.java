package com.tutorsdude.exampes.Runtimepolymorphism;

public class OveridingRunner {

    public static void main(String[] args) {
        Vechile vec = new Vechile();
        vec.vechileDetails("Bike", 10000);



        Car car = new Car();
        car.carDetail("Maruti suzki", 800000);

        Name name = new Name();
        name.names();

        Studentname stu = new Studentname();
        stu.studentnames();

        Flower flw = new Flower();
        flw.flower();

        Rose rss = new Rose();
        rss.rose();


        Mathematicaloperations add1 = new Mathematicaloperations();
        int addition = add1.add(399999, 1);
        System.out.println(addition);

        Multiplication add2 = new Multiplication();
        int multiply = add2.add(56, 754);
        System.out.println(multiply);


    }


}
