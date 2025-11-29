package br.com.eduardocintra.easy.betweentwosets;

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
   * Complete the 'getTotalX' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY a
   *  2. INTEGER_ARRAY b
   */

  public static int getTotalX(List<Integer> a, List<Integer> b) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    long lcmA = mmc(a);
    long gcdB = mdc(b);

    if (lcmA > gcdB) {
      return 0;
    }

    int count = 0;
    for (long i = lcmA; i <= gcdB; i += lcmA) {
      if (gcdB % i == 0) {
        count++;
      }
    }

    return count;
  }

  public static long mdc(final List<Integer> numbers) {
    long result = numbers.get(0);
    for (int i = 1; i < numbers.size(); i++) {
      result = mdc(result, numbers.get(i));
    }
    return result;
  }

  public static long mmc(final List<Integer> numbers) {
    long result = numbers.get(0);
    for (int i = 1; i < numbers.size(); i++) {
      result = mmc(result, numbers.get(i));
    }
    return result;
  }

  public static long mdc(final long a, final long b) {
    return b == 0 ? a : mdc(b, a % b);
  }

  public static long mmc(final long a, long b) {
    return (a * b) / mdc(a, b);
  }
}

public class BetweenTwoSets {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int n = Integer.parseInt(firstMultipleInput[0]);

    int m = Integer.parseInt(firstMultipleInput[1]);

    List<Integer> arr =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    List<Integer> brr =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    int total = Result.getTotalX(arr, brr);

    bufferedWriter.write(String.valueOf(total));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
