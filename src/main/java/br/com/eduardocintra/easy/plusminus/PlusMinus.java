package br.com.eduardocintra.easy.plusminus;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

  /*
   * 006 - Plus Minus
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/plus-minus/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/plusminus/PlusMinus.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static void plusMinus(List<Integer> arr) {
    int size = arr.size();
    int positiveCount = 0;
    int negativeCount = 0;
    int zeroCount = 0;

    for (int i = 0; i < size; i++) {
      int value = arr.get(i);
      if (value > 0) positiveCount++;
      if (value < 0) negativeCount++;
      if (value == 0) zeroCount++;
    }

    System.out.printf("%.6f\n", positiveCount / (float) size);
    System.out.printf("%.6f\n", negativeCount / (float) size);
    System.out.printf("%.6f\n", zeroCount / (float) size);
  }
}

public class PlusMinus {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    Result.plusMinus(arr);

    bufferedReader.close();
  }
}
