package com.capgemini.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.ui.Model;
import com.capgemini.training.entity.Employee;
import com.capgemini.training.services.EmployeeService;

@Controller
public class LoginController {

    @Autowired
    EmployeeService service;

    @GetMapping("/")
    public String loginPage() {
        return "login.jsp";
    }

    @PostMapping("/login")
    public String validate(String username, String password, Model model) {

        Employee emp = service.login(username, password);

        if(emp != null) {

            model.addAttribute("employees", service.getAllEmployees());

            return "home.jsp";
        }

        return "login.jsp";
    }
    @GetMapping("/register")
    public String registerPage() {
        return "register.jsp";
    }

    @PostMapping("/registerEmployee")
    public String register(Employee emp) {

        service.registerEmployee(emp);

        return "login.jsp";
    }

    @GetMapping("/forgetpassword")
    public String forgotPasswordPage() {
        return "forgetpassword.jsp";
    }

    @PostMapping("/forgetpassword")
    public String resetPassword(String email, String newPassword, String confirmPassword) {

        if(!newPassword.equals(confirmPassword)) {
            return "forgetpassword.jsp";
        }

        Employee emp = service.updatePassword(email, newPassword);

        if(emp == null) {
            return "forgetpassword.jsp";  
        }

        return "login.jsp";
    }
}