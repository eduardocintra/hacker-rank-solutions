package br.com.eduardocintra.easy.drawingbook;

import java.io.IOException;
import java.util.Scanner;

class Result {

  /*
   * 023 - Drawing Book
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/drawing-book/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/drawingbook/DrawingBook.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static int pageCount(int n, int p) {
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
