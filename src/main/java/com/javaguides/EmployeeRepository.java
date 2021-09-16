package com.javaguides;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaguides.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
