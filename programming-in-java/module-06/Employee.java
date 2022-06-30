/*
*  Employee performs the required task, using certain assumptions, as described in Employee.md or the PDF in which this code block is contained.
*  author: Justin Law
*  class: EN.605.201.82.SU22
*/

import java.util.Scanner;

public class Employee {

   public static void main(String[] args) {
      // start by getting user input for Employee information
      getUserInput();

   } // end main method

   // getUserInput is a method that has the user enter an unlimited amount of
   // Employee information until the user wants to stop
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

   private static Boolean getUserChoice(Scanner userChoice) {
      System.out.print("\nEnter more employee information? (1) Yes or (2) No: ");
      int choice = userChoice.nextInt();
      if (choice == 2) {
         return false;
      } else if (choice != 1) {
         getUserChoice(userChoice);
      }
      return true;
   } // end getUserChoice method

} // end Employee class
