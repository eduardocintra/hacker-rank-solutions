package br.com.eduardocintra.easy.staircase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

class Result {

  /*
   * 007 - Staircase
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/staircase/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/staircase/Staircase.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static void staircase(int n) {
    String line = String.join("", Collections.nCopies(n, "#"));
    for (int i = 0; i < n; i++) {
      int size = i + 1;
      System.out.printf("%" + n + "s\n", line.substring(0, size));
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
