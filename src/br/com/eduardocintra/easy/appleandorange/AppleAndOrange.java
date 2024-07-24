package br.com.eduardocintra.easy.appleandorange;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

class Result {

  /*
   * Complete the 'countApplesAndOranges' function below.
   *
   * The function accepts following parameters:
   *  1. INTEGER s
   *  2. INTEGER t
   *  3. INTEGER a
   *  4. INTEGER b
   *  5. INTEGER_ARRAY apples
   *  6. INTEGER_ARRAY oranges
   */

  public static void countApplesAndOranges(
      int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    long amountApples =
        apples.stream()
            .filter(
                position -> {
                  return position + a >= s && position + a <= t;
                })
            .count();

    long amountOranges =
        oranges.stream()
            .filter(
                position -> {
                  return position + b <= t && position + b >= s;
                })
            .count();

    System.out.println(amountApples);
    System.out.println(amountOranges);
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
