package br.com.eduardocintra.easy.migratorybirds;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

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
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    int result = Result.migratoryBirds(arr);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
