/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.chaitralippd.mp3;

import java.util.GregorianCalendar;
import java.util.Objects;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * In this scenario, MusicalScore overrode equals
 * and hashCode based on a business ID.  In this simple
 * example, I used a simulation of ISBN.
 * 
 * @author sas691
 */
public class Scenario {
    public static void main( String ... args){

        Tickets b1 = new Tickets(Double.valueOf(333),Long.valueOf(333),"333",new GregorianCalendar(2, 5, 2012).getTime());

        Tickets b2 = new Tickets(Double.valueOf(333),Long.valueOf(333),"333",new GregorianCalendar(2, 5, 2012).getTime());
 // Customer b1 = new Customer("Ludwig", "Beethoven","12345","john@gmail.com",Long.valueOf(345677));
  // Customer b2 = new Customer("John", "Degeneres","123456","john@gmail.com",Long.valueOf(313457));
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("chaitralippdPU");
        EntityManager em1 = emf.createEntityManager();
        EntityManager em2 = emf.createEntityManager();
        EntityTransaction tx = em1.getTransaction();

        tx.begin();
        em1.persist(b1);
        em1.persist(b2);
        tx.commit();
        
        if(b1 == b2){
            System.out.println("b1 == b2 is true");
        } else {
            System.out.println("b1 == b2 is false");
        }

        if(b1.equals(b2)){
            System.out.println("b1.equals(b2) is true");
        } else {
            System.out.println("b1.equals(b2) is false");
        }

        if(Objects.equals(b1, b2)){
            System.out.println("Objects.equals(b1, b2) is true");
        } else {
            System.out.println("Objects.equals(b1, b2) is false");
        }
        
        
        em1.close();
        em2.close();
        emf.close();
        
    }
}
