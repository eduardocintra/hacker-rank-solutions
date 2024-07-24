package br.com.eduardocintra.easy.beautifuldaysatthemovies;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Result {

  /*
   * Complete the 'beautifulDays' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER i
   *  2. INTEGER j
   *  3. INTEGER k
   */

  public static int beautifulDays(int i, int j, int k) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    int beautifulDaysCount = 0;
    for (; i <= j; i++) {
      int difference = i - reverseNumber(i);
      if (difference % k == 0) {
        beautifulDaysCount++;
      }
    }

    return beautifulDaysCount;
  }

  private static int reverseNumber(int number) {
    String numberStr = Integer.toString(number);
    StringBuilder sb = new StringBuilder(numberStr);
    return Integer.valueOf(sb.reverse().toString());
  }
}

public class BeautifulDaysAtTheMovies {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    List<Integer> parameters =
        Arrays.stream(sc.nextLine().split("\\s"))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    int i = parameters.get(0);
    int j = parameters.get(1);
    int k = parameters.get(2);
    System.out.println(Result.beautifulDays(i, j, k));
  }
}
