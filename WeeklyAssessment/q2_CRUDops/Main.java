package main;

import dao.CustomerDAOImpl;
import entity.Customer;
import entity.Order;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        CustomerDAOImpl dao = new CustomerDAOImpl();

        Order order = new Order(
                "ORD101",
                "Laptop",
                1,
                65000,
                LocalDate.now()
        );

        Customer customer = new Customer(
                "Agniva",
                "agniva@email.com",
                "Male",
                9876543210L,
                LocalDate.now(),
                order
        );

        // Insert customer with order
        dao.insertCustomer(customer);

        System.out.println("Customer inserted successfully");
    }
}
