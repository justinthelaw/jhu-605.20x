public class TypePromotions {
  public static void main (String [] args) {
    // // the follwoing causes a compile-time error
    // byte b;
    // b = 50;
    // b = b * 2;
    // System.out.println(b);

    // the following is properyl controlled promotion using casting
    byte a;
    a = 50;
    a = (byte)(a * 2);
    System.out.println(a);
  }
}
