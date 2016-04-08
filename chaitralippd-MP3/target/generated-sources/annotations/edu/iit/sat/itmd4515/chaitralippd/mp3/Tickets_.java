package edu.iit.sat.itmd4515.chaitralippd.mp3;

import edu.iit.sat.itmd4515.chaitralippd.mp3.Admin;
import edu.iit.sat.itmd4515.chaitralippd.mp3.Customer;
import edu.iit.sat.itmd4515.chaitralippd.mp3.Theatre;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.2.v20151217-rNA", date="2016-03-28T13:17:39")
@StaticMetamodel(Tickets.class)
public class Tickets_ { 

    public static volatile SingularAttribute<Tickets, Theatre> theatre;
    public static volatile SingularAttribute<Tickets, Double> price;
    public static volatile SingularAttribute<Tickets, Long> screen;
    public static volatile SingularAttribute<Tickets, Admin> admin;
    public static volatile SingularAttribute<Tickets, Long> id;
    public static volatile SingularAttribute<Tickets, String> seatNo;
    public static volatile SingularAttribute<Tickets, Date> movieDate;
    public static volatile SingularAttribute<Tickets, Customer> customer;

}