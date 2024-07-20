package br.com.eduardocintra.easy.countingvalleys;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Scanner;

class Result {

  /*
   * Complete the 'countingValleys' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER steps
   *  2. STRING path
   */

  public static int countingValleys(int steps, String path) {
    // Write your code here
    int seaLevel = 0;
    int valleys = 0;
    for (int i = 0; i < path.length(); i++) {
      char c = path.charAt(i);
      if (c == 'U') {
        seaLevel++;
      }

      if (c == 'D') {
        seaLevel--;
      }

      // Check if the hiker has returned to sea level from a valley.
      if (seaLevel == 0 && c == 'U') {
        valleys++;
      }
    }
    return valleys;
  }
}

public class CountingValleys {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int steps = Integer.parseInt(sc.nextLine());
    String path = sc.nextLine();
    if (path.length() != steps) {
      throw new InvalidParameterException("Invalid steps");
    }
    System.out.println(Result.countingValleys(steps, path));
  }
}
