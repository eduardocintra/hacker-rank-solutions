package br.com.eduardocintra.easy.staircase;

import java.io.*;

class Result {

  /*
   * Complete the 'staircase' function below.
   *
   * The function accepts INTEGER n as parameter.
   */

  public static void staircase(int n) {
    for (int i = 1; i <= n; i++) {
      for(int k = 0;  k <i; k++) {
        if(k == 0) printSpaces(n-i);
        System.out.print("#");
      }
      System.out.println();
    }
  }

  private static void printSpaces(int n) {
    for(int i = 0; i < n; i++) {
      System.out.print(" ");
    }
  }
}

public class Staircase {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    Result.staircase(n);

    bufferedReader.close();
  }
}
