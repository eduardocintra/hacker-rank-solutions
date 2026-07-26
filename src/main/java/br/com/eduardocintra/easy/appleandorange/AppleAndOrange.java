package br.com.eduardocintra.easy.appleandorange;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

  /*
   * 012 - Apple and Orange
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/apple-and-orange/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/appleandorange/AppleAndOrange.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static void countApplesAndOranges(
      int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    int applesOnHouse = countFruitsOnHouse(apples, a, s, t);
    int orangesOnHouse = countFruitsOnHouse(oranges, b, s, t);

    System.out.println(applesOnHouse);
    System.out.println(orangesOnHouse);
  }

  private static int countFruitsOnHouse(
      final List<Integer> fruits, final int treePosition, final int s, final int t) {
    int fruitsOnHouse = 0;
    for (int p : fruits) {
      int finalPosition = treePosition + p;
      if (finalPosition >= s && finalPosition <= t) {
        fruitsOnHouse++;
      }
    }

    return fruitsOnHouse;
  }
}

public class AppleAndOrange {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int s = Integer.parseInt(firstMultipleInput[0]);

    int t = Integer.parseInt(firstMultipleInput[1]);

    String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int a = Integer.parseInt(secondMultipleInput[0]);

    int b = Integer.parseInt(secondMultipleInput[1]);

    String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int m = Integer.parseInt(thirdMultipleInput[0]);

    int n = Integer.parseInt(thirdMultipleInput[1]);

    List<Integer> apples =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    List<Integer> oranges =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    Result.countApplesAndOranges(s, t, a, b, apples, oranges);

    bufferedReader.close();
  }
}
