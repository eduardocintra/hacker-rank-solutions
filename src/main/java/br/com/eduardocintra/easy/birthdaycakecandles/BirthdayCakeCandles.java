package br.com.eduardocintra.easy.birthdaycakecandles;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

class Result {

  /*
   * 009 - Birthday Cake Candles
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/birthday-cake-candles/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/birthdaycakecandles/BirthdayCakeCandles.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static int birthdayCakeCandles(List<Integer> candles) {
    int tallest = 0;
    int units = 0;

    for (int value : candles) {
      if (value > tallest) {
        tallest = value;
        units = 1;
      } else if (value == tallest) {
        units++;
      }
    }

    return units;
  }
}

public class BirthdayCakeCandles {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> candles =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    int result = Result.birthdayCakeCandles(candles);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
