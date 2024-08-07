package br.com.eduardocintra.easy.halloweensale;

import java.io.*;

class Result {

  /*
   * Complete the 'howManyGames' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER p
   *  2. INTEGER d
   *  3. INTEGER m
   *  4. INTEGER s
   */
  public static int howManyGames(int p, int d, int m, int s) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    if (p > s) return 0;
    int amountOfGames = 0;
    while (m <= p && p <= s) {
      s -= p;
      p -= d;
      amountOfGames++;
    }
    if (s > 0 && p <= m) {
      amountOfGames += s / m;
    }
    return amountOfGames;
  }
}

public class HalloweenSale {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int p = Integer.parseInt(firstMultipleInput[0]);

    int d = Integer.parseInt(firstMultipleInput[1]);

    int m = Integer.parseInt(firstMultipleInput[2]);

    int s = Integer.parseInt(firstMultipleInput[3]);

    int answer = Result.howManyGames(p, d, m, s);

    bufferedWriter.write(String.valueOf(answer));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
