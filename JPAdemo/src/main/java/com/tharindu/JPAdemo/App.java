package com.tharindu.JPAdemo;

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
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit"); 
        EntityManager em = emf.createEntityManager();
        
        //fetch the data
        //Person p =  em.find(Person.class, 106);
        //System.out.println(p);
        
        //Save data
        Person p = new Person();
        p.setId(101);
        p.setName("Kasun");
        p.setPoints(90);
        
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        
    }
}
