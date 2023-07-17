package com.simpleProject.simpleProjectCrudeOpretion.repositories;

import com.simpleProject.simpleProjectCrudeOpretion.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
