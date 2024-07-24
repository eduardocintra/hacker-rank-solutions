package br.com.eduardocintra.easy.maximizingxor;

import java.io.IOException;
import java.util.Scanner;

class Result {

  /*
   * Complete the 'maximizingXor' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER l
   *  2. INTEGER r
   */

  public static int maximizingXor(int l, int r) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    int max = 0;

    for (; l <= r; l++) {
      for (int i = l; i <= r; i++) {
        int xor = l ^ i;
        if (xor > max) max = xor;
      }
    }

    return max;
  }
}

public class MaximizingXor {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int l = Integer.parseInt(sc.nextLine());
    int r = Integer.parseInt(sc.nextLine());
    System.out.println(Result.maximizingXor(l, r));
  }
}
