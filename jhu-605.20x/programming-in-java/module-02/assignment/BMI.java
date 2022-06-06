/*
*  BMI performs the required task, using certain assumptions, as described in BMI.md or the PDF in which this code block is contained.
*  author: Justin Law
*  class: EN.605.201.82.SU22
*/

//TODO: Resolve "resource leak"
//TODO: Find out how/possible/syntax to square root a float/double

import java.util.Scanner;

// Class which recieves height and weight, and outputs BMI calculation and results
public class BMI
{
   public static void main(String[] args)
   {
      // Define and initialize variables for values to be input
      float heightInches = 0; // height in inches
      float weightPounds = 0; // weight in pounds

      System.out.println();
      // Use a Scanner to input user-provided height in inches
      Scanner inputHeight = new Scanner(System.in);
      System.out.print("Enter height in inches (in): ");
      heightInches = inputHeight.nextFloat();
      // Use a Scanner to input user-provided weight in pounds
      Scanner inputWeight = new Scanner(System.in);
      System.out.print("Enter weight in pounds (lbs): ");
      weightPounds = inputWeight.nextFloat();

      // convert the input height and weight to meters and kilograms respectively
      double weightKilograms = weightPounds * 0.45359237;
      double heightMeters = heightInches * 0.0254;

      // perform BMI calculation
      // ensure program recieves a weight above 0 (can't divide by 0), else default to -1 to get "Undefined" BMI classification
      double resultBMI = weightKilograms > 0 ? heightMeters / (weightKilograms) : -1;

      // classify BMI
      String resultClassification;
      if (resultBMI > 0 & resultBMI < 18.5) {
         resultClassification = "Underweight";
      } else if (resultBMI > 18.5 & resultBMI < 24.9) {
         resultClassification = "Normal Weight";
      } else if (resultBMI > 24.9 & resultBMI < 29.9) {
         resultClassification = "Overweight";
      } else if (resultBMI > 30) {
         resultClassification = "Obese";
      } else {
         resultClassification = "Undefined";
      }

      // print out results of unit conversions, BMI calculations, and BMI results (index and classification)
      System.out.println("Weight (lbs): " + weightPounds + ", Height (in): " + heightInches);
      // printing of some results using Java float cast to reduce characters printed to console
      System.out.println("Weight (kg): " + (float) weightKilograms + ", Height (m): " + (float) heightMeters);
      System.out.println("BMI Calculation: " + (float) heightMeters + " / sqrt(" + (float) weightKilograms + ")");
      System.out.println("Resulting BMI: " + (float) resultBMI);
      System.out.println("Resulting BMI classification: " + resultClassification);
      System.out.println();
   } // end main()
} //  end class BMI