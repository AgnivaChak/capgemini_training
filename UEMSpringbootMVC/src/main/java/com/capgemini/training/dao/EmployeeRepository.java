package com.capgemini.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.training.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Employee findByEmpNameAndEmpPassword(String empName, String empPassword);

    Employee findByEmpEmail(String empEmail);

}