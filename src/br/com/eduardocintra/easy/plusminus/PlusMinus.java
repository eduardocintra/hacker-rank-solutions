package br.com.eduardocintra.easy.plusminus;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'plusMinus' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int size = arr.size();
    int positiveCount = 0;
    int negativeCount = 0;
    int zeroCount = 0;

    for (int i = 0; i < size; i++) {
      int x = arr.get(i);
      if (x > 0) positiveCount++;
      if (x < 0) negativeCount++;
      if (x == 0) zeroCount++;
    }

    double positiveRatio = (double) positiveCount / size;
    double negativeRatio = (double) negativeCount / size;
    double zeroRatio = (double) zeroCount / size;
    System.out.printf("%.6f\n", positiveRatio);
    System.out.printf("%.6f\n", negativeRatio);
    System.out.printf("%.6f\n", zeroRatio);
  }
}

public class PlusMinus {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();
    String[] arr = input.split("\\s");

    Result.plusMinus(Arrays.stream(arr).map(Integer::new).collect(toList()));
  }
}
