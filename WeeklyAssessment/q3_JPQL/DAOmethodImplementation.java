//we have to add this method inside CustomerDAOImpl.java
public Customer getCustomerByEmail(String email) {

    EntityManager em = emf.createEntityManager();

    TypedQuery<Customer> query =
            em.createQuery(
                    "SELECT c FROM Customer c WHERE c.email = :email",
                    Customer.class
            );

    query.setParameter("email", email);

    Customer customer = query.getSingleResult();

    em.close();

    return customer;
}
