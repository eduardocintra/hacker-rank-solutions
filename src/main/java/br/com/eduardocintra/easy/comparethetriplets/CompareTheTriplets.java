package br.com.eduardocintra.easy.comparethetriplets;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

  /*
   * 003 - Compare the Triplets
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/compare-the-triplets/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/comparethetriplets/CompareTheTriplets.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    Integer aliceCount = 0;
    Integer bobCount = 0;

    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) > b.get(i)) {
        aliceCount++;
      } else if (b.get(i) > a.get(i)) {
        bobCount++;
      }
    }

    return Arrays.asList(aliceCount, bobCount);
  }
}

public class CompareTheTriplets {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    List<Integer> a =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    List<Integer> b =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    List<Integer> result = Result.compareTriplets(a, b);

    bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" ")) + "\n");

    bufferedReader.close();
    bufferedWriter.close();
  }
}
