package com.simpleProject.simpleProjectCrudeOpretion.services;

import com.simpleProject.simpleProjectCrudeOpretion.entities.Address;
import com.simpleProject.simpleProjectCrudeOpretion.entities.Laptop;
import com.simpleProject.simpleProjectCrudeOpretion.entities.Student;
import com.simpleProject.simpleProjectCrudeOpretion.entities.User;
import com.simpleProject.simpleProjectCrudeOpretion.models.LaptopModel;
import com.simpleProject.simpleProjectCrudeOpretion.models.StudentModel;
import com.simpleProject.simpleProjectCrudeOpretion.models.UserModel;
import com.simpleProject.simpleProjectCrudeOpretion.repositories.AddressRepository;
import com.simpleProject.simpleProjectCrudeOpretion.repositories.StudentRepository;
import com.simpleProject.simpleProjectCrudeOpretion.repositories.UserRepository;
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
    @Autowired
    AddressRepository addressRepository;

    @Autowired
    UserRepository userRepository;

    @Transactional
    public ResponseEntity saveStudentDetails(StudentModel studentModel) {
        Student student = new Student();
        student.setStudentEmail(studentModel.getStudentEmail());
        student.setStudentName(studentModel.getStudentName());
        student.setStudentAddress(studentModel.getStudentAddress());
        student.setStudentId(studentModel.getStudentId());
        student.setStudentMobileNumber(studentModel.getStudentMobileNumber());

        List<Address> addresses = new ArrayList<>();
        studentModel.getAddressModels().stream().forEach(data->{
            Address address = new Address();
            address.setCurrentAddress(data.getCurrentAddress());
            address.setPermanentAddress(data.getPermanentAddress());
            address.setAddressId(data.getAddressId());

            addresses.add(address);
        });
        student.setAddresses(addresses);

        studentRepository.save(student);
        return new ResponseEntity<>("saved Student Details mapping bidirectional", HttpStatus.OK);
    }

    @Transactional
    public ResponseEntity saveUserDetails(UserModel userModel) {
        User user = new User();
        user.setUserAddress(userModel.getUserAddress());
        user.setUserId(userModel.getUserId());
        user.setUserName(userModel.getUserName());
        user.setUserMobileNumber(userModel.getUserMobileNumber());

        Laptop laptop = new Laptop();
        laptop.setLaptopRom(userModel.getLaptopModel().getLaptopRom());
        laptop.setLaptopRam(userModel.getLaptopModel().getLaptopRam());
        laptop.setLaptopId(userModel.getLaptopModel().getLaptopId());
        laptop.setLaptopModel(userModel.getLaptopModel().getLaptopModel());

        user.setLaptop(laptop);

        userRepository.save(user);
        return new ResponseEntity<>("saved User Details biDirection Mapping using ", HttpStatus.OK);
    }
}
