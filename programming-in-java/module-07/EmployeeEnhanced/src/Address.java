
/**
 * This Address class contains the set, input checking, and formatting of an
 * address
 *
 * @author Justin Law
 * @version 1.1
 * class: EN.605.201.82.SU22
 */

public class Address {

  private final String ALT_STATE = "XX";
  private final String ALT_STREET_CITY = "Unknown";
  private final int ALT_ZIP_CODE = 11111;

  private String street;
  private String city;
  private String state;
  private int zipCode;

  // instantiation
  Address(String street, String city, String state, int zipCode) {
    if (!setStreet(street)) {
      System.out.println("ERROR: Street should be formatted as a string of length greater than 0! Defaulting to alternative.");
    }
    if (!setCity(city)) {
      System.out.println("ERROR: City should be formatted as a string of length greater than 0! Defaulting to alternative.");
    }
    if (!setState(state)) {
      System.out.println("ERROR: State should be formatted as a string of length 2! Defaulting to alternative.");
    }
    if (!setZipCode(zipCode)) {
      System.out.println("ERROR: Zip Code should be formatted as an integer of 5-digits! Defaulting to alternative.");
    }
  } // end Address

  /**
   * The setStreet method checks the arguments for length and then sets the street
   *
   * @param street
   */
  public Boolean setStreet(String street) {
    // if no street is provided, go to the "alt" street
    if (street.length() > 0) {
      this.street = street;
      return true;
    } else {
      this.street = this.ALT_STREET_CITY;
      return false;
    }
  } // end setStreet

  /**
   * The setCity method checks the arguments for length and then sets the street
   *
   * @param city
   */
  public Boolean setCity(String city) {
    // if no city is provided, go to the "alt" city
    if (city.length() > 0) {
      this.city = city;
      return true;
    } else {
      this.city = this.ALT_STREET_CITY;
      return false;
    }
  } // end setCity

  /**
   * The setState method checks the arguments for length and then sets the street
   *
   * @param state
   */
  public Boolean setState(String state) {
    // if bad state is provided, go to the "alt" state
    if (state.length() == 2) {
      this.state = state;
      return true;
    } else {
      this.state = this.ALT_STATE;
      return false;
    }
  } // end setState

  /**
   * The setZipCode method checks the arguments for integer digits and then sets
   * the zipCode
   *
   * @param zipCode
   */
  public Boolean setZipCode(int zipCode) {
    // if bad zipCode is provided, go to the "alt" zipCode
    if (zipCode > 9999 && zipCode < 100000) {
      this.zipCode = zipCode;
      return true;
    } else {
      this.zipCode = this.ALT_ZIP_CODE;
      return false;
    }
  } // end setZipCode

  /**
   * The toString method returns the address string
   *
   * @return String
   */
  public String toString() {
    return "Address: " + this.street + ", " + this.city + ", " + this.state + ", " + this.zipCode;
  } // end toString

} // end Address class
