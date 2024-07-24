package br.com.eduardocintra.easy.jumpingonthecloudsrevisited;

import java.io.*;
import java.util.*;

public class JumpingOnTheCloudsRevisited {

  // Complete the jumpingOnClouds function below.
  static int jumpingOnClouds(int[] c, int k) {
    int position = 0;
    int size = c.length;
    int lastPosition = size - 1;
    int energy = 100;
    do {
      position += k;
      if (position > lastPosition) {
        position = position % size;
      }
      int cloudType = c[position];
      energy -= cloudType == 1 ? 3 : 1;
    } while (position != 0);
    return energy;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] nk = scanner.nextLine().split(" ");

    int n = Integer.parseInt(nk[0]);

    int k = Integer.parseInt(nk[1]);

    int[] c = new int[n];

    String[] cItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      int cItem = Integer.parseInt(cItems[i]);
      c[i] = cItem;
    }

    int result = jumpingOnClouds(c, k);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}
