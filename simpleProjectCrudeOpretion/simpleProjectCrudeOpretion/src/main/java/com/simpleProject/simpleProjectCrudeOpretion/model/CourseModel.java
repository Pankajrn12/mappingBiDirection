package com.simpleProject.simpleProjectCrudeOpretion.model;

import lombok.Data;

import java.util.List;
@Data
public class CourseModel {
    private Long courseId;
    private String courseName;
    private String coursePrice;
    private String courseDuration;

    private List<StudentModel> studentModels;
}
