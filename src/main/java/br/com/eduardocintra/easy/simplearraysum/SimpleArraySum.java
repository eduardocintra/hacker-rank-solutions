package br.com.eduardocintra.easy.simplearraysum;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

  /*
   * 002 - Simple Array Sum
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/simple-array-sum/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/simplearraysum/SimpleArraySum.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static int simpleArraySum(List<Integer> ar) {
    return ar.stream().reduce(0, Integer::sum);
  }
}

public class SimpleArraySum {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int arCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> ar =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    int result = Result.simpleArraySum(ar);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
