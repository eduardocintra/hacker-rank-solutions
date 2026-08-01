package br.com.eduardocintra.easy.salesbymatch;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

class Result {

  /*
   * 022 - Sales by Match
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/sock-merchant/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/salesbymatch/SalesByMatch.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static int sockMerchant(int n, List<Integer> ar) {
    Map<Integer, Integer> frequencies = new HashMap<Integer, Integer>();
    int pairs = 0;
    for (int sockColor : ar) {
      int frequency = frequencies.getOrDefault(sockColor, 0) + 1;
      frequencies.put(sockColor, frequency);
      if (frequency % 2 == 0) {
        pairs++;
      }
    }
    return pairs;
  }
}

public class SalesByMatch {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> ar =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    int result = Result.sockMerchant(n, ar);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
