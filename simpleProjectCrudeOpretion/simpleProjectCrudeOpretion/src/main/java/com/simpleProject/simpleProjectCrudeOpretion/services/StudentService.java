package com.simpleProject.simpleProjectCrudeOpretion.services;

import com.simpleProject.simpleProjectCrudeOpretion.entities.Course;
import com.simpleProject.simpleProjectCrudeOpretion.entities.Student;
import com.simpleProject.simpleProjectCrudeOpretion.model.StudentModel;
import com.simpleProject.simpleProjectCrudeOpretion.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Transactional
    public ResponseEntity saveStudentDetailsManyToManyBiDirectional(StudentModel studentModel) {
        List<Student> studentList = new ArrayList<>();
        Student student = new Student();
        student.setStudentAge(studentModel.getStudentAge());
        student.setStudentId(studentModel.getStudentId());
        student.setStudentName(studentModel.getStudentName());
        student.setStudentEmail(studentModel.getStudentEmail());
        student.setStudentAddress(studentModel.getStudentAddress());
        student.setStudentMobileNumber(studentModel.getStudentMobileNumber());
        studentList.add(student);

        List<Course> courseList = new ArrayList<>();
        studentModel.getCourseModels().stream().forEach(data->{
            Course course = new Course();
            course.setCoursePrice(data.getCoursePrice());
            course.setCourseName(data.getCourseName());
            course.setCourseDuration(data.getCourseDuration());
            course.setCourseId(data.getCourseId());

            courseList.add(course);
        });
        student.setCourses(courseList);

        studentRepository.saveAll(studentList);
        return new ResponseEntity<>("Save Student Details Many to Many BiDirectional Using Mapping ", HttpStatus.OK);
    }
}