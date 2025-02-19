package br.com.eduardocintra.easy.staircase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

class Result {

  /*
   * Complete the 'staircase' function below.
   *
   * The function accepts INTEGER n as parameter.
   */

  public static void staircase(int n) {
    String line = String.join("", Collections.nCopies(n, "#"));
    for(int i = 0; i < n; i++) {
      int size = i + 1;
      System.out.printf("%" + n + "s\n", line.substring(0, size));
    }
  }

  private static void printSpaces(int n) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    for (int i = 0; i < n; i++) {
      System.out.print(" ");
    }
  }
}

public class Staircase {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    Result.staircase(n);

    bufferedReader.close();
  }
}
