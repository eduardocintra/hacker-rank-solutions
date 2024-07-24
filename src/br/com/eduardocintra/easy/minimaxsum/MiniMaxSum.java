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
    Long min = Long.MAX_VALUE;
    Long max = Long.MIN_VALUE;

    for (int i = 0; i < arr.size(); i++) {
      int excludedIndex = i;

      Long sum =
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
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    List<Integer> arr =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    Result.miniMaxSum(arr);

    bufferedReader.close();
  }
}
