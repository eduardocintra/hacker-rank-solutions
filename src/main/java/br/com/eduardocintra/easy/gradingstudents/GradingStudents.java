package br.com.eduardocintra.easy.gradingstudents;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Result {

  /*
   * 011 - Grading Students
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/grading/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/gradingstudents/GradingStudents.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static List<Integer> gradingStudents(List<Integer> grades) {
    return grades.stream().map(Result::roundGrade).collect(Collectors.toList());
  }

  private static int roundGrade(int number) {
    final int mod = 5;
    if (number < 38) return number;

    final int remainder = number % 5;
    final int diffToNext = remainder == 0 ? 0 : mod - remainder;

    return diffToNext < 3 ? number + diffToNext : number;
  }
}

public class GradingStudents {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> grades =
        IntStream.range(0, gradesCount)
            .mapToObj(
                i -> {
                  try {
                    return bufferedReader.readLine().replaceAll("\\s+$", "");
                  } catch (IOException ex) {
                    throw new RuntimeException(ex);
                  }
                })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

    List<Integer> result = Result.gradingStudents(grades);

    bufferedWriter.write(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

    bufferedReader.close();
    bufferedWriter.close();
  }
}
