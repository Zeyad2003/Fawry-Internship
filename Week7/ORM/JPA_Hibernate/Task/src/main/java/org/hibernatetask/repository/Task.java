package org.hibernatetask.repository;

import org.hibernatetask.entity.*;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static List<Doctor> getDoctorList(Hospital hospital) {
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
