package com.simpleProject.simpleProjectCrudeOpretion.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentName;
    private String studentMobileNumber;
    private String studentAddress;
    private String studentEmail;

    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "student")
    private List<Address> addresses;

}
