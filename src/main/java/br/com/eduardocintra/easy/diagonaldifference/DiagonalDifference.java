package br.com.eduardocintra.easy.diagonaldifference;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

  /*
   * 005 - Diagonal Difference
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/diagonal-difference/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/diagonaldifference/DiagonalDifference.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static int diagonalDifference(List<List<Integer>> arr) {
    int leftToRighDiagonalSum = 0;
    int rightToLeftDiagonalSum = 0;

    // Improved version reducing algorithm complexity
    for (int i = 0; i < arr.size(); i++) {
      leftToRighDiagonalSum += arr.get(i).get(i);
      rightToLeftDiagonalSum += arr.get(i).get(arr.get(i).size() - i - 1);
    }
    return Math.abs(leftToRighDiagonalSum - rightToLeftDiagonalSum);
  }
}

public class DiagonalDifference {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<List<Integer>> arr = new ArrayList<>();

    IntStream.range(0, n)
        .forEach(
            i -> {
              try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList()));
              } catch (IOException ex) {
                throw new RuntimeException(ex);
              }
            });

    int result = Result.diagonalDifference(arr);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
