package br.com.eduardocintra.easy.divisiblesumpairs;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

  /*
   * 018 - Divisible Sum Pairs
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/divisiblesumpairs/DivisibleSumPairs.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    int[] remainderCount = new int[k];
    int pairCount = 0;

    for (int number : ar) {
      int remainder = number % k;
      int complement = (k - remainder) % k;

      pairCount += remainderCount[complement];
      remainderCount[remainder]++;
    }

    return pairCount;
  }
}

public class DivisibleSumPairs {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int n = Integer.parseInt(firstMultipleInput[0]);

    int k = Integer.parseInt(firstMultipleInput[1]);

    List<Integer> ar =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    int result = Result.divisibleSumPairs(n, k, ar);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
