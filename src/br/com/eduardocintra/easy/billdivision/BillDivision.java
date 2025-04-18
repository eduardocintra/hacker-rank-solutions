package br.com.eduardocintra.easy.billdivision;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'bonAppetit' function below.
   *
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY bill
   *  2. INTEGER k
   *  3. INTEGER b
   */

  public static void bonAppetit(List<Integer> bill, int k, int b) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    int totalShared = 0;
    for(Integer value:bill) {
      totalShared += value;
    }

    int anaPart = (totalShared - bill.get(k)) / 2;
    System.out.println(anaPart == b ? "Bon Appetit" : (b-anaPart));
  }
}

public class BillDivision {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    List<Integer> firstLine =
        Arrays.stream(sc.nextLine().split("\\s")).map(Integer::parseInt).collect(toList());
    int size = firstLine.get(0);
    int indexAnaDoesntEat = firstLine.get(1);
    List<Integer> items =
        Arrays.stream(sc.nextLine().split("\\s")).map(Integer::parseInt).collect(toList());
    if (size != items.size()) {
      throw new InvalidParameterException("Size of the array is invalid");
    }
    int amountMoney = Integer.parseInt(sc.nextLine());
    Result.bonAppetit(items, indexAnaDoesntEat, amountMoney);
  }
}
