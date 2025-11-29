package br.com.eduardocintra.easy.minimaxsum;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

  /*
   * Complete the 'miniMaxSum' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static void miniMaxSum(List<Integer> arr) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    long total = 0;
    long max = Long.MIN_VALUE;
    long min = Long.MAX_VALUE;

    for (long value : arr) {
      total += value;
      max = Math.max(max, value);
      min = Math.min(min, value);
    }

    long maxSum = total - min;
    long minSum = total - max;
    System.out.printf("%d %d\n", minSum, maxSum);
  }
}

public class MiniMaxSum {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    List<Integer> arr =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    Result.miniMaxSum(arr);

    bufferedReader.close();
  }
}
