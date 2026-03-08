package dao;

import entity.Order;
import jakarta.persistence.*;

public class OrderDAOImpl {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("hibernatePU");

    // Update order details
    public void updateOrder(Order order) {

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.merge(order);
        tx.commit();

        em.close();
    }

    // Fetch order by id
    public Order getOrderById(int id) {

        EntityManager em = emf.createEntityManager();

        Order order = em.find(Order.class, id);

        em.close();

        return order;
    }
}
