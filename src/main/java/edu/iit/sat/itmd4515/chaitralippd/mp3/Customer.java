/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.chaitralippd.mp3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Chaitrali
 */
@Entity
public class Customer {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;
    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;
    @Column(nullable=false)
    private String password;
    private String emailId;
    @Column(name = "phone_number", length = 15)
    private Long phoneNumber;
 
    
     @OneToOne
       @JoinColumn(name="seat_no")
     private Seats seat;     
    
    
    @OneToMany(mappedBy = "customer")
    private List<Tickets> tickets = new ArrayList<>();

    public void addTickets(Tickets ctickets){
        if(! tickets.contains(ctickets)){
            tickets.add(ctickets);
        }
        ctickets.setCustomer(this);
    }

    
    
    
    public List<Tickets> getTickets() {
        return tickets;
    }

    public void setTickets(List<Tickets> tickets) {
        this.tickets = tickets;
    }
 
     
      public Customer() {
    }


    public Customer(String firstName, String lastName, String password, String emailId, Long phoneNumber) {
      
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }
    
     
    /**
     * Get the value of phoneNumber
     *
     * @return the value of phoneNumber
     */
    public Long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set the value of phoneNumber
     *
     * @param phoneNumber new value of phoneNumber
     */
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Get the value of emailId
     *
     * @return the value of emailId
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * Set the value of emailId
     *
     * @param emailId new value of emailId
     */
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


    /**
     * Get the value of password
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the value of password
     *
     * @param password new value of password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Get the value of lastName
     *
     * @return the value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the value of lastName
     *
     * @param lastName new value of lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    /**
     * Get the value of firstName
     *
     * @return the value of firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the value of firstName
     *
     * @param firstName new value of firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
      @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if (!Objects.equals(this.emailId, other.emailId)) {
            return false;
        }
        return true;
    }

    
 
    
      @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password + ", emailid=" + emailId + ", phoneNumber=" + phoneNumber + '}';
    }
    
}
