package com.tutorsdude.association.hospital;

public class Hospital {
    String hospitalName;
    Department department;
    String ceoName;
    Doctor doctor;
    Patient patient;
    Address address;

    public Hospital(String hospitalName,String department,String ceoName,Doctor doctor,Patient patient,Address address) {

    this.hospitalName = hospitalName;

    this.ceoName=ceoName;
    this.doctor=doctor;
    this.patient=patient;
    this.address=address;
    }

    public void hospitalDetails() {
        System.out.println("Hospital Details");
    }
    public void hospitalDetail() {
        System.out.println("Hospital hospitalName: " + hospitalName);
        System.out.println("Department: " + department);
        System.out.println("CEO: " + ceoName);
        System.out.println("Doctor: " + doctor);
        System.out.println("Patient: " + patient);
        System.out.println("Address: " + address);

    }
}
