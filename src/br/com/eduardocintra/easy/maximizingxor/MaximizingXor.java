package br.com.eduardocintra.easy.maximizingxor;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

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
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter =
        new BufferedWriter(new OutputStreamWriter(System.out));

    int l = Integer.parseInt(bufferedReader.readLine().trim());

    int r = Integer.parseInt(bufferedReader.readLine().trim());

    int result = Result.maximizingXor(l, r);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
