package com.capgemini.training.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.training.dao.EmployeeRepository;
import com.capgemini.training.entity.Employee;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public void registerEmployee(Employee emp) {
        repo.save(emp);
    }

    public Employee login(String username, String password) {
        return repo.findByEmpNameAndEmpPassword(username, password);
    }
    
    public Employee updatePassword(String email, String newPassword) {

        Employee emp = repo.findByEmpEmail(email);

        if(emp != null) {
            emp.setEmpPassword(newPassword);
            repo.save(emp);
        }

        return emp;
    }
    
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

}