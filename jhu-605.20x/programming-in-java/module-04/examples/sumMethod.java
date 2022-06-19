/* sumTo is a method that adds all numbers between a provided range, inclusive of the provided numbers */

import java.util.Scanner;

public class sumMethod {
  public static void main(String[] args) {

    int number1;
    int number2;

    Scanner input1 = new Scanner(System.in);
    System.out.print("1st number: ");
    number1 = input1.nextInt();
    Scanner input2 = new Scanner(System.in);
    System.out.print("2nd number: ");
    number2 = input2.nextInt();

    input1.close();
    input2.close();

    if (number1 >= number2) {
      System.out.println("1st number must be greater than 2nd number!");
    } else {
      int result = sumTo(number1, number2);
      System.out.println("The sum of " + number1 + " to " + number2 + " is " + result);
    }
  }

  private static int sumTo(int x, int y) {

    int result = x;

    for (int i = x; i <= y; i++) {
      if (i != x) {
        result += i;
      }
    }

    return result;
  }
}
