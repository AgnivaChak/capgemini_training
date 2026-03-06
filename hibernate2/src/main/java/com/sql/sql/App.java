package com.sql.sql;

import java.util.List;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Z6");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        
        Query query = em.createQuery("Select e from Employee e where e.name='ali'");
        List<Employee>list = query.getResultList();
        
        for(Employee e: list){
        	System.out.println(e);
        }
        
        tx.commit();
    }
}