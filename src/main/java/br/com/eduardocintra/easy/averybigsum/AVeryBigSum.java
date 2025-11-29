package br.com.eduardocintra.easy.averybigsum;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

  /*
   * 004 - A Very Big Sum
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/a-very-big-sum/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/averybigsum/AVeryBigSum.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static long aVeryBigSum(List<Long> ar) {
    return ar.stream().reduce(0L, Long::sum);
  }
}

public class AVeryBigSum {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int arCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Long> ar =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

    long result = Result.aVeryBigSum(ar);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
