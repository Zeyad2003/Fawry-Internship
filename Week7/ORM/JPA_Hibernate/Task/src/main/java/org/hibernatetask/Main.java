package org.hibernatetask;

import org.hibernatetask.entity.*;
import org.hibernatetask.repository.Task;
import org.hibernatetask.util.SampleDataSeeder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernatetask.util.SessionUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        // Add 20 sample data
        SampleDataSeeder sampleDataSeeder = new SampleDataSeeder(sessionFactory);
        for(int i = 0; i < 20; i++) sampleDataSeeder.insertSampleData();

        Hospital hospital = session.get(Hospital.class, 1);

        List<Doctor> doctors = Task.getDoctorList(hospital);

        System.out.println("\n======================Hibernate Task Output======================");

        for (Doctor doctor : doctors) {
            System.out.println("Doctor name: " + doctor.getDoctorName());
        }

        Doctor doctor = session.get(Doctor.class, 1);

        List<Patient> patients = Task.getPatientList(doctor);
        for (Patient patient : patients) {
            System.out.println("Patient name: " + patient.getPatientName());
        }

        List<Drug> drugs = Task.getDrugList(doctor);
        for (Drug drug : drugs) {
            System.out.println("Drug name: " + drug.getName());
        }
        System.out.println("=================================================================");

        session.close();
        sessionFactory.close();
    }
}
