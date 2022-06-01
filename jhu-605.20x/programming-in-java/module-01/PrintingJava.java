/*
*  PrintingJava performs the required task, using certain assumptions, as described in PrintingJava.md or the PDF in which this code block is contained.
*  author: Justin Law
*  class: EN.605.201.82.SU22
*/

public class PrintingJava {
   public static void main(String[] args) {
      // create new instance of the class PrintingJava
      PrintingJava printJava = new PrintingJava();
      // execute method, runPrintJob, from the instance of PrintingJava class
      printJava.runPrintJob();
   } // end main

   public void runPrintJob() {
      // all characters are printed in line order, then character order on each line
      // each character has an added whitespace for the next letter of "JAVA"
      // additional code spacing was added after each equal sign to allow for readability of the desired output for each letter

      // all required "J" characters
      String firstLine =  "     J" + " ";
      String secondLine = "     J" + " ";
      String thirdLine =  "J    J" + " ";
      String fourthLine = " J  J " + " ";

      // all required "A" characters
      firstLine +=  "   A   " + " ";
      secondLine += "  A A  " + " ";
      thirdLine +=  " AAAAA " + " ";
      fourthLine += "A     A" + " ";

      // all required "V" characters
      firstLine +=  "V     V" + " ";
      secondLine += " V   V " + " ";
      thirdLine +=  "  V V  " + " ";
      fourthLine += "   V   " + " ";

      // all required "A" characters
      firstLine +=  "   A";
      secondLine += "  A A";
      thirdLine +=  " AAAAA";
      fourthLine += "A     A";

      // print out all four lines of "JAVA"
      System.out.println(firstLine);
      System.out.println(secondLine);
      System.out.println(thirdLine);
      System.out.println(fourthLine);
   } // end runPrintJob
}
