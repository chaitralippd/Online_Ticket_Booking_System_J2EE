/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.chaitralippd.mp3;

import java.util.Date;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author Chaitrali
 */
@Entity
public class Tickets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Double price;
    
    private Long screen;
    
    private String seatNo;
    @Temporal(TemporalType.DATE)
    private Date movieDate;

    
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "Customer_ticket")
    @JoinColumn(nullable = false, name = "customer_id")
    private Customer customer;
       
       
       
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "Admin_ticket")
    @JoinColumn(nullable = false, name = "admin_id")
    private Admin admin;
       
       
       
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "Theatre_ticket")
    @JoinColumn(nullable = false, name = "theatre_id")
    private Theatre theatre;

    
    
    
    
    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }
       
    
    public Long getScreen() {
        return screen;
    }

    public void setScreen(Long screen) {
        this.screen = screen;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

//onstructors
       
    public Tickets() {
    }

    public Tickets(Double price, Long screen, String seatNo, Date movieDate) {
        this.price = price;
        this.screen = screen;
        this.seatNo = seatNo;
        this.movieDate = movieDate;
    }

     
     
     
     
     
     
     
     
     
    /**
     * Get the value of movieDate
     *
     * @return the value of movieDate
     */
    public Date getMovieDate() {
        return movieDate;
    }

    /**
     * Set the value of movieDate
     *
     * @param movieDate new value of movieDate
     */
    public void setMovieDate(Date movieDate) {
        this.movieDate = movieDate;
    }


    /**
     * Get the value of seatNo
     *
     * @return the value of seatNo
     */
    public String getSeatNo() {
        return seatNo;
    }

    /**
     * Set the value of seatNo
     *
     * @param seatNo new value of seatNo
     */
    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    /**
     * Get the value of price
     *
     * @return the value of price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Set the value of price
     *
     * @param price new value of price
     */
    public void setPrice(Double price) {
        this.price = price;
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
        final Tickets other = (Tickets) obj;
        if (!Objects.equals(this.screen, other.screen)) {
            return false;
        }
        return true;        

    }

   

  

  
     
 
    
}
