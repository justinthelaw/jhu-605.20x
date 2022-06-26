/*
*  MorseCodeTranslator performs the required task, using certain assumptions, as described in MorseCodeTranslator.md or the PDF in which this code block is contained.
*  author: Justin Law
*  class: EN.605.201.82.SU22
*/

import java.util.Scanner;

public class MorseCodeTranslator {
   // initialize variable to store translation type user is requesting
   // 1 means user will input Morse Code
   // 2 means user will input English
   private static int translationType = 0;
   // initialize variable to store user input for translation
   private static String translationInput = "";

   // initialize array for storing Morse Code
   private static final String[] MORSE_CODE = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
         "-.-", ".-..", "--", "--", ".-", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
         "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----" };
   // initialize array for storing English characters and digits
   private static final String[] ENGLISH = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
         "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };

   public static void main(String[] args) {
      // start by getting user choice and input for Morse Code or English
      getUserInput();

      System.out.println(translationType);
      System.out.println(translationInput);
   } // end main method

   // getUserInput is a method that has user choose Morse Code or English input
   private static void getUserInput() {
      // using the Scanner util, grab user choice
      Scanner choiceInput = new Scanner(System.in);
      // keep asking user until a valid input is provided
      while ((translationType != 1) && (translationType != 2)) {
         System.out.print("\nPick a translation type:\n(1) Morse Code -> English\n(2) English to Morse Code\nChoice: ");
         translationType = choiceInput.nextInt();
      }
      // user Scanner util, grab user input
      Scanner userInput = new Scanner(System.in);
      // keep asking user until an input is provided
      while (translationInput.length() <= 0) {
         System.out.print(translationType == 1 ? "\nInput Morse Code: " : "\nInput English: ");
         translationInput = userInput.nextLine();
      }
      // close open Scanners
      userInput.close();
      choiceInput.close();
   } // end getUserInput method


} // end MorseCodeTranslator class
