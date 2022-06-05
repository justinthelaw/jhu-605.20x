/*
*  MatrixSums performs the required task, using certain assumptions, as described in MatrixSums.md or the PDF in which this code block is contained.
*  author (ORIGINAL MODIFIED BY): Justin Law
*  class: EN.605.201.82.SU22
*/

package test;

import java.util.Scanner;

// Class which inputs and outputs some ints
public class MatrixSums
{
   public static void main(String[] args)
   {
      // Define and initialize variables for values to be input
      int v1 = 0; // First value to be input
      int v2 = 0; // Second value to be input
      int v3 = 0; // Third value to be input
      int v4 = 0; // Fourth value to be input
      int v5 = 0; // Fifth value to be input
      int v6 = 0; // Sixth value to be input

      // Use a Scanner to input integer values
      Scanner input = new Scanner(System.in);
      System.out.println("\n\n");
      System.out.print("Enter 6 integers separated by a blank space: ");
      v1 = input.nextInt(); // Input first value
      v2 = input.nextInt(); // Input second value
      v3 = input.nextInt(); // Input third value
      v4 = input.nextInt(); // Input fourth value
      v5 = input.nextInt(); // Input fifth value
      v6 = input.nextInt(); // Input sixth value

      // assignment addition of initialized integers for row sums:
      int rowTotal1 = v1 + v2;
      int rowTotal2 = v3 + v4;
      int rowTotal3 = v5 + v6;
      // assignment addition of initialized integers for column sums:
      int columnTotal1 = v1 + v3 + v5;
      int columnTotal2 = v2 + v4 + v6;
      int columnTotal3 = rowTotal1 + rowTotal2 + rowTotal3;

      // Output using System.out.println()
      System.out.println("\n\n");
      // assignment addition of new "Total" column with, row totals:
      System.out.println("\t" + "Value" + "\t" + "Value" + "\t" + "Total");
      System.out.println("\t" + v1 + "\t" + v2 + "\t" + rowTotal1);
      System.out.println("\t" + v3 + "\t" + v4 + "\t" + rowTotal2);
      System.out.println("\t" + v5 + "\t" + v6 + "\t" + rowTotal3);
      // assignment addition of 4 dashes:
      System.out.println("\t" + "----" + "\t" + "----" + "\t" + "----");
      // assignment addition of new "Total" row, with column totals:
      System.out.println("Total" + "\t" + columnTotal1 + "\t" + columnTotal2 + "\t" + columnTotal3);
      System.out.println("\n\n");
   } // end main()
} //  end class Original