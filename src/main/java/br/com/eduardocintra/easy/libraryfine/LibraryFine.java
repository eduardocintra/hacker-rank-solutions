package br.com.eduardocintra.easy.libraryfine;

import java.io.*;

class Result {

  /*
   * Complete the 'libraryFine' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER d1
   *  2. INTEGER m1
   *  3. INTEGER y1
   *  4. INTEGER d2
   *  5. INTEGER m2
   *  6. INTEGER y2
   */
  public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    if (y1 > y2) {
      return 10000;
    }
    if (m1 > m2 && y1 == y2) {
      return (m1 - m2) * 500;
    }
    if (d1 > d2 && m1 == m2 && y1 == y2) {
      return (d1 - d2) * 15;
    }
    return 0;
  }
}

public class LibraryFine {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int d1 = Integer.parseInt(firstMultipleInput[0]);

    int m1 = Integer.parseInt(firstMultipleInput[1]);

    int y1 = Integer.parseInt(firstMultipleInput[2]);

    String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int d2 = Integer.parseInt(secondMultipleInput[0]);

    int m2 = Integer.parseInt(secondMultipleInput[1]);

    int y2 = Integer.parseInt(secondMultipleInput[2]);

    int result = Result.libraryFine(d1, m1, y1, d2, m2, y2);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
