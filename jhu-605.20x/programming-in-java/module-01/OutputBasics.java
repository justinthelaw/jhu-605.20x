public class OutputBasics {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    int z = 30;

    System.out.println("x is " + x + " and y is " + y);

    System.out.print("x is greater than y: ");

    System.out.println(x > y);

    System.out.println("(WRONG) x + y = " + x + y);

    System.out.println("(RIGHT) x + y = " + (x + y));

    System.out.print("\t" + x + "\n\t\t" + y + "\n\t\t\t" + z + "\n");
  }

}
