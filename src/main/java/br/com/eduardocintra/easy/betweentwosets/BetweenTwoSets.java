package br.com.eduardocintra.easy.betweentwosets;

import static java.util.stream.Collectors.toList;

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
   * 015 - Between Two Sets
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/between-two-sets/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/betweentwosets/BetweenTwoSets.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static int getTotalX(List<Integer> a, List<Integer> b) {
    long lcm = mmc(a);
    long gcd = mdc(b);

    if (lcm > gcd) {
      return 0;
    }

    int validNumbersCount = 0;
    for (long candidate = lcm; candidate <= gcd; candidate += lcm) {
      if (gcd % candidate == 0) {
        validNumbersCount++;
      }
    }

    return validNumbersCount;
  }

  public static long mdc(final List<Integer> numbers) {
    long result = numbers.get(0);
    for (int i = 1; i < numbers.size(); i++) {
      result = mdc(result, numbers.get(i));
    }
    return result;
  }

  public static long mdc(final long a, final long b) {
    return b == 0 ? a : mdc(b, a % b);
  }

  public static long mmc(final List<Integer> numbers) {
    long result = numbers.get(0);
    for (int i = 1; i < numbers.size(); i++) {
      result = mmc(result, numbers.get(i));
    }
    return result;
  }

  public static long mmc(final long a, long b) {
    return (a * b) / mdc(a, b);
  }
}

public class BetweenTwoSets {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int n = Integer.parseInt(firstMultipleInput[0]);

    int m = Integer.parseInt(firstMultipleInput[1]);

    List<Integer> arr =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    List<Integer> brr =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    int total = Result.getTotalX(arr, brr);

    bufferedWriter.write(String.valueOf(total));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
