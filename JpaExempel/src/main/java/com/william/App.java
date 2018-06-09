package com.william;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Kollega a = new Kollega();
        a.setK_id(1);
        a.setK_name("Pontus");
        a.setK_description("Spelutvecklare");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc123");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        System.out.println(a);



     //   Kollega a = em.find(Kollega.class,2);


    }
}
