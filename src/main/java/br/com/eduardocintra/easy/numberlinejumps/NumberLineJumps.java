package br.com.eduardocintra.easy.numberlinejumps;

import java.io.*;

class Result {

  /*
   * 013 - Number Line Jumps
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/kangaroo/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/numberlinejumps/NumberLineJumps.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static String kangaroo(int x1, int v1, int x2, int v2) {
    if (v2 >= v1) return "NO";

    return (x2 - x1) % (v1 - v2) == 0 ? "YES" : "NO";
  }
}

public class NumberLineJumps {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int x1 = Integer.parseInt(firstMultipleInput[0]);

    int v1 = Integer.parseInt(firstMultipleInput[1]);

    int x2 = Integer.parseInt(firstMultipleInput[2]);

    int v2 = Integer.parseInt(firstMultipleInput[3]);

    String result = Result.kangaroo(x1, v1, x2, v2);

    bufferedWriter.write(result);
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
