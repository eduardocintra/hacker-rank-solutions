package br.com.eduardocintra.easy.finddigits;

import java.io.*;
import java.util.stream.*;

class Result {

  /*
   * Complete the 'findDigits' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER n as parameter.
   */

  public static int findDigits(int n) {
    // Write your code here
    String nStr = String.valueOf(n);
    int count = 0;
    for (int k = 0; k < nStr.length(); k++) {
      int number = nStr.charAt(k) - '0';
      if (number > 0 && n % number == 0) count++;
    }
    return count;
  }
}

public class FindDigits {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, t)
        .forEach(
            tItr -> {
              try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.findDigits(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
              } catch (IOException ex) {
                throw new RuntimeException(ex);
              }
            });

    bufferedReader.close();
    bufferedWriter.close();
  }
}
