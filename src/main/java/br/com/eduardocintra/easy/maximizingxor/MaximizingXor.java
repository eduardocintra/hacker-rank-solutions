package br.com.eduardocintra.easy.maximizingxor;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

class Result {

  /*
   * 014 - Maximizing XOR
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/maximizing-xor/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/maximizingxor/MaximizingXor.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static int maximizingXor(int l, int r) {
    int xor = l ^ r;
    int max = 1;

    while (xor > 0) {
      xor >>= 1;
      max <<= 1;
    }

    return max - 1;
  }
}

public class MaximizingXor {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int l = Integer.parseInt(bufferedReader.readLine().trim());

    int r = Integer.parseInt(bufferedReader.readLine().trim());

    int result = Result.maximizingXor(l, r);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
