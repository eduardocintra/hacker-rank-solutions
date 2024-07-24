package br.com.eduardocintra.easy.migratorybirds;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'migratoryBirds' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static int migratoryBirds(List<Integer> arr) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    return arr.stream().collect(Collectors.groupingBy(n -> n)).entrySet().stream()
        .max(
            Comparator.comparingInt(
                    (Map.Entry<Integer, List<Integer>> entry) -> entry.getValue().size())
                .thenComparingInt((Map.Entry<Integer, List<Integer>> entry) -> -entry.getKey()))
        .map(Map.Entry::getKey)
        .orElse(0);
  }
}

public class MigratoryBirds {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int size = Integer.parseInt(sc.nextLine());

    List<Integer> arr =
        Arrays.stream(sc.nextLine().split("\\s")).map(Integer::parseInt).collect(toList());
    if (arr.size() != size) {
      throw new IllegalArgumentException("Size of array is invalid");
    }
    System.out.println(Result.migratoryBirds(arr));
  }
}
