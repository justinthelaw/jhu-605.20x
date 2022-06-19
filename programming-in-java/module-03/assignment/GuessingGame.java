/*
*  GuessingGame performs the required task, using certain assumptions, as described in GuessingGame.md or the PDF in which this code block is contained.
*  author: Justin Law
*  class: EN.605.201.82.SU22
*/

import java.util.Scanner;

// Class which receives max number of guesses and max number and
// initiatives a guess game with guidance towards the correct answer
public class GuessingGame {
   public static void main(String[] args) {

      // game state initialization
      int gameState = 1;

      while (gameState == 1)
      { // run game while gameState = 1, "on"

         // max possible number
         int maxNumber = 1;
         // max number of guesses
         int numberOfGuesses = 1;
         // current guess attempts
         int currentAttempts = 0;
         // initialize guess variable
         int guess = 0;

         // add space before game initialization inputs
         System.out.println();
         // All scanners stay "open" until program ends
         // Use a Scanner to get user-provided max number
         Scanner inputNumber = new Scanner(System.in);
         System.out.print("Maximum possible number (greater than 1): ");
         maxNumber = inputNumber.nextInt();
         // Use a Scanner to get user-provided max guesses
         Scanner inputGuesses = new Scanner(System.in);
         System.out.print("Maximum number of guesses: ");
         numberOfGuesses = inputGuesses.nextInt();

         // generate random number
         int randomNumber = (int) (maxNumber * Math.random()) + 1;

         // catch case of max number 1 equals default guess of 1
         if (maxNumber == randomNumber && maxNumber == 1)
         {
            System.out.println("The maximum possible number must be greater than 1. Please try again!");
         }

         while (guess != randomNumber && maxNumber > 1)
         {
            // add space before guess prompts loop
            System.out.println();
            Scanner inputGuess = new Scanner(System.in);
            System.out.print("Guess a number between 1 and " + maxNumber + ": ");
            guess = inputGuess.nextInt();
            currentAttempts++;

            if (guess == randomNumber)
            { // if correct guess, ask player if they want to play again
               System.out.println("\nYou guessed the correct number!");
               Scanner choice = new Scanner(System.in);
               System.out.print("Play again? Yes (1) or No (2): ");
               int playerChoice = choice.nextInt();
               if (playerChoice != 1)
               { // don't change game state and continue game
                  gameState = 0;
                  System.out.println("\nThanks for playing! Goodbye :)");
                  break;
               }
            }
            else
            { // check answer and print appropriate message
               if (guess < randomNumber)
               {
                  System.out.println("Too low!");
               }
               if (guess > randomNumber)
               {
                  System.out.println("Too high!");
               }
               if (currentAttempts >= numberOfGuesses) {
                  System.out.println("Sorry, you've reached the maximum number of guesses!");
                  // set the game to complete using condition
                  guess = randomNumber;
                  // ask player if they want to play again
                  Scanner choice = new Scanner(System.in);
                  // plyaer must type 1 for yes and 2 for no
                  System.out.print("Play again? Yes (1) or No (2): ");
                  int playerChoice = choice.nextInt();
                  if (playerChoice != 1)
                  {
                     gameState = 0;
                     System.out.println("\nThanks for playing! Goodbye :)");
                     break;
                  }
               }
            }
         }

      }

   } // end main()
} // end class GuessingGame