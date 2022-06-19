# Original Topic

The following program prompts a user to enter temperatures in degrees Fahrenheit or Celsius. It then converts the entered temperature to the other measurement scale and displays both the entered temperature and the equivalent temperature in the other measurement scale.

```java
// class TemperatureConversion
//    Performs Temperature conversion from Fahrenheit to Celsius and vice versa
//
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        final int CONVERT_TO_CELSIUS = 1;
        final int CONVERT_TO_FAHRENHEIT = 2;
        final int END_PROGRAM = 3;
        int userChoice = 0; // User selection: 1, 2, 3
        float tempF = 0; // Fahrenheit temperature
        float tempC = 0; // Celsius temperature
        Scanner input = new Scanner(System.in); // Create a Scanner to obtain user input

        while (userChoice != END_PROGRAM) {
            System.out.print("Enter 1 to convert F->C, 2 to convert C->F, 3 to quit: ");
            userChoice = input.nextInt(); // Read user input
            switch (userChoice) {
                case CONVERT_TO_CELSIUS:
                    System.out.print("Enter a Fahrenheit temperature: ");
                    tempF = input.nextFloat();
                    tempC = 5F / 9F * (tempF - 32F);
                    System.out.println(tempF + " degrees Fahrenheit is " + tempC + " degrees Celsius");
                    break;

                case CONVERT_TO_FAHRENHEIT:
                    System.out.print("Enter a Celsius temperature: ");
                    tempC = input.nextFloat();
                    tempF = 9F / 5F * tempC + 32F;
                    System.out.println(tempC + " degrees Celsius is " + tempF + " degrees Fahrenheit");
                    break;

                case END_PROGRAM:
                    System.out.println("Bye Bye");
                    break;

                default: // Invalid Data Entered
                    System.out.println("Invalid Data: You must enter 1, 2, or 3");

            } // end switch
        } // end while
        input.close();
    } // end main
} // end class TemperatureConversion
```

Re-design this program using methods. Explain the justification behind your re-design and why using methods is advantageous.

# Response

Please see `./TemperatureConversion.java` for the refactoring done on the class above.