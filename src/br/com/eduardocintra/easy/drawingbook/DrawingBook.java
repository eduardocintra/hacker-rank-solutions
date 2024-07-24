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

    // Fix number of page when is an even number of pages
    if (n % 2 == 0) n += 1;
    int costStartToEnd = p / 2;
    int costEndToStart = (n - p) / 2;
    return Math.min(costStartToEnd, costEndToStart);
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
