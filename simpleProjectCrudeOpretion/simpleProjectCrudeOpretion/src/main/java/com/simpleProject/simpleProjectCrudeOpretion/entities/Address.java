package com.simpleProject.simpleProjectCrudeOpretion.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private String currentAddress;
    private String permanentAddress;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Student student;

}
