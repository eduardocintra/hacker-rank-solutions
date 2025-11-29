package br.com.eduardocintra.easy.electronicsshop;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ElectronicsShop {

  /*
   * Complete the getMoneySpent function below.
   */
  static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    int max = -1;
    Arrays.sort(drives);

    for (int keyboardPrice : keyboards) {
      int diff = b - keyboardPrice;
      if (diff < 0) {
        continue;
      }

      int low = 0;
      int high = drives.length - 1;

      while (low <= high) {
        int mid = (low + high) / 2;
        if (drives[mid] <= diff) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }

      if (high >= 0) {
        max = Math.max(max, (keyboardPrice + drives[high]));
      }
    }

    return max;
  }

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int[] firstLine =
        Arrays.stream(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
    int[] keyboards =
        Arrays.stream(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
    int[] drives = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
    int b = firstLine[0];
    System.out.println(getMoneySpent(keyboards, drives, b));
  }
}
