package org.fawry.Week7.JPA_Hibernate.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Long patientId;

    @Column(name = "patient_name")
    private String patientName;

    @Column(name = "patient_age")
    private int patientAge;

    @ManyToOne
    @JoinColumn(name = "patient_hospitalID", referencedColumnName = "hospital_id")
    private Hospital hospital;

    @ManyToOne
    @JoinColumn(name = "patient_doctorID", referencedColumnName = "doctor_id")
    private Doctor doctor;

    @ManyToMany
    @JoinTable(name = "patients_drugs", joinColumns =
    @JoinColumn(name = "patient_id"), inverseJoinColumns = @JoinColumn(name = "drug_id"))
    private List<Drug> drugs;
}
