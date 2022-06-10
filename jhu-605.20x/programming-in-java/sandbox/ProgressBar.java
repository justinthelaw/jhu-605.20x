public class ProgressBar {
  // usage of \r escape character t move cursor back to start of the console message to rewrite the output
  public static void main(String[] arg) throws Exception {
    String bar = "=";
    for (int x = 0; x < 100; x++) {
      bar += "=";
      String data = "\r" + bar + " " + x;
      System.out.write(data.getBytes());
      Thread.sleep(200);
    }
    System.out.println();
  }

}
