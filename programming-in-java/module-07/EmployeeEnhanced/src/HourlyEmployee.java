public class HourlyEmployee extends Employee {

  public final int ALT_EARNINGS = 25;
  public final int ALT_HOURS_WORKED = 40;
  public final float OVERTIME_RATE = 1.5f;

  public int earnings;
  public int hoursWorked;
  public float compensation;

  // instantiation of Hourly Employee
  HourlyEmployee(String firstName, String lastName, String street, String city, String state, int zipCode, int month,
      int day, int year, String paymentSchedule, int earnings, int hoursWorked) {
    setName(firstName, lastName);
    setAddress(street, city, state, zipCode);
    setDate(month, day, year);
    setPaySchedule(paymentSchedule);
    if (!setEarnings(earnings)) {
      System.out.println("ERROR: Earnings must be greater than 0! Defaulting to alternative.");
    }
    setHoursWorked(hoursWorked);
    setCompensation(earnings, hoursWorked);
  }

  /**
   * The setEarnings method checks the arguments for range and then sets the
   * earnings, default Earnings is unique to Hourly Employee
   *
   * @param earnings
   */
  public Boolean setEarnings(int earnings) {
    // if bad earnings provided, go to "alt"
    if (earnings > 0) {
      this.earnings = earnings;
      return true;
    } else {
      this.earnings = this.ALT_EARNINGS;
      return false;
    }
  } // end setEarnings

  /**
   * The setHours method checks the arguments for range and then sets the
   * hours worked
   *
   * @param hoursWorked
   */
  public Boolean setHoursWorked(int hoursWorked) {
    // if bad hours worked provided, go to "alt"
    if (hoursWorked > 0) {
      this.hoursWorked = hoursWorked;
      return true;
    } else {
      this.hoursWorked = this.ALT_HOURS_WORKED;
      return false;
    }
  } // end setHoursWorked

  /**
   * The setCompensation method checks the arguments for range and then sets the
   * compensation by multiplying the hours worked with earnings, and then overtime
   *
   * @param earnings
   * @param hoursWorked
   */
  public void setCompensation(int earnings, int hoursWorked) {
    // hours worked over 40 go at overtime rate
    int regularHours = hoursWorked >= 40 ? 40 : hoursWorked;
    int overtimeHours = hoursWorked >= 40 ? hoursWorked - 40 : 0;
    float compensation = (float) (earnings * regularHours) + ((float) earnings * OVERTIME_RATE * (float) overtimeHours);
    this.compensation = compensation;
  } // end setEarnings

  /**
   * The toString method returns the Salaried Employee string
   *
   * @return String
   */
  public String toString() {
    return this.name.toString() + " | " + this.address.toString() + " | " + this.date.toString()
        + " | Payment Schedule: " + this.paymentSchedule + " | Hourly Rate: " + this.earnings + " | Weekly Hours Worked: "
        + this.hoursWorked + " | Weekly Compensation: " + this.compensation;
  } // end toString

}
