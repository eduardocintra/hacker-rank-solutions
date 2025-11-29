package br.com.eduardocintra.easy.solvemefirst;

import java.util.*;

public class SolveMeFirst {
  static int solveMeFirst(int a, int b) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
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
