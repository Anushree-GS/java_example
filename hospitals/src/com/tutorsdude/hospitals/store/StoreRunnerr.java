package com.tutorsdude.hospitals.store;

public class StoreRunnerr {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.name="Anu";
        doctor.age=18;
        doctor.availableOn="Sunday";
        doctor.speciality="Neureology";


        System.out.println(doctor.name);
        System.out.println(doctor.age);
        System.out.println(doctor.availableOn);
        System.out.println(doctor.speciality);

        System.out.println(doctor);

    }
}
