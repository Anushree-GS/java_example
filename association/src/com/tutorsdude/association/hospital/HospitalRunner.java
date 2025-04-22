package com.tutorsdude.association.hospital;

public class HospitalRunner {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        hospital.hospitalName="Arogya";
        hospital.ceoName="Ayush";

        Department dept1 = new Department();
        dept1.departmentName="operation";
        dept1.chiefDoctor="Bharti";
        dept1.deptId=12;

        hospital.department=dept1;

        Doctor doctor1 = new Doctor();
        doctor1.doctorName="Riya";
        doctor1.specializedIn="Surgery";
        doctor1.noOfOperations=346;
        hospital.doctor=doctor1;

        Patient patient1 = new Patient();
        patient1.patientName="Saraswati";
        patient1.disease="Cough";
        patient1.address="vidyaNagar";
        patient1.age=25;
        hospital.patient=patient1;

        Address address1 = new Address();
        address1.no=6;
        address1.name="anugrahaNilaya";
        address1.area="VidyaNagar";
        address1.city="Davanagare";
        hospital.address=address1;
    }
}
