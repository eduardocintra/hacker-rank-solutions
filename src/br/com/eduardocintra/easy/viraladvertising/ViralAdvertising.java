package br.com.eduardocintra.easy.viraladvertising;

import java.io.IOException;
import java.util.Scanner;

class Result {

  /*
   * Complete the 'viralAdvertising' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER n as parameter.
   */

  public static int viralAdvertising(int n) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    int cumulativeLikes = 0;
    int shared = 5;
    for(int i = 1; i <= n; i++) {
      int liked = shared / 2;
      cumulativeLikes += liked;
      shared = liked * 3;

    }
    return cumulativeLikes;
  }
}

public class ViralAdvertising {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    System.out.println(Result.viralAdvertising(n));
  }
}
