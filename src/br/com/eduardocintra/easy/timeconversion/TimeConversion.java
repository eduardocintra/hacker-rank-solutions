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
    String ampm = s.substring(s.length() - 2);
    String timePart = s.replace(ampm, "");
    String[] aTime = timePart.split(":");
    int hour = Integer.parseInt(aTime[0]);

    boolean shouldAddTwelveHours = (ampm.equalsIgnoreCase("PM") && hour != 12) ||
            (ampm.equalsIgnoreCase("AM") && hour == 12);
    if (shouldAddTwelveHours) {
      hour += 12;
    }

    if (hour == 24) {
      hour = 0;
    }
    return String.format("%02d:%s:%s", hour, aTime[1], aTime[2]);
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
