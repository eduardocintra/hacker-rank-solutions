package br.com.eduardocintra.easy.countingvalleys;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Scanner;

class Result {

  /*
   * 024 - Counting Valleys
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/counting-valleys/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/countingvalleys/CountingValleys.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static int countingValleys(int steps, String path) {

    int valleyCount = 0;
    int altitude = 0;
    for (char p : path.toCharArray()) {

      if (p == 'U') {
        altitude++;
      } else {
        altitude--;
      }

      if (p == 'U' && altitude == 0) {
        valleyCount++;
      }
    }

    return valleyCount;
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
