package br.com.eduardocintra.easy.sherlockandsquares;

import java.io.*;
import java.util.stream.*;

class Result {

  /*
   * Complete the 'squares' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER a
   *  2. INTEGER b
   */

  public static int squares(int a, int b) {
    // Write your code here
    a = (int) Math.ceil(Math.sqrt(a));
    b = (int) Math.floor(Math.sqrt(b));
    return b - a + 1;
  }

}

public class SherlockAndSquares {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int q = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, q)
        .forEach(
            qItr -> {
              try {
                String[] firstMultipleInput =
                    bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int a = Integer.parseInt(firstMultipleInput[0]);

                int b = Integer.parseInt(firstMultipleInput[1]);

                int result = Result.squares(a, b);

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
