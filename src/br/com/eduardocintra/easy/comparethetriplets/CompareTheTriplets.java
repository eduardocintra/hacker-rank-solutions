package br.com.eduardocintra.easy.comparethetriplets;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'compareTriplets' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY a
   *  2. INTEGER_ARRAY b
   */

  public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

    Integer resultA = 0;
    Integer resultB = 0;

    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) > b.get(i)) {
        resultA++;
      } else if (b.get(i) > a.get(i)) {
        resultB++;
      }
    }

    return Arrays.asList(resultA, resultB);
  }
}

public class CompareTheTriplets {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    String input1 = sc.nextLine();
    List<Integer> list1 = Stream.of(input1.split("\\s")).map(Integer::parseInt).collect(toList());

    String input2 = sc.nextLine();
    List<Integer> list2 = Stream.of(input2.split("\\s")).map(Integer::parseInt).collect(toList());

    if (list1.size() != list2.size()) {
      throw new InvalidParameterException("Invalid list sizes");
    }

    String result =
        Result.compareTriplets(list1, list2).stream()
            .map(String::valueOf)
            .collect(Collectors.joining(" "));
    System.out.println(result);
  }
}
