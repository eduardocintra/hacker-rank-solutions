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
    int beautifulDayCount = 0;
    for(; i <= j; i++) {
      int reversed = reverseNumber(i);
      if((i - reversed) % k == 0) {
        beautifulDayCount++;
      }

    }
    return beautifulDayCount;
  }

  public static int reverseNumber(int x) {
    int reversed = 0;
    while(x > 0) {
      int digit = x % 10;
      reversed = reversed * 10 + digit;
      x = x / 10;
    }
    return reversed;
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
