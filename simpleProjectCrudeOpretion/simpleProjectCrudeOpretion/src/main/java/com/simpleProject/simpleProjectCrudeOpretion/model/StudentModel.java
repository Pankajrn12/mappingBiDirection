package com.simpleProject.simpleProjectCrudeOpretion.model;

import com.simpleProject.simpleProjectCrudeOpretion.entities.Course;
import lombok.Data;

import java.util.List;
@Data
public class StudentModel {
    private Long studentId;
    private String studentName;
    private String studentAge;
    private String studentMobileNumber;
    private String studentEmail;
    private String studentAddress;
    private List<CourseModel> courseModels;
}
