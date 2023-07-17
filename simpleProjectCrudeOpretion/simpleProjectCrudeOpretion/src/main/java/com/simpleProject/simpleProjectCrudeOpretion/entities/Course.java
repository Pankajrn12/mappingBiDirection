package com.simpleProject.simpleProjectCrudeOpretion.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;
    private String courseName;
    private String coursePrice;
    private String courseDuration;

//    @ManyToMany(cascade = CascadeType.ALL)
    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
}
