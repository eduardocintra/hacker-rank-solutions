package br.com.eduardocintra.easy.equalizethearray;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

  /*
   * Complete the 'equalizeArray' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static int equalizeArray(List<Integer> arr) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    List<List<Integer>> groupedList =
        arr.stream()
            .collect(Collectors.groupingBy(number -> number))
            .values()
            .stream()
            .sorted((list1, list2) -> Integer.compare(list2.size(), list1.size()))
            .collect(Collectors.toList());
    int biggestGroup = groupedList.get(0).size();
    return arr.size() - biggestGroup;
  }
}

public class EqualizeTheArray {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    int result = Result.equalizeArray(arr);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
