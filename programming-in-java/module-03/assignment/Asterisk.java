/*
*  Asterisk performs the required task, using certain assumptions, as described in Asterisk.md or the PDF in which this code block is contained.
*  author: Justin Law
*  class: EN.605.201.82.SU22
*/

import java.util.Scanner;

// Class which recieves number of asterisks and print pattern, and prints pattern to console
public class Asterisk
{
   public static void main(String[] args)
   {
      // max number of asterisks in for-loop prints
      int numberOfAsterisks = 1;
      // option for print order
      int option = 1;

      System.out.println(); // add space before print

      // Use a Scanner to get user-provided number
      Scanner inputNumber = new Scanner(System.in);
      System.out.print("Number of asterisks: ");
      numberOfAsterisks = inputNumber.nextInt();

      // Use a Scanner to get user-provided number
      Scanner inputOption = new Scanner(System.in);
      System.out.print("Printing pattern (1 or 2): ");
      option = inputOption.nextInt();

      // close Scanner to prevent resource leaks
      inputNumber.close();
      inputOption.close();

      // lock-in printing options regardless of incorrect input
      if (option == 2) // option 2
      {
         for (int i = numberOfAsterisks; i > 0; i--) // descending
         {
            System.out.println(); // next line for each row
            for (int j = i; j > 0; j--)
            { // print as many asterisks as the current count
               System.out.print("*");
            }
         }
      }
      else // option 1
      {
         for (int i = 1; i <= numberOfAsterisks; i++) // ascending
         {
            System.out.println(); // next line for each row
            for (int j = i; j > 0; j--)
            { // print as many asterisks as the current count
               System.out.print("*");
            }
         }
      }

      System.out.println("\n"); // add space after prints

   } // end main()
} //  end class Asterisk