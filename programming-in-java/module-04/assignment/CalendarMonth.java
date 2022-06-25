/*
*  CalendarMonth performs the required task, using certain assumptions, as described in CalendarMonth.md or the PDF in which this code block is contained.
*  author: Justin Law
*  class: EN.605.201.82.SU22
*/

import java.util.Scanner;

public class CalendarMonth {

   // initialize constants for months and days
   private static final String[] MONTHS = { "January", "February", "March", "April",
                                          "May", "June", "July", "August","September",
                                          "October", "November", "December" };
   private static final int[] DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31,
                                     29}; // 29 days is the leap year Feb days
   private static final String[] DAY_OF_WEEK = {"Sun", "Mon", "Tue", "Wed",
                                               "Thu", "Fri", "Sat"};

   // initialize month and year variables, user input to be assigned
   private static int month = 0; // should be 1-12
   private static int year = 0; // should be greater than 1

   public static void main(String[] args) {
      // start by getting user input of year and month
      getUserInput();
      // add new line before calendar
      System.out.println();
      // print month header first
      printMonthHeader(month, year);
      // print month body below header
      printMonthBody(month, year);

   } // end main method

   // getUserInput is a method that gets the user's year and month inputs
   private static void getUserInput() {
      // using the Scanner util, grab user input for month and year
      Scanner yearInput = new Scanner(System.in);
      // ensure the year is above 1, else repeat asking
      while (year < 1) {
         System.out.print("Enter a year number, above 1: ");
         year = yearInput.nextInt();
      }

      Scanner monthInput = new Scanner(System.in);
      // ensure month is 0-11 (index), else repeat asking
      while ((month < 1) || (month > 12)) {
         System.out.print("Enter a month number, 1-12: ");
         month = monthInput.nextInt();
      }
      // close Scanner utils for resource leaks
      yearInput.close();
      monthInput.close();
   } // end getUserInput method

   // returns a month name based on month number
   private static String getMonthName(int month) {
      // subtract 1 for 0-based index of MONTHS array
      return MONTHS[month - 1];
   } // end getMonthName method

   // Displays the header information (month, year, line separator,
   // 3-character day names) for a calendar.
   private static void printMonthHeader(int month, int year) {
      // amount of space the calendar takes when printed to console
      int calendarWidth = 29;
      // get month name from array
      String currentMonth = getMonthName(month);
      // transform year to string for character length
      String yearString =  Integer.toString(year);
      // spaces for centering Month and Year header
      int centeringSpaces = (calendarWidth - (currentMonth.length() + yearString.length())) / 2;
      for (int i = 0; i < centeringSpaces; i++) {
         System.out.print(" ");
      }
      System.out.print(currentMonth + " " + year + "\n");
      // line separator, 30 characters long
      for (int i = 0; i < calendarWidth; i ++) {
         System.out.print("-");
      }
      // loop over array and print names of the days
      for (int i = 0; i < DAY_OF_WEEK.length; i++) {
         // add new line and a space for first 3-char day name
         if (i == 0) {
            System.out.println();
            System.out.print(" ");
         }
         System.out.print(DAY_OF_WEEK[i] + " ");
         // add new line after last day if startDay isn't Sunday (7)
         if ((i == (DAY_OF_WEEK.length - 1)) && (getStartDay(month, year) != 7)) {
            System.out.println();
         }
      }
   } // end printMonthHeader method

   // returns a days in month based on month and year
   private static int getNumDaysInMonth(int month, int year) {
      // subtract 1 for 0-based index of DAYS array
      int days = DAYS[month - 1];
      if (isLeapYear(year)) {
         if (getMonthName(month) == "February") {
            // 12th index is 29 days for leap year
            days = DAYS[12];
         }
      }
      return days;
   } // end getNumDaysInMonth method

   /**
    * isLeapYear uses the following mathematical checks to determine if a year is a
    * leap year • A year that is not divisible by 4. - NOT LEAP YEAR • A year that
    * is divisible by 4 but not divisible by 100 or 400. - LEAP YEAR • A year that
    * is divisible by 4 and 100 but not 400. - NOT LEAP YEAR • A year that is
    * divisible by 4 and 100 and 400. - LEAP YEAR • A year prior to 1582 that is a
    * leap year. - NOT A LEAP YEAR • A year prior to 1582 that is not a leap year.
    * - NOT A LEAP YEAR
    *
    * Pre-Conditions: The year value, y, is the full year (e.g., 2012)
    *
    * Post-Conditions: A boolean value inidcating whether the year is a leap year
    *
    * Reference:
    * https://codereview.stackexchange.com/questions/65221/function-for-checking-leap-years
    *
    * @param year
    * @return boolean
    *
    *
    * @author: Pip, rolfl, modified by Justin Law
    */
   private static boolean isLeapYear(int year) {

      if (year <= 1582) {
         return false;
      }

      if (year % 4 != 0) {
         return false;
      }

      if (year % 400 == 0) {
         return true;
      }

      if (year % 100 == 0) {
         return false;
      }

      return true;

   }

   /**
    * The method getStartDay() implements Zeller's Algorithm for determining the
    * day of the week the first day of a month is. The method adjusts Zeller's
    * numbering scheme for day of week ( 0=Saturday, ..., 6=Friday ) to conform to
    * day of week number that corresponds to ISO conventions (i.e., 1=Monday, ...,
    * 7=Sunday)
    *
    * Pre-Conditions: The month value, m, is 1-12 The day value, d, is 1-31, or
    * 1-28, 1-29 for February The year value, y, is the full year (e.g., 2012)
    *
    * Post-Conditions: A value of 1-7 is returned, representing the first day of
    * the month 1 = Monday, ..., 7 = Sunday
    *
    * Reference:
    * https://codereview.stackexchange.com/questions/67722/its-friday-zellers-congruence-revisited
    *
    * @param month
    * @param year
    * @return dayNum (1 = Mon, ... , 7 = Sun )
    *
    * @author: rolfl, modified by Josh Lafond
    */

   public static int getStartDay(int month, int year) {
      // Adjust month number & year to fit Zeller's numbering system
      if (month < 3) {
         month += 12;
         year -= 1;
      }

      int centuryYear = year % 100; // Calculate year within century
      int centuryTerm = year / 100; // Calculate century term
      int firstDayInMonth = 0; // Day number of first day in month 'm'

      firstDayInMonth = (1 + // to shift index 0 to the 1-7 return range
            (13 * (month + 1) / 5) + centuryYear + (centuryYear / 4) + (centuryTerm / 4) + (5 * centuryTerm)) % 7;

      // Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
      int dayNum = ((firstDayInMonth + 5) % 7) + 1;

      return dayNum;
   } // end getStartDay method

   // takes in month and year and determines how many days to print to body
   private static void printMonthBody(int month, int year) {
      // get start day
      int startDay = getStartDay(month, year);
      int currentDay = 0; // track day number slots
      for (int i = 1; i <= getNumDaysInMonth(month, year); i++) {
         // if it is the first day AND the start day isn't already Sunday
         // check to see how many spaces must be printed before first day number
         if ((i == 1) && (startDay != 7)) {
            // add spaces until reach first week day of month
            for (int j = 0; j < startDay; j++) {
               System.out.print("    ");
               currentDay++;
            }
            // print a new line every 7 day slots
            // modulo 7 looks for total day slots with no remainder
         }
         // print a new line every 7 day slots
         // modulo 7 looks for total day slots with no remainder
         if ((currentDay % 7) == 0) {
            System.out.println();
         }
         // print spaces between each day number
         if (i < 10) {
            // add extra space character for single-digit days
            System.out.print("   ");
         } else {
            System.out.print("  ");
         }
         // print day number
         System.out.print(i);
         currentDay++;
      }
      // print new lines to complete calendar
      System.out.println("\n");
   }

} // end CalendarMonth class
