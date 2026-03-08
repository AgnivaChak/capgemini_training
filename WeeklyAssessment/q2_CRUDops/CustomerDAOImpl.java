package dao;

import entity.Customer;
import jakarta.persistence.*;
import java.util.List;

public class CustomerDAOImpl {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("hibernatePU");

    // Insert new customer with order
    public void insertCustomer(Customer customer) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.persist(customer);
        tx.commit();

        em.close();
    }

    // Update customer details
    public void updateCustomer(Customer customer) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.merge(customer);
        tx.commit();

        em.close();
    }

    // Delete customer by id
    public void deleteCustomer(int id) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        Customer customer = em.find(Customer.class, id);
        if(customer != null) {
            em.remove(customer);
        }

        tx.commit();
        em.close();
    }

    // Fetch customer by id
    public Customer getCustomerById(int id) {

        EntityManager em = emf.createEntityManager();

        Customer customer = em.find(Customer.class, id);

        em.close();
        return customer;
    }

    // Fetch all customers
    public List<Customer> getAllCustomers() {

        EntityManager em = emf.createEntityManager();

        TypedQuery<Customer> query =
                em.createQuery("FROM Customer", Customer.class);

        List<Customer> customers = query.getResultList();

        em.close();

        return customers;
    }
}
