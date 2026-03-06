package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TaskDAO {

    private EntityManagerFactory emf;
    private EntityManager em;
    public TaskDAO()
    {
        this.emf= Persistence.createEntityManagerFactory("title");
        this.em=emf.createEntityManager();
    }
}