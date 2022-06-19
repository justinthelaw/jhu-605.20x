public class Arrays1D {
  public static void main(String[] args) {
    String[] months = new String[12];
    int[] monthDays = new int[12];

    months[0] = "Jan";
    months[1] = "Feb";
    months[2] = "Mar";
    months[3] = "Apr";
    months[4] = "May";
    months[5] = "Jun";
    months[6] = "Jul";
    months[7] = "Aug";
    months[8] = "Sep";
    months[9] = "Oct";
    months[10] = "Nov";
    months[11] = "Dec";

    monthDays[0] = 31;
    monthDays[1] = 28;
    monthDays[2] = 31;
    monthDays[3] = 30;
    monthDays[4] = 31;
    monthDays[5] = 30;
    monthDays[6] = 31;
    monthDays[7] = 31;
    monthDays[8] = 30;
    monthDays[9] = 31;
    monthDays[10] = 30;
    monthDays[11] = 31;

    for (int i = 0; i < months.length; i++) {
      System.out.println(months[i] + " has " + monthDays[i] + " days.");
    }

    System.out.println("Same thing but with a different array initialization method");

    String[] monthsImproved = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    for (int i = 0; i < monthsImproved.length; i++) {
      System.out.println(monthsImproved[i] + " has " + monthDays[i] + " days.");
    }

  }
}
