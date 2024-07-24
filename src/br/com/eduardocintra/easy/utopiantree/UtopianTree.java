package br.com.eduardocintra.easy.utopiantree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

  /*
   * Complete the 'utopianTree' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER n as parameter.
   */

  public static int utopianTree(int n) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    int height = 1;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        height += 1;
      } else {
        height *= 2;
      }
    }
    return height;
  }
}

public class UtopianTree {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int size = Integer.parseInt(sc.nextLine());
    List<Integer> cases = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      cases.add(Integer.parseInt(sc.nextLine()));
    }
    cases.stream().map(Result::utopianTree).forEach(System.out::println);
  }
}
