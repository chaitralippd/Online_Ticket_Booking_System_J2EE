/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.chaitralippd.mp3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author Chaitrali
 */
 @Entity
public class ShowTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double startTime; 
    private Double endTime;

    
      @ManyToMany 
    @JoinTable(name="Movie_time", 
          joinColumns=@JoinColumn(name="startTime"),
          inverseJoinColumns=@JoinColumn(name="movieName"))
    private List<Movie> movie;
      
      
       public void addMovie(Movie movieT){
        if(! movie.contains(movieT)){
            movie.add(movieT);
        }
       
    }
     /**
      * Get the value of endTime
      *
      * @return the value of endTime
      */
     public Double getEndTime() {
         return endTime;
     }

     /**
      * Set the value of endTime
      *
      * @param endTime new value of endTime
      */
     public void setEndTime(Double endTime) {
         this.endTime = endTime;
     }


     /**
      * Get the value of startTime
      *
      * @return the value of startTime
      */
     public Double getStartTime() {
         return startTime;
     }

     /**
      * Set the value of startTime
      *
      * @param startTime new value of startTime
      */
     public void setStartTime(Double startTime) {
         this.startTime = startTime;
     }

    public List<Movie> getMovie() {
        return movie;
    }

    public void setMovie(List<Movie> movie) {
        this.movie = movie;
    }

  
     
     


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShowTime() {
         movie = new ArrayList<Movie>();
    }

    public ShowTime(Double startTime, Double endTime) {
      //  this.movieName = movieName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

   
    
    
}
