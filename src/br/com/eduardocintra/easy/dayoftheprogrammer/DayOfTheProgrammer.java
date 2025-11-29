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
    // Transition from the Julian to Gregorian calendar
    if (year == 1918) {
      return "26.09." + year;
    }

    boolean isJulianCalendar = year <= 1917;
    boolean isGregorianCalendar = year >= 1919;

    boolean isJulianLeapYear = isJulianCalendar && year % 4 == 0;
    boolean isGregorianLeapYear =
        isGregorianCalendar && (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    boolean isLeapYear = isJulianLeapYear || isGregorianLeapYear;

    return (isLeapYear ? "12.09." : "13.09.") + year;
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
