public class SalariedEmployee extends Employee {

  public final int ALT_EARNINGS = 40000;

  public int earnings;

  // instantiation of SalariedEmployee
  SalariedEmployee(String firstName, String lastName, String street, String city, String state, int zipCode, int month,
      int day, int year, String paymentSchedule, int earnings) {
    setName(firstName, lastName);
    setAddress(street, city, state, zipCode);
    setDate(month, day, year);
    setPaySchedule(paymentSchedule);
    if (!setEarnings(earnings)) {
      System.out.println("ERROR: Earnings must be greater than 0! Defaulting to alternative.");
    }
  }

  /**
   * The setEarnings method checks the arguments for range and then sets the
   * earnings, default Earnings is unique to Salaried Employee
   *
   * @param earnings
   */
  public Boolean setEarnings(int earnings) {
    // if bad year provided, go to "alt"
    if (earnings > 0) {
      this.earnings = earnings;
      return true;
    } else {
      this.earnings = this.ALT_EARNINGS;
      return false;
    }
  } // end setEarnings

  /**
   * The toString method returns the Salaried Employee string
   *
   * @return String
   */
  public String toString() {
    return this.name.toString() + " | " + this.address.toString() + " | " + this.date.toString()
        + " | Payment Schedule: " + this.paymentSchedule + " | Salary: " + this.earnings;
  } // end toString

}
