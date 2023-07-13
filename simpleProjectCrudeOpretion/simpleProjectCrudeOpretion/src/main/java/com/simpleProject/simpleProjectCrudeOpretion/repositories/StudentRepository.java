package com.simpleProject.simpleProjectCrudeOpretion.repositories;

import com.simpleProject.simpleProjectCrudeOpretion.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
