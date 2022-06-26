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
         "-.-", ".-..", "--", ".-", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
         "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "|" };
   // initialize array for storing English characters and digits
   private static final String[] ENGLISH = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
         "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", " " };

   public static void main(String[] args) {
      // start by getting user choice for Morse Code or English and input
      getUserInput();
      // translate based on user choice
      if (translationType == 1) {
         translateToEnglish();
      } else {
         translateToMorseCode();
      }
   } // end main method

   // getUserInput is a method that has user choose Morse Code or English input
   private static void getUserInput() {
      // using the Scanner util, grab user choice
      Scanner choiceInput = new Scanner(System.in);
      // keep asking user until a valid input is provided
      while ((translationType != 1) && (translationType != 2)) {
         System.out.print("\nPick a translation type:\n(1) Morse Code -> English\n(2) English -> Morse Code\nChoice: ");
         translationType = choiceInput.nextInt();
      }
      // user Scanner util, grab user input
      Scanner userInput = new Scanner(System.in);
      // keep asking user until an input is provided
      while (translationInput.length() <= 0) {
         System.out.print(translationType == 1 ? "\nInput Morse Code: " : "\nInput English: ");
         translationInput = userInput.nextLine().trim();
      }
      // close open Scanners
      userInput.close();
      choiceInput.close();
   } // end getUserInput method

   // method that takes the Morse code user input and translates to English
   private static void translateToEnglish() {
      // initialize variable to store current Morse code
      String code = "";
      // initialize variable to store resulting English sentence
      String result = "";

      // destructive while-loop on translationInput
      while (translationInput.length() > 0) {
         // determine the first appearence of a space or bar
         int firstSpace = translationInput.indexOf(" ");
         int firstBar = translationInput.indexOf("|");

         // if statement determines if a character or space is next
         if ((firstSpace < firstBar) || (firstBar == -1)) {
            // if no spaces or bars left, that means only one character is left
            if (firstSpace == -1) {
               code = translationInput;
               translationInput = "";
            } else {
               // assign code to the next morse code between spaces
               code = translationInput.substring(0, firstSpace);
               // destroy the morse code between spaces that was just assigned to code
               translationInput = translationInput.substring(firstSpace + 1, translationInput.length());
            }
         } else if (firstSpace > firstBar) {
            // add a spave to the result
            result += " ";
            code = "";
            // destroy the bar and spaces around it
            translationInput = translationInput.substring(firstBar + 2, translationInput.length());
         } else {
            // if bar and space index are equal, that means nothing is left
            // leave while-loop
            break;
         }
         // find the index of the code in the MORSE_CODE array
         int codeIndex = linearIndexSearch(MORSE_CODE, code);
         // check for corresponding English character
         // if character doesn't exist in either array, skip over it
         // e.g. all punctuation gets skipped over
         result += codeIndex != -1 ? ENGLISH[codeIndex] : "";
      }

      // print out trimmed (no whitespace at beginning or end) result
      System.out.println("\nEnglish Sentence Output: " + result.trim() + "\n");
   }

   // method that takes the English user input and translates to Morse code
   private static void translateToMorseCode() {
      // initialize variable to store current character
      String character = "";
      // initialize variable to store resulting Morse code
      String result = "";
      // for loop to walk through English string
      for (int i = 0; i < translationInput.length(); i++) {
         // assign substring at index to character
         character = translationInput.substring(i, i + 1);
         // find the index of the character in the ENGLISH array
         int characterIndex = linearIndexSearch(ENGLISH, character);
         // check for corresponding Morse code
         // if character doesn't exist in either array, skip over it
         // e.g. all punctuation gets skipped over
         result += characterIndex != -1 ? MORSE_CODE[characterIndex] : "";
         result += characterIndex != -1 ? " " : "";
      }
      // print out trimmed (no whitespace at beginning or end) result
      System.out.println("\nMorse Code Output: " + result.trim() + "\n");
   }

   // method that looks for the index of a matching element in an array
   private static int linearIndexSearch(String[] array, String character) {
      // default is no element can be found
      int index = -1;
      // loop over array and look for character
      for (int j = 0; j < array.length; j++) {
         // transform character to upper case for ENGLISH array
         // matching requires standardization to upper case
         if (array[j].equals(character.toUpperCase())) {
            index = j;
         }
      }
      return index;
   }

} // end MorseCodeTranslator class
