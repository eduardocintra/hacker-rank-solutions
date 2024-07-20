package br.com.eduardocintra.easy.timeconversion;

import java.io.IOException;
import java.util.Scanner;

class Result {

  /*
   * Complete the 'timeConversion' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts STRING s as parameter.
   */

  public static String timeConversion(String s) {
    String format = s.replaceAll("[^APM]", "");
    String timeWithoutFormat = s.replaceAll("[APM]", "");
    String[] aTime = timeWithoutFormat.split(":");
    int hour = Integer.parseInt(aTime[0]);
    if (format.equalsIgnoreCase("PM") && hour != 12) hour += 12;
    if (format.equalsIgnoreCase("AM") && hour == 12) hour = 0;

    return String.format("%02d", hour) + ":" + aTime[1] + ":" + aTime[2];
  }
}

public class TimeConversion {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    System.out.println(Result.timeConversion(input));
  }
}
