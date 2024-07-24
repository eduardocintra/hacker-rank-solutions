package br.com.eduardocintra.easy.divisiblesumpairs;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'divisibleSumPairs' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. INTEGER k
   *  3. INTEGER_ARRAY ar
   */

  public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    int totalOfPairs = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        if (i < j && (ar.get(i) + ar.get(j)) % k == 0) totalOfPairs++;
      }
    }
    return totalOfPairs;
  }
}

public class DivisibleSumPairs {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    List<Integer> parameters =
        Arrays.stream(sc.nextLine().split("\\s")).map(Integer::parseInt).collect(toList());
    int n = parameters.get(0);
    int k = parameters.get(1);

    List<Integer> numbers =
        Arrays.stream(sc.nextLine().split("\\s")).map(Integer::parseInt).collect(toList());
    System.out.println(Result.divisibleSumPairs(n, k, numbers));
  }
}
