package com.simpleProject.simpleProjectCrudeOpretion.repositories;

import com.simpleProject.simpleProjectCrudeOpretion.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
