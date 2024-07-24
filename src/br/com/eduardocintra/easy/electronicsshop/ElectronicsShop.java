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
    int moneySpent = -1;
    for (int keyBoardPrice : keyboards) {
      for (int driverPrice : drives) {
        int sum = keyBoardPrice + driverPrice;
        if (sum <= b && sum > moneySpent) {
          moneySpent = sum;
        }
      }
    }

    return moneySpent;
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
