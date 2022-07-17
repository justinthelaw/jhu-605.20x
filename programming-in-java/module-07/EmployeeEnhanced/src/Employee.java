
/**
 * This Employee class contains the set and format of the parameters name, date,
 * and address. It also contains abstract methods common to the sub-classes
 * SalariedEmployee and HourlyEmployee
 *
 * @author Justin Law
 * @version 1.1 class: EN.605.201.82.SU22
 */

public abstract class Employee {

   public Name name;
   public Address address;
   public Date date;
   public String paymentSchedule;


   /**
    * The setName method instantiates and sets a new name
    *
    * @param firstName
    * @param lastName
    */
   public void setName(String firstName, String lastName) {
      this.name = new Name(firstName, lastName);
   }


   /**
    * The setAddress method instantiates and sets a new address
    *
    * @param street
    * @param city
    * @param state
    * @param zipCode
    */
   public void setAddress(String street, String city, String state, int zipCode) {
      this.address = new Address(street, city, state, zipCode);
   }


   /**
    * The setDate method instantiates and sets a new date
    *
    * @param month
    * @param day
    * @param year
    */
   public void setDate(int month, int day, int year) {
      this.date = new Date(month, day, year);
   }


   /**
    * The setPaymentSchedule method sets the payment schedule
    *
    * @param paymentSchedule
    */
   // all employees have a set payment schedule
   public void setPaySchedule(String paymentSchedule) {
      this.paymentSchedule = paymentSchedule;
   } // end setPaySchedule

   // abstract method for getting employee compensation
   public abstract Boolean setEarnings(int earnings);

} // end Employee class
