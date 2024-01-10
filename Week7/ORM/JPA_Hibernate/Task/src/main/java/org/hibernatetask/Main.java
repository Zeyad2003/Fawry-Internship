package org.hibernatetask;

import org.hibernatetask.entity.*;
import org.hibernatetask.repository.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
      /*  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        //Session session = entityManager.unwrap(Session.class);
        entityManager.getTransaction().begin();
        //entityManager.persist(employee);
        Doctor test = entityManager.find(Doctor.class, 1);
        System.out.println("name :: " + test.getDoctorName());
        System.out.println("id :: " + test.getDoctorId());

        TypedQuery<Doctor> query = entityManager.createQuery("from Doctor", Doctor.class);
        List<Doctor> doctors = query.getResultList();
        System.out.println(doctors);
        for (Doctor doctor : doctors) {
            System.out.println("name :: " + doctor.getDoctorName());
            System.out.println("id :: " + doctor.getDoctorId());
        }
//        System.out.println("specialization :: " + test.getDoctorSpecialization());
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();*/

        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
//        SampleDataSeeder sampleDataSeeder = new SampleDataSeeder(sessionFactory);
//        sampleDataSeeder.insertSampleData();

        Hospital hospital = session.get(Hospital.class, 1);

        List<Doctor> doctors = Task.getDoctorList(hospital);

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

        session.close();
        sessionFactory.close();
    }
}
