/*
*  BMI performs the required task, using certain assumptions, as described in BMI.md or the PDF in which this code block is contained.
*  author: Justin Law
*  class: EN.605.201.82.SU22
*/

import java.util.Scanner;

// Class which recieves height and weight, and outputs BMI calculation and results
public class BMI
{
   public static void main(String[] args)
   {
      // Define and initialize variables for values
      double heightInches = 0; // height in inches
      double weightPounds = 0; // weight in pounds
      double POUNDS_TO_KILOGRAMS = 0.45359237; // lbs to kg conversion rate constant
      double INCHES_TO_METERS = 0.0254; // in to m conversion rate constant

      System.out.println();
      // Use a Scanner to input user-provided height in inches
      Scanner inputHeight = new Scanner(System.in);
      System.out.print("Enter height in inches (in): ");
      heightInches = inputHeight.nextDouble();
      // Use a Scanner to input user-provided weight in pounds
      Scanner inputWeight = new Scanner(System.in);
      System.out.print("Enter weight in pounds (lbs): ");
      weightPounds = inputWeight.nextDouble();

      // close Scanner to prevent resource leaks
      inputHeight.close();
      inputWeight.close();

      // convert the input height and weight to meters and kilograms respectively
      double weightKilograms = weightPounds * POUNDS_TO_KILOGRAMS;
      double heightMeters = heightInches * INCHES_TO_METERS;

      // perform BMI calculation, using Math.pow instead of num * num
      // If dividing by 0, default to negative to get "Undefined" BMI classification to avoid errors
      double resultBMI = weightKilograms != 0 ? (weightKilograms / Math.pow(heightMeters, 2)) : -1;

      // classify BMI using IF-statements
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
      System.out.println("\nINPUT DATA:");
      System.out.println("Weight (lbs): " + weightPounds + ", Height (in): " + heightInches + "\n");
      System.out.println("RESULTS:");
      System.out.println("Weight (kg): " + weightKilograms + ", Height (m): " + heightMeters);
      System.out.println("BMI Calculation: " + weightKilograms + " / " + heightMeters + "^2");
      System.out.println("Resulting BMI: " + resultBMI);
      System.out.println("Resulting BMI classification: " + resultClassification);
      System.out.println();
   } // end main()
} //  end class BMI