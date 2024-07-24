package br.com.eduardocintra.medium.countergame;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result {

  /*
   * Complete the 'counterGame' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts LONG_INTEGER n as parameter.
   */

  public static String counterGame(long n) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    int attemps = 0;
    do {
      attemps++;

      if (!isPowerOfTwo(n)) {
        long nextLowerPowerOfTwo = getNextLowerPowerOfTwo(n);
        n = n - nextLowerPowerOfTwo;
        continue;
      }

      n = n / 2;
    } while (n != 1);

    return attemps % 2 == 0 ? "Richard" : "Louise";
  }

  private static boolean isPowerOfTwo(Long n) {
    return n > 0 && ((n & (n - 1)) == 0);
  }

  private static long getNextLowerPowerOfTwo(Long n) {
    long power = 1;
    while (power <= n) {
      power <<= 1;
    }
    return power >> 1;
  }
}

public class CounterGame {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    System.out.println(Result.counterGame(n));
  }
}
