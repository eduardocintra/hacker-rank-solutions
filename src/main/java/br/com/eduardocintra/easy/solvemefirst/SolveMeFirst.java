package br.com.eduardocintra.easy.solvemefirst;

import java.util.*;

public class SolveMeFirst {

  /*
   * 001 - Solve Me First
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/solve-me-first/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/solvemefirst/SolveMeFirst.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  static int solveMeFirst(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a;
    a = in.nextInt();
    int b;
    b = in.nextInt();
    int sum;
    sum = solveMeFirst(a, b);
    System.out.println(sum);
  }
}
