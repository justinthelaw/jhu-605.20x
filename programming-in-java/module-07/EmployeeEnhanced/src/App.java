
/**
*  This App class combines the Employee, SalariedEmployee, HourlyEmployee, Name, Date, and
*  Address classes to generate an array of Employees with information as inputted by the user.
*
*  @author Justin Law
*  @version 1.0
*  class: EN.605.201.82.SU22
*/

import java.util.Scanner;

public class App {

   // maximum number of entries is 100
   private static final int MAX = 100;
   // counts employee being entered into array
   private static int counter = 0;
   // initialize Employee array to store up to 100 Employees
   private static Employee[] employees = new Employee[MAX];

   /**
    * The main method gets user input and prints out all resulting user input
    * formatted as an Employee object's toString() method
    *
    * @param args
    */
   public static void main(String[] args) {
      // welcome message to user
      System.out.println(
            "\nWelcome! Please enter up to 100 entries worth of employee information using the following rules:\n"
                  + "- Hired Date allows:\n" + "\t- Month is 1-12 (no leading 0)\n" + "\t- Day is 1-31 (no leading 0)\n"
                  + "\t- Year is 1900-2022\n" + "- Employee Address allows:\n" + "\t- Street is a String\n"
                  + "\t- City is a String\n" + "\t- State is 2 char String\n"
                  + "\t- Zip code is 5-digit int (no leading 0)\n" + "- Employee name allows:\n"
                  + "\t- First name is at least 1-char String\n" + "\t- Last name is at least 1-char String\n");

      // start by getting user input for Employee information
      getUserInput();

      // print out the resulting list of employees after user finishes
      printEmployeesList();
   } // end main method

   /**
    * The getUserInput method has the user enter an unlimited amount of Employee
    * information until the user wants to stop. The while-loop is dependent on the
    * getUserChoice method, where the user can choose to continue to enter employee
    * information or not after each iteration.
    *
    * @return void
    */
   private static void getUserInput() {
      // user-input boolean for controlling do-while loop
      Boolean enterMoreEmployeeInfo = true;

      // using the Scanner util, grab Employee info
      Scanner userInput = new Scanner(System.in);

      do { // keep asking user until user wants to stop entering Employee info
           // organize and store employee info being input by user
         getEmployeeInfo(userInput);
         // increase count of emplyees enteres
         counter++;
         if (counter > MAX) {
            System.out.println("You have entered the maximum amount of entries: " + MAX);
            enterMoreEmployeeInfo = false;
         } else {
            enterMoreEmployeeInfo = getUserChoice(userInput);
            // ensure next run for employee info starts on new line
            userInput.nextLine();
         }
      } while (enterMoreEmployeeInfo);

      // close open Scanners
      userInput.close();
   } // end getUserInput method

   /**
    * The getEmployeeInfo asks a series of questions to the user for employee
    * information input. The method uses the existing classes and Employee array to
    * ensure proper formatting.
    *
    * @param userInput the instantiated scanner
    * @param counter   the employee entry number
    * @return Boolean
    */
   private static void getEmployeeInfo(Scanner userInput) {
      // starting string for each question
      String startString = "Enter employee #" + counter + "'s ";
      // instantiate temporary stores for each parameter
      String firstName;
      String lastName;
      String street;
      String city;
      String state;
      int zipCode;
      int month;
      int day;
      int year;

      // sequentially ask for each parameter
      System.out.print(startString + "first name: ");
      firstName = userInput.nextLine();
      System.out.print(startString + "last name: ");
      lastName = userInput.nextLine();
      System.out.print(startString + "street: ");
      street = userInput.nextLine();
      System.out.print(startString + "city: ");
      city = userInput.nextLine();
      System.out.print(startString + "state: ");
      state = userInput.nextLine();
      System.out.print(startString + "zip code: ");
      zipCode = userInput.nextInt();
      System.out.print(startString + "hire month: ");
      month = userInput.nextInt();
      System.out.print(startString + "hire day: ");
      day = userInput.nextInt();
      System.out.print(startString + "hire year: ");
      year = userInput.nextInt();

      // instantiate an Employee with input paramaters
      employees[counter] = new Employee(firstName, lastName, street, city, state, zipCode, month, day, year);
   } // end getEmployeeInfo method

   /**
    * The getUserChoice method is a conditional recursive function that keeps
    * running until the user stops it. The method asks the user whether they want
    * to enter more employees into the system, asking again if a (1) "yes" or (2)
    * "no" are not received. The Boolean returned by this function acts as the
    * while-loop parameter for getUserInput.
    *
    * @param userInput the instantiated scanner
    * @return Boolean
    */
   private static Boolean getUserChoice(Scanner userInput) {
      // decision variables
      int YES = 1;
      int NO = 2;

      // keep asking for the user's choice until user picks yes or no
      System.out.print("\nEnter more employee information? (1) Yes or (2) No: ");
      int choice = userInput.nextInt();
      if (choice == NO) {
         return false;
      } else if (choice == YES) {
         return true;
      } else {
         getUserChoice(userInput);
         return true;
      }
   } // end getUserChoice method

   /**
    * The printEmployeesList method prints all employees, with a new line between
    * each, that the user has entered.
    *
    * @return void
    */
   private static void printEmployeesList() {
      // initial new line print
      System.out.println("\nYour list of employees:");
      // enhanced for-loop calling each employee's parameters
      for (int i = 0; i < counter; i++) {
         System.out.println("Employee #" + (i + 1) + ": " + employees[i].toString());
      }
   } // end printEmployeeList method

} // end App class
