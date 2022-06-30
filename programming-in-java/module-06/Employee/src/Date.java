
/**
 * This Date class contains the get/set, input checking, and formatting of a
 * date
 *
 * @author Justin Law
 * @version 1.0 class: EN.605.201.82.SU22
 */

public class Date {

  private int month;
  private final int ALT_MONTH = 1;
  private int day;
  private final int ALT_DAY = 1;
  private int year;
  private final int ALT_YEAR = 1900;

  // instantiation
  Date(int month, int day, int year) {
    if (!setMonth(month)) {
      System.out.println("ERROR: Month should be formatted as an integer of 1-12! Defaulting to alternative.");
    };
    if (!setDay(day)) {
      System.out.println("ERROR: Day should be formatted as an integer of 1-31! Defaulting to alternative.");
    }
    if (!setYear(year)) {
      System.out.println("ERROR: Year should be formatted as an integer of 1900-2022! Defaulting to alternative.");
    }
  } // end Date

  /**
   * The setMonth method checks the arguments for range and then sets the month
   *
   * @param month
   */
  public Boolean setMonth(int month) {
    // if bad month provided, go to "alt"
    if ((month > 0) && (month < 13)) {
      this.month = month;
      return true;
    } else {
      this.month = this.ALT_MONTH;
      return false;
    }
  } // end setMonth

  /**
   * The setDay method checks the arguments for range and then sets the day
   *
   * @param day
   */
  public Boolean setDay(int day) {
    // if bad day provided, go to "alt"
    if ((day > 0) && (day < 32)) {
      this.day = day;
      return true;
    } else {
      this.day = this.ALT_DAY;
      return false;
    }
  } // end setDay

  /**
   * The setYear method checks the arguments for range and then sets the year
   *
   * @param year
   */
  public Boolean setYear(int year) {
    // if bad year provided, go to "alt"
    if ((year > 1899) && (year < 2023)) {
      this.year = year;
      return true;
    } else {
      this.year = this.ALT_YEAR;
      return false;
    }
  } // end setYear

  /**
   * The toString method returns the Date string
   *
   * @return String
   */
  public String toString() {
    return "Hire Date: " + this.month + "/" + this.day + "/" + this.year;
  } // end toString

} // end Date class
