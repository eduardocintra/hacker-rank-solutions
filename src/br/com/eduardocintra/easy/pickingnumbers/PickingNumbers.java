package br.com.eduardocintra.easy.pickingnumbers;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'pickingNumbers' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY a as parameter.
   */

  public static int pickingNumbers(List<Integer> a) {
    // Write your code here
    Collections.sort(a);
    List<Integer> sub = new ArrayList<>();
    int i = 0;
    int maxSize = 0;
    while (i < a.size()) {

      int number = a.get(i);

      if (isValidNumber(sub, number)) {
        sub.add(number);
        i++;
      } else {
        maxSize = Math.max(maxSize, sub.size());
        sub = new ArrayList<>();
      }

      maxSize = Math.max(maxSize, sub.size());
    }
    return maxSize;
  }

  private static boolean isValidNumber(List<Integer> subList, int numberTest) {
    if (subList.isEmpty()) return true;
    int firstNumber = subList.get(0);
    return Math.abs(firstNumber - numberTest) <= 1;
  }
}

public class PickingNumbers {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int size = Integer.parseInt(sc.nextLine());
    List<Integer> a =
        Arrays.stream(sc.nextLine().split("\\s")).map(Integer::parseInt).collect(toList());
    if (size != a.size()) {
      throw new InvalidParameterException("The size of array is invalid");
    }
    System.out.println(Result.pickingNumbers(a));
  }
}
