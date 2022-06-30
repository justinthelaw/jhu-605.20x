
/**
 * This Employee class contains the set and format of the parameters name,
 * date, and address.
 *
 * @author Justin Law
 * @version 1.0 class: EN.605.201.82.SU22
 */

public class Employee {

   public Name name;
   public Address address;
   public Date date;

   // instantiation
   Employee(String firstName, String lastName, String street, String city, String state, int zipCode, int month, int day, int year) {
      this.name = new Name(firstName, lastName);
      this.address = new Address(street, city, state, zipCode);
      this.date = new Date(month, day, year);
   } // end Employee

   public String toString() {
      return this.name.toString() + " | " + this.address.toString() + " | " + this.date.toString();
   }

} // end Employee class
