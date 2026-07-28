package br.com.eduardocintra.easy.breakingtherecords;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Result {

  /*
   * 016 - Breaking the Records
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/breakingtherecords/BreakingTheRecords.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static List<Integer> breakingRecords(List<Integer> scores) {
    int minScore = scores.get(0);
    int maxScore = scores.get(0);

    int minBreaks = 0;
    int maxBreaks = 0;

    for (int i = 1; i < scores.size(); i++) {
      int score = scores.get(i);
      if (score > maxScore) {
        maxScore = score;
        maxBreaks++;
      } else if (score < minScore) {
        minScore = score;
        minBreaks++;
      }
    }
    return Arrays.asList(maxBreaks, minBreaks);
  }
}

public class BreakingTheRecords {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> scores =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    List<Integer> result = Result.breakingRecords(scores);

    bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" ")) + "\n");

    bufferedReader.close();
    bufferedWriter.close();
  }
}
