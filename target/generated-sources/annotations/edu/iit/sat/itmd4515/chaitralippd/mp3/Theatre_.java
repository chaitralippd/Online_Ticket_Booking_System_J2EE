package edu.iit.sat.itmd4515.chaitralippd.mp3;

import edu.iit.sat.itmd4515.chaitralippd.mp3.Tickets;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.2.v20151217-rNA", date="2016-03-28T13:17:39")
@StaticMetamodel(Theatre.class)
public class Theatre_ { 

    public static volatile ListAttribute<Theatre, Tickets> tickets;
    public static volatile SingularAttribute<Theatre, Long> id;
    public static volatile SingularAttribute<Theatre, String> Name;
    public static volatile SingularAttribute<Theatre, String> Location;

}