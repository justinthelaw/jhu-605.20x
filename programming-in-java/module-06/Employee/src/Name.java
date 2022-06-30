
/**
 * This Name class contains the set, input checking, and formatting of a
 * name with First and Last
 *
 * @author Justin Law
 * @version 1.0 class: EN.605.201.82.SU22
 */

public class Name {

  private String firstName;
  private final String ALT_FIRST_NAME = "First";
  private String lastName;
  private final String ALT_LAST_NAME = "Last";

  // instantiation
  Name(String firstName, String lastName) {
    if (!setFirstName(firstName)) {
      System.out.println("ERROR: First Name should be formatted as a string of length greater than 0! Defaulting to alternative.");
    }
    if (!setLastName(lastName)) {
      System.out.println("ERROR: Last Name should be formatted as a string of length greater than 0! Defaulting to alternative.");
    }
  } // end Name

  /**
   * The setFirstName method checks the arguments for length and then sets the
   * first name
   *
   * @param firstName
   */
  public Boolean setFirstName(String firstName) {
    // if no name is provided, go to the default
    if (firstName.length() > 0) {
      this.firstName = firstName;
      return true;
    } else {
      this.firstName = this.ALT_FIRST_NAME;
      return false;
    }
  } // end setFirstName

  /**
   * The setLastName method checks the arguments for length and then sets the last
   * name
   *
   * @param lastName
   */
  public Boolean setLastName(String lastName) {
    // if no name is provided, go to the default
    if (lastName.length() > 0) {
      this.lastName = lastName;
      return true;
    } else {
      this.lastName = this.ALT_LAST_NAME;
      return false;
    }
  } // end setLastName

  /**
   * The toString method returns the name string
   *
   * @return String
   */
  public String toString() {
    return "Name: " + this.firstName + " " + this.lastName;
  } // end toString

} // end Name class