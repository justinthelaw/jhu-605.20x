public class Progress {
  // usage of \r escape character t move cursor back to start of the console message to rewrite the output
  public static void main(String[] arg) throws Exception {
    String anim = "|/-\\";
    for (int x = 0; x < 100; x++) {
      String data = "\r" + anim.charAt(x % anim.length()) + " " + x;
      System.out.write(data.getBytes());
      Thread.sleep(100);
    }
  }

}
