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
    boolean isAmHour = s.endsWith("AM");
    String[] time = s.substring(0, 8).split(":");
    int hour = Integer.parseInt(time[0]);
    if (isAmHour && hour == 12) hour = 0;
    if (!isAmHour && hour != 12) hour += 12;

    return String.format("%02d:%s:%s", hour, time[1], time[2]);
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
