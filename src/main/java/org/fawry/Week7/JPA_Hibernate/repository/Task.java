package org.fawry.Week7.JPA_Hibernate.repository;

import org.fawry.Week7.JPA_Hibernate.Entities.*;
import org.fawry.Week7.JPA_Hibernate.Util.SessionUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static List<Doctor> getDoctorList(Hospital hospital) { // Get list of all doctors in a hospital
        return hospital.getDoctors();
    }

    public static List<Patient> getPatientList(Doctor doctor) { // Get list of all patients for a doctor
        return doctor.getPatients();
    }

    public static List<Drug> getDrugList(Doctor doctor) {
        List<Patient> patients = doctor.getPatients();
        List<Drug> drugs = new ArrayList<>();
        patients.stream().forEach(patient -> drugs.addAll(patient.getDrugs()));
        return drugs;
    }
}
