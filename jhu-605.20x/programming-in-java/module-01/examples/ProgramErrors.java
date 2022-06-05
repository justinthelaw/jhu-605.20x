public class ProgramErrors {
  public static void main(String[] args) {
    int base = 10;
    int height = 20;
    // error: missing the divided by 2 for area of a triangle
    int area = (height * base) / 2;
    // error: missing the semicolon at the end of the function call
    System.out.println("The area is " + area);
  }
}
