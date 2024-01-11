package org.hibernatetask.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.hibernatetask.entity.Doctor;

import java.util.List;

public class JPAPractice {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // TODO: Add the code to insert some data into the tables
        entityManager.getTransaction().begin();

        Doctor doctor1 = new Doctor();
        doctor1.setDoctorName("John Doe");
        doctor1.setDoctorSpecialization("Cardiology");
        entityManager.persist(doctor1);

        Doctor doctor2 = new Doctor();
        doctor2.setDoctorName("Jane Smith");
        doctor2.setDoctorSpecialization("Dermatology");
        entityManager.persist(doctor2);

        entityManager.getTransaction().commit();

        entityManager.getTransaction().begin();

        TypedQuery<Doctor> query = entityManager.createQuery("from Doctor", Doctor.class);
        List<Doctor> doctors = query.getResultList();
        System.out.println(doctors);

        System.out.println("\n======================JPA Practice Output======================");
        for (Doctor doctor : doctors) {
            System.out.println("id :: " + doctor.getDoctorId());
            System.out.println("name :: " + doctor.getDoctorName());
            System.out.println("specialization :: " + doctor.getDoctorSpecialization());
        }
        System.out.println("===============================================================");

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
