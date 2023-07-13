package com.simpleProject.simpleProjectCrudeOpretion.resources;

import com.simpleProject.simpleProjectCrudeOpretion.models.StudentModel;
import com.simpleProject.simpleProjectCrudeOpretion.models.UserModel;
import com.simpleProject.simpleProjectCrudeOpretion.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping")
public class StudentResource {
    @Autowired
    StudentService studentService;

               // OneToMany & ManyToOne BiDirectional
    @PostMapping("/saveStudentDetails")
    private ResponseEntity saveStudentDetails(@RequestBody StudentModel studentModel){
        return studentService.saveStudentDetails(studentModel);
    }

                       // OneToOne BiDirectional

    @PostMapping("/saveUserDetails")
    public ResponseEntity saveUserDetails(@RequestBody UserModel userModel){
        return studentService.saveUserDetails(userModel);
    }
}
