package br.com.eduardocintra.easy.timeconversion;

import java.io.*;

class Result {

  /*
   * Complete the 'timeConversion' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts STRING s as parameter.
   */
  public static String timeConversion(String s) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
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
