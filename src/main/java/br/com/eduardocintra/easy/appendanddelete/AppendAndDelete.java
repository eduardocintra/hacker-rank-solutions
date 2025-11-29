package br.com.eduardocintra.easy.appendanddelete;

import java.io.*;

class Result {

  /*
   * Complete the 'appendAndDelete' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts following parameters:
   *  1. STRING s
   *  2. STRING t
   *  3. INTEGER k
   */

  public static String appendAndDelete(String s, String t, int k) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */

    // If the strings are equal and the number of operations is even, it's possible to transfor t s
    // into t  in exactly k operations
    if (s.equalsIgnoreCase(t) && k % 2 == 0) return "Yes";

    // If the number of operations is greater than the total string length and the difference plus 1
    // is even, it's possible to transform s into t in exactly k operations.
    int totalStringLength = s.length() + t.length();
    if (k > totalStringLength && (totalStringLength - k + 1) % 2 == 0) return "Yes";

    int countEqual = 0;
    int minLength = Math.min(s.length(), t.length());
    for (int i = 0; i < minLength; i++) {
      if (s.charAt(i) == t.charAt(i)) {
        countEqual++;
      } else {
        break;
      }
    }

    int charsToRemoveFromS = s.length() - countEqual;
    int charsToAddToT = t.length() - countEqual;

    int total = charsToRemoveFromS + charsToAddToT;
    int diference = k - total;

    // If the total number of operations is equal to k or the difference is even, it's possible to
    // transform s into t in exactly k operations.
    return total == k || diference > 0 && diference % 2 == 0 ? "Yes" : "No";
  }
}

public class AppendAndDelete {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    String s = bufferedReader.readLine();

    String t = bufferedReader.readLine();

    int k = Integer.parseInt(bufferedReader.readLine().trim());

    String result = Result.appendAndDelete(s, t, k);

    bufferedWriter.write(result);
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
