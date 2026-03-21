package com.capgemini.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.capgemini.training.entity.Employee;
import com.capgemini.training.services.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/allemp")
    public String getAllEmployees(Model model) {

        List<Employee> list = service.getAllEmployees();

        model.addAttribute("employees", list);

        return "home.jsp";
    }
}