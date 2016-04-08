package edu.iit.sat.itmd4515.chaitralippd.mp3;

import edu.iit.sat.itmd4515.chaitralippd.mp3.Movie;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.2.v20151217-rNA", date="2016-03-28T13:17:39")
@StaticMetamodel(ShowTime.class)
public class ShowTime_ { 

    public static volatile ListAttribute<ShowTime, Movie> movie;
    public static volatile SingularAttribute<ShowTime, Double> startTime;
    public static volatile SingularAttribute<ShowTime, Long> id;
    public static volatile SingularAttribute<ShowTime, Double> endTime;

}