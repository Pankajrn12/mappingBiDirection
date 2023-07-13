package com.simpleProject.simpleProjectCrudeOpretion.models;

import lombok.Data;

import java.util.List;

@Data
public class StudentModel {
    private Long studentId;
    private String studentName;
    private String studentMobileNumber;
    private String studentAddress;
    private String studentEmail;

    private List<AddressModel> addressModels;
}
