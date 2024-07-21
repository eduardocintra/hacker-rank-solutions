package br.com.eduardocintra.easy.timeconversion;

import java.io.*;

import static java.util.stream.Collectors.joining;

class Result {

  /*
   * Complete the 'timeConversion' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts STRING s as parameter.
   */
  public static String timeConversion(String s) {
    String format = s.replaceAll("[^APM]", "");
    String sWithoutFormat = s.replaceAll("[APM]", "");
    String[] aTime = sWithoutFormat.split(":");
    int hour = Integer.parseInt(aTime[0]);
    if (format.equalsIgnoreCase("PM") && hour != 12) hour += 12;
    if (format.equalsIgnoreCase("AM") && hour == 12) hour = 0;
    return String.format("%02d", hour) + ":" + aTime[1] + ":" + aTime[2];
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
