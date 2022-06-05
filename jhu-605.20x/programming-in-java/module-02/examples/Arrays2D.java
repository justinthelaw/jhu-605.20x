public class Arrays2D {
  public static void main(String[] args) {
    // initialize an array of 3 row by 4 column size
    // 0 1 2 3
    // 4 5 6 7
    // 8 9 10 11
    int[][] twoDimensional = new int[3][4];
    int k = 0;

    for (int i = 0; i < twoDimensional.length; i++) {
      for (int j = 0; j < 4; j++) {
        twoDimensional[i][j] = k;
        System.out.print(twoDimensional[i][j] + " ");
        k++;
      }
      System.out.println();
    }

    System.out.println("Same thing as above but 2D array is initialized differently");

    int[][] twoD = {
      {0, 1, 2, 3},
      {4, 5, 6, 7},
      {8, 9, 10, 11}
    };

    for (int l = 0; l < twoD.length; l++) {
      for (int m = 0; m < 4; m++) {
        System.out.print(twoD[l][m] + " ");
      }
      System.out.println();
    }
  }
}
