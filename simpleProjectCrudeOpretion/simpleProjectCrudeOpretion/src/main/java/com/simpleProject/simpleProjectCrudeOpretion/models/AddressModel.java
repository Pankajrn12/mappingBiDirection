package com.simpleProject.simpleProjectCrudeOpretion.models;

import lombok.Data;

import javax.persistence.ManyToOne;

@Data
public class AddressModel {
    private Long addressId;
    private String currentAddress;
    private String permanentAddress;


    private StudentModel studentModel;
}
