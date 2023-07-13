package com.simpleProject.simpleProjectCrudeOpretion.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private String userMobileNumber;
    private String userAddress;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Laptop laptop;

}
