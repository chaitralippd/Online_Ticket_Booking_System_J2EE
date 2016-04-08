/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.chaitralippd.mp3;

import java.sql.Date;
import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author chaitralippd
 */
public class Driver {

    public static void main(String... args) {

   
   Tickets t1= new Tickets(Double.valueOf(333),Long.valueOf(333),"333",new GregorianCalendar(2, 5, 2012).getTime());
   Admin a1= new Admin(Long.valueOf(112),"123456");
   Admin a2= new Admin(Long.valueOf(112),"123456");
   Customer c1 = new Customer("Ludwig", "Beethoven","12345","beeth@gmail.com",Long.valueOf(345677));
   Customer c2 = new Customer("John", "Degeneres","123456","john@gmail.com",Long.valueOf(313457));
   Theatre th1= new Theatre("AMC","roosevelt");
   ShowTime s1= new ShowTime(Double.valueOf(3),Double.valueOf(6));
   Movie m1=new Movie("Deadpool",new GregorianCalendar(2, 5, 2016).getTime());
     

   c1.addTickets(t1);
   a1.addTickets(t1);
   th1.addTickets(t1);
 
   
     

   EntityManagerFactory emf = Persistence.createEntityManagerFactory("chaitralippdPU");
   EntityManager em = emf.createEntityManager();
   EntityTransaction tx = em.getTransaction();

       tx.begin();
       em.persist(s1);
       em.persist(m1);
       tx.commit();
       
       tx.begin();
       em.persist(c1);
       c1.setFirstName("Chaitrali");
       em.persist(c2);
       em.persist(a1);
       em.persist(a2);  
       em.persist(th1);
        

        em.persist(t1);
      
        tx.commit();
        
        
        
      Customer foundCustomer = em.find(Customer.class, 2l);
       System.out.println("I found: " + foundCustomer.toString());
        
        tx.begin();
       c1.setFirstName("Chaitrali");
        em.remove(a2);
        tx.commit();      
 
     
     
   //  System.out.println("Customer is:" + t1.getCustomer());
   // System.out.println("Scores for Composer: " + c1.getTickets());
   
   
   tx.begin();
   em.persist(c1);
   em.persist(c2);
   em.remove(c1);
   tx.commit();
   
        
        em.close();
        emf.close();

    }
}
