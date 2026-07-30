package br.com.eduardocintra.easy.migratorybirds;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

class Result {

  /*
   * 019 - Migratory Birds
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/migratory-birds/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/migratorybirds/MigratoryBirds.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static int migratoryBirds(List<Integer> arr) {

    Map<Integer, Integer> frequency = new HashMap<>();
    int mostFrequent = 0;
    int result = 0;

    for (int type : arr) {

      int count = frequency.getOrDefault(type, 0) + 1;
      frequency.put(type, count);

      if (count > mostFrequent) {
        mostFrequent = count;
        result = type;
      } else if (count == mostFrequent) {
        result = Math.min(result, type);
      }
    }

    return result;
  }
}

public class MigratoryBirds {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    int result = Result.migratoryBirds(arr);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
