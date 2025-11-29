package br.com.eduardocintra.easy.minimaxsum;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

  /*
   * 008 - Mini-Max Sum
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/mini-max-sum/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/minimaxsum/MiniMaxSum.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static void miniMaxSum(List<Integer> arr) {
    long total = 0;
    long max = Long.MIN_VALUE;
    long min = Long.MAX_VALUE;

    for (long value : arr) {
      total += value;
      max = Math.max(max, value);
      min = Math.min(min, value);
    }

    long maxSum = total - min;
    long minSum = total - max;
    System.out.printf("%d %d\n", minSum, maxSum);
  }
}

public class MiniMaxSum {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    List<Integer> arr =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    Result.miniMaxSum(arr);

    bufferedReader.close();
  }
}
