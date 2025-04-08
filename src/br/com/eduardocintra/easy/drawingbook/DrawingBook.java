package br.com.eduardocintra.easy.drawingbook;

import java.io.IOException;
import java.util.Scanner;

class Result {

  /*
   * Complete the 'pageCount' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. INTEGER p
   */

  public static int pageCount(int n, int p) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    int fromFront = p / 2;
    int fromBack = n / 2 - p / 2;
    return Math.min(fromFront, fromBack);
  }
}

public class DrawingBook {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int p = Integer.parseInt(sc.nextLine());
    System.out.println(Result.pageCount(n, p));
  }
}
