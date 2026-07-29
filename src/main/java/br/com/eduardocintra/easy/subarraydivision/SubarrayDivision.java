package br.com.eduardocintra.easy.subarraydivision;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

class Result {

  /*
   * 017 - Subarray Division
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/the-birthday-bar/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/subarraydivision/SubarrayDivision.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static int birthday(List<Integer> s, int d, int m) {
    int numberOfWays = 0;
    int sum = 0;

    for (int i = 0; i < m; i++) {
      sum += s.get(i);
    }

    if (sum == d) {
      numberOfWays++;
    }

    for (int i = m; i < s.size(); i++) {
      sum += s.get(i) - s.get(i - m);

      if (sum == d) {
        numberOfWays++;
      }
    }
    return numberOfWays;
  }
}

public class SubarrayDivision {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> s =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int d = Integer.parseInt(firstMultipleInput[0]);

    int m = Integer.parseInt(firstMultipleInput[1]);

    int result = Result.birthday(s, d, m);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
