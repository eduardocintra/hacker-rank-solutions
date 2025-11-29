package br.com.eduardocintra.easy.pickingnumbers;

import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.*;

class Result {

  /*
   * Complete the 'pickingNumbers' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY a as parameter.
   */

  public static int pickingNumbers(List<Integer> a) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();

    for (Integer number : a) {
      frequency.put(number, frequency.getOrDefault(number, 0) + 1);
    }

    int max = 0;
    for (int number : frequency.keySet()) {
      int count = frequency.get(number) + frequency.getOrDefault(number + 1, 0);
      max = Math.max(max, count);
    }

    return max;
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
