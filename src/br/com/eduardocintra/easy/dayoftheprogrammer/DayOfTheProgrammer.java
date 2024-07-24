package br.com.eduardocintra.easy.dayoftheprogrammer;

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
   * Complete the 'dayOfProgrammer' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts INTEGER year as parameter.
   */

  public static String dayOfProgrammer(int year) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    int daysRemaining = 256;
    int month = 0;
    while (daysRemaining >= 30) {
      month++;
      daysRemaining -= getNumberOfDays(month, year);
    }
    return String.format("%02d.%02d.%04d", daysRemaining, month + 1, year);
  }

  private static int getFebruaryNumberOfDays(int year) {
    if (year == 1918) return 15;
    if (year > 1917 && year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) return 29;
    if (year < 1917 && year % 4 == 0) return 29;
    return 28;
  }

  private static int getNumberOfDays(int month, int year) {
    switch (month) {
      case 1:
        return 31;
      case 2:
        return getFebruaryNumberOfDays(year);
      case 3:
        return 31;
      case 4:
        return 30;
      case 5:
        return 31;
      case 6:
        return 30;
      case 7:
        return 31;
      case 8:
        return 31;
      case 9:
        return 30;
      default:
        return 0;
    }
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
