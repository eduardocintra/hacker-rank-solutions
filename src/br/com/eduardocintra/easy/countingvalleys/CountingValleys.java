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
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    int valleysCount = 0;
    int position = 0;
    for (int i = 0; i < path.length(); i++) {
      char step = path.charAt(i);
      if (step == 'U') {
        position++;
        if (position == 0) {
          valleysCount++;
        }
      } else {
        position--;
      }
    }
    return valleysCount;
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
