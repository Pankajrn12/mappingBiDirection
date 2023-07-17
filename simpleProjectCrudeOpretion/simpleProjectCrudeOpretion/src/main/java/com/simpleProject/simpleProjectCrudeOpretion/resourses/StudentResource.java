package com.simpleProject.simpleProjectCrudeOpretion.resourses;

import com.simpleProject.simpleProjectCrudeOpretion.model.StudentModel;
import com.simpleProject.simpleProjectCrudeOpretion.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mapping")
public class StudentResource {
    @Autowired
    StudentService studentService;
    @PostMapping("/saveStudentDetailsManyToManyBiDirectional")
    public ResponseEntity saveStudentDetailsManyToManyBiDirectional(@RequestBody StudentModel studentModel){
        return studentService.saveStudentDetailsManyToManyBiDirectional(studentModel);
    }


}
