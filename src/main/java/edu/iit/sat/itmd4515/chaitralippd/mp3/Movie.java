/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.chaitralippd.mp3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Chaitrali
 */
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private String movieName;
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    

    
     @ManyToMany(mappedBy="movie")
       private List<ShowTime> showtime= new ArrayList<>();
     
     
    

    public List<ShowTime> getShowtime() {
        return showtime;
    }

    public void setShowtime(List<ShowTime> showtime) {
        this.showtime = showtime;
    }
    
    
     
     
     
     
     

   
    /**
     * Get the value of releaseDate
     *
     * @return the value of releaseDate
     */
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * Set the value of releaseDate
     *
     * @param releaseDate new value of releaseDate
     */
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }


    /**
     * Get the value of movieName
     *
     * @return the value of movieName
     */
    public String getMovieName() {
        return movieName;
    }

    /**
     * Set the value of movieName
     *
     * @param movieName new value of movieName
     */
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }


    public Movie() {
         showtime = new ArrayList<ShowTime>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
      @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", movieName=" + movieName + ", releaseDate=" + releaseDate +'}';
    }

    public Movie(String movieName, Date releaseDate) {
        this.movieName = movieName;
        this.releaseDate = releaseDate;
    }

}
