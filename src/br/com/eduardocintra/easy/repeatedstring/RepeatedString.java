package br.com.eduardocintra.easy.repeatedstring;

import java.io.*;

class Result {

  /*
   * Complete the 'repeatedString' function below.
   *
   * The function is expected to return a LONG_INTEGER.
   * The function accepts following parameters:
   *  1. STRING s
   *  2. LONG_INTEGER n
   */
  public static long repeatedString(String s, long n) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    int size = s.length();
    char targetLetter = 'a';
    long countOfTargetLetterInString = countLetter(s, 'a');
    long countRepetitions = n / size;
    int lengthOfRemainingSubstring = (int) (n % size);
    String remainingSubstring = s.substring(0, lengthOfRemainingSubstring);
    return (countRepetitions * countOfTargetLetterInString)
        + countLetter(remainingSubstring, targetLetter);
  }

  private static long countLetter(String str, char c) {
    return str.chars().filter(ch -> ch == c).count();
  }
}

public class RepeatedString {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    String s = bufferedReader.readLine();

    long n = Long.parseLong(bufferedReader.readLine().trim());

    long result = Result.repeatedString(s, n);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
