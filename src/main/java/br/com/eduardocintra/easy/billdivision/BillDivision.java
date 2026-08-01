package br.com.eduardocintra.easy.billdivision;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

class Result {

  /*
   * 021 - Bill Division
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/bon-appetit/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/billdivision/BillDivision.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static void bonAppetit(List<Integer> bill, int k, int b) {

    int total = 0;
    for (Integer value : bill) {
      total += value;
    }

    int annaShare = (total - bill.get(k)) / 2;
    if (annaShare == b) {
      System.out.println("Bon Appetit");
      return;
    }

    System.out.println(b - annaShare);
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
