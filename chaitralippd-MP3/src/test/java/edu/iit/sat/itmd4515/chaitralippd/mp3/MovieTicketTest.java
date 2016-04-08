package edu.iit.sat.itmd4515.chaitralippd.mp3;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * 
 */
public class MovieTicketTest{

    protected static EntityManagerFactory emf;
    protected EntityManager em;
    protected EntityTransaction tx;

    @BeforeClass
    public static void beforeEachClass() {
        emf = Persistence.createEntityManagerFactory("chaitralippdPU");
    }

    @Before
    public void beforeEachTestMethod() {
        em = emf.createEntityManager();
        em.getTransaction();
        tx.begin();
    }
    
   
/*

   @Test
     public void readTest() {
    Admin admin=em.find(Admin.class,2l);
    assertEquals("112",admin.getUserId());

    }*/

    
 /*   @Test
    public void updateTset()
    {
    Customer cust=em.find(Customer.class,1l);
    cust.setFirstName("Mary");
   tx.commit();
   System.out.println("Updated Name:"+ cust.getFirstName());

    }
    
    */
    

 
      @After
    public void afterEachTestMethod() {
        em.close();
    }

 @AfterClass
    public static void afterEachClass() {
        emf.close();
    }
 

   
  
  
}
