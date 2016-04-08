/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.chaitralippd.mp3;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
/**
 *
 * @author Chaitrali
 */
@Entity
public class Seats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long noOfSeats; 
    private String seatName;

    
 /*  @ManyToOne(cascade = CascadeType.ALL)
    //@JoinTable(name = "COMPOSER_SCORE")
    @JoinColumn(nullable = false, name = "theatre_id")
    private Theatre theatre;*/
    /**
     * Get the value of seatName
     *
     * @return the value of seatName
     */
    public String getSeatName() {
        return seatName;
    }

    /**
     * Set the value of seatName
     *
     * @param seatName new value of seatName
     */
    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }


    /**
     * Get the value of noOfSeats
     *
     * @return the value of noOfSeats
     */
    public Long getNoOfSeats() {
        return noOfSeats;
    }

    /**
     * Set the value of noOfSeats
     *
     * @param noOfSeats new value of noOfSeats
     */
    public void setNoOfSeats(Long noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

/*    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }*/

    

    public Seats() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Seats(Long noOfSeats, String seatName) {
        this.noOfSeats = noOfSeats;
        this.seatName = seatName;
    }
    
    
    
    
      @Override
    public String toString() {
        return "Seats{" + "id=" + id + ", number of seats=" + noOfSeats + ", seatName=" + seatName +'}';
    }
    
}
