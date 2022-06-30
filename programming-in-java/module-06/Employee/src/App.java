
/**
*  This App class combines the Employee, Name, Date, and Address classes to
*  generate an array of Employees with information as inputted by the user.
*
*  @author Justin Law
*  @version 1.0
*  class: EN.605.201.82.SU22
*/

import java.util.Scanner;

public class App {

   // initialize Employee array to store multiple Employees
   private static Employee[] employees;

   /**
    * The main method gets user input and prints out all resulting user input
    * formatted as an Employee object's toString() method
    *
    * @param args
    */
   public static void main(String[] args) {
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
      Boolean enterMoreEmployeeInfo = true;

      // using Scanner util, grab user's choice on continuing to add more Emploee info
      Scanner userChoice = new Scanner(System.in);
      // using the Scanner util, grab Employee info
      Scanner employeeName = new Scanner(System.in);
      Scanner employeeAddress = new Scanner(System.in);
      Scanner employeeDate = new Scanner(System.in);

      do { // keep asking user until user wants to stop entering Employee info
         enterMoreEmployeeInfo = getUserChoice(userChoice);

      } while (enterMoreEmployeeInfo);

      // close open Scanners
      employeeName.close();
      employeeAddress.close();
      employeeDate.close();
      userChoice.close();
   } // end getUserInput method

   /**
    * The getUserChoice method is a conditional recursive function that keeps
    * running until the user stops it. The method asks the user whether they want
    * to enter more employees into the system, asking again if a (1) "yes" or (2)
    * "no" are not received. The Boolean returned by this function acts as the
    * while-loop parameter for getUserInput.
    *
    * @param userChoice the instantiated scanner
    * @return Boolean
    */
   private static Boolean getUserChoice(Scanner userChoice) {
      System.out.print("\nEnter more employee information? (1) Yes or (2) No: ");
      int choice = userChoice.nextInt();
      if (choice == 2) {
         return false;
      } else if (choice == 1) {
         return false;
      } else {
         getUserChoice(userChoice);
      }
      return true;
   } // end getUserChoice method

   /**
    * The printEmployeesList method prints all employees, with a new line between
    * each, that the user has entered.
    *
    * @return void
    */
   private static void printEmployeesList() {
      // enhanced for-loop calling the toString() method from each Employee in the
      // array
      for (Employee employee : employees) {
         employee.toString();
      }
   } // end printEmployeeList method

} // end App class
