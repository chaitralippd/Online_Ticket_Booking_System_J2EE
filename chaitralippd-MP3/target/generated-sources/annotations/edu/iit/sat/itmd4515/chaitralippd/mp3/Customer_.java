package edu.iit.sat.itmd4515.chaitralippd.mp3;

import edu.iit.sat.itmd4515.chaitralippd.mp3.Seats;
import edu.iit.sat.itmd4515.chaitralippd.mp3.Tickets;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.2.v20151217-rNA", date="2016-03-28T13:17:39")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, Seats> seat;
    public static volatile SingularAttribute<Customer, String> firstName;
    public static volatile SingularAttribute<Customer, String> lastName;
    public static volatile SingularAttribute<Customer, String> password;
    public static volatile SingularAttribute<Customer, Long> phoneNumber;
    public static volatile ListAttribute<Customer, Tickets> tickets;
    public static volatile SingularAttribute<Customer, String> emailId;
    public static volatile SingularAttribute<Customer, Long> id;

}