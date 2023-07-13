package com.simpleProject.simpleProjectCrudeOpretion.repositories;

import com.simpleProject.simpleProjectCrudeOpretion.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
