package br.com.eduardocintra.easy.minimaxsum;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'miniMaxSum' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static void miniMaxSum(List<Integer> arr) {
    long min = Long.MAX_VALUE;
    long max = Long.MIN_VALUE;

    for (int i = 0; i < arr.size(); i++) {
      int excludedIndex = i;

      long sum =
          IntStream.range(0, arr.size())
              .filter(index -> index != excludedIndex)
              .mapToLong(index -> new Long(arr.get(index)))
              .reduce(0, Long::sum);

      if (sum < min) min = sum;
      if (sum > max) max = sum;
    }

    System.out.println(min + " " + max);
  }
}

public class MiniMaxSum {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();
    String[] arr = input.split("\\s");

    Result.miniMaxSum(Arrays.stream(arr).map(Integer::new).collect(toList()));
  }
}
