package edu.iit.sat.itmd4515.chaitralippd.mp3;

import edu.iit.sat.itmd4515.chaitralippd.mp3.ShowTime;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.2.v20151217-rNA", date="2016-03-28T13:17:39")
@StaticMetamodel(Movie.class)
public class Movie_ { 

    public static volatile SingularAttribute<Movie, Date> releaseDate;
    public static volatile ListAttribute<Movie, ShowTime> showtime;
    public static volatile SingularAttribute<Movie, Long> id;
    public static volatile SingularAttribute<Movie, String> movieName;

}