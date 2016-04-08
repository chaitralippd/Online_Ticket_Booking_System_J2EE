/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.chaitralippd.mp3;

import java.util.ArrayList;
import java.util.List;
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
public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private String Location;

    
    
    

      @OneToMany(mappedBy = "theatre")
    private List<Tickets> tickets = new ArrayList<>();

    public void addTickets(Tickets ctickets){
        if(! tickets.contains(ctickets)){
            tickets.add(ctickets);
        }
        ctickets.setTheatre(this);
    }    

    public List<Tickets> getTickets() {
        return tickets;
    }

    public void setTickets(List<Tickets> tickets) {
        this.tickets = tickets;
    }

    

    
    /**
     * Get the value of Location
     *
     * @return the value of Location
     */
    public String getLocation() {
        return Location;
    }

    /**
     * Set the value of Location
     *
     * @param Location new value of Location
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    public Theatre(String Name, String Location) {
        this.Name = Name;
        this.Location = Location;
    }

    
    

    /**
     * Get the value of Name
     *
     * @return the value of Name
     */
    public String getName() {
        return Name;
    }

    /**
     * Set the value of Name
     *
     * @param Name new value of Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }


    public Theatre() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

 /*   public List<Seats> getSeats() {
        return seats;
    }

    public void setSeats(List<Seats> seats) {
        this.seats = seats;
    }*/
    
    
}
