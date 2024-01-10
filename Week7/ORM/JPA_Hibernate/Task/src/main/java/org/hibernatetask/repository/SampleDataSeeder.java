package org.hibernatetask.repository;

import org.hibernatetask.entity.Doctor;
import org.hibernatetask.entity.Drug;
import org.hibernatetask.entity.Hospital;
import org.hibernatetask.entity.Patient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SampleDataSeeder {

    private final SessionFactory sessionFactory;

    public SampleDataSeeder(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void  insertSampleData() {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            // Create sample hospital
            Hospital hospital = new Hospital();
            hospital.setHospitalName(TestDataGenerator.generateRandomName() + " Hospital");
            session.persist(hospital);

            // Create sample doctor
            Doctor doctor = new Doctor();
            doctor.setDoctorName(TestDataGenerator.generateRandomName() + "Doctor");
            doctor.setDoctorSpecialization(TestDataGenerator.generateRandomSpecialization() + " Specialization");
            doctor.setHospital(hospital);
            session.persist(doctor);

            // Create sample drug
            Drug drug = new Drug();
            drug.setName(TestDataGenerator.generateRandomName() + " Drug");
            drug.setPrice(TestDataGenerator.generateRandomPrice());
            session.persist(drug);

            // Create sample patient
            Patient patient = new Patient();
            patient.setPatientName(TestDataGenerator.generateRandomName() + " Patient");
            patient.setPatientAge(TestDataGenerator.generateRandomAge());
            patient.setHospital(hospital);
            patient.setDoctor(doctor);
            patient.getDrugs().add(drug);
            session.persist(patient);

            transaction.commit();
        }
    }
}
