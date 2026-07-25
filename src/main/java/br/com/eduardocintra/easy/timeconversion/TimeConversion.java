package br.com.eduardocintra.easy.timeconversion;

import java.io.*;

class Result {

  /*
   * 010 - Time Conversion
   * Difficulty: Easy
   *
   * Problem: https://www.hackerrank.com/challenges/time-conversion/problem
   * Solution: src/main/java/br/com/eduardocintra/easy/timeconversion/TimeConversion.java
   *
   * If this code helped you, please leave a ⭐ on:
   * https://github.com/eduardocintra/hacker-rank-solutions
   */
  public static String timeConversion(String s) {
    int hour = Integer.parseInt(s.substring(0, 2));
    String period = s.substring(8);

    if ("PM".equals(period) && hour != 12) {
      hour += 12;
    } else if ("AM".equals(period) && hour == 12) {
      hour = 0;
    }

    return String.format("%02d%s", hour, s.substring(2, 8));
  }
}

public class TimeConversion {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    String s = bufferedReader.readLine();

    String result = Result.timeConversion(s);

    bufferedWriter.write(result);
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
