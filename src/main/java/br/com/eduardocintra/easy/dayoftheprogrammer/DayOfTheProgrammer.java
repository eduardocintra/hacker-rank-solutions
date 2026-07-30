package br.com.eduardocintra.easy.dayoftheprogrammer;

import java.io.*;

class Result {

  /*
   * 020 - Day of the Programmer
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/day-of-the-programmer
   * Solution: src/main/java/br/com/eduardocintra/easy/dayoftheprogrammer/DayOfTheProgrammer.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static String dayOfProgrammer(int year) {

    if (year == 1918) {
      return "26.09.1918";
    }

    boolean julianLeapYear = year <= 1917 && year % 4 == 0;
    boolean gregorianLeapYear =
        year > 1918 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));

    if (julianLeapYear || gregorianLeapYear) {
      return "12.09." + year;
    }

    return "13.09." + year;
  }
}

public class DayOfTheProgrammer {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int year = Integer.parseInt(bufferedReader.readLine().trim());

    String result = Result.dayOfProgrammer(year);

    bufferedWriter.write(result);
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
