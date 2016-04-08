/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.iit.sat.itmd4515.chaitralippd.mp3;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Chaitrali
 */
@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(nullable=false)
    private String password;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

   
  
      @OneToMany(mappedBy = "admin")
    private List<Tickets> tickets = new ArrayList<>();

    public void addTickets(Tickets ctickets){
        if(! tickets.contains(ctickets)){
            tickets.add(ctickets);
        }
        ctickets.setAdmin(this);
    }
    
    
    
    

    public List<Tickets> getTickets() {
        return tickets;
    }

    public void setTickets(List<Tickets> tickets) {
        this.tickets = tickets;
    }
    
    
    //constructors
     public Admin() {
    }
    public Admin(Long userId, String password) {
        this.userId = userId;
        this.password = password;
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


   

    public Long getId() {
        return userId;
    }

    public void setId(Long id) {
        this.userId = id;
    }
    
    
 
    
      @Override
    public String toString() {
        return "Admin{" + "userid=" + userId + ", password=" + password +  '}';
    }
}
   

