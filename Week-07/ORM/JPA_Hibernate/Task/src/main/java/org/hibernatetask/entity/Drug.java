package org.hibernatetask.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "drugs")
public class Drug {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "drug_id")
    private Long id;

    @Column(name = "drug_name")
    private String name;

    @Column(name = "drug_price")
    private Double price;

    @ManyToMany(mappedBy = "drugs")
    private List<Patient> patients;
}
