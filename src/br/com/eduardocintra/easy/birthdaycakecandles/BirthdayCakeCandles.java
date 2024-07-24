package br.com.eduardocintra.easy.birthdaycakecandles;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

  /*
   * Complete the 'birthdayCakeCandles' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY candles as parameter.
   */

  public static int birthdayCakeCandles(List<Integer> candles) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    int tallestCandleCount = 0;
    int tallestCandle = 0;
    for (Integer candleHeight : candles) {
      if (candleHeight == tallestCandle) tallestCandleCount++;
      if (candleHeight > tallestCandle) {
        tallestCandle = candleHeight;
        tallestCandleCount = 1;
      }
    }
    ;

    return tallestCandleCount;
  }
}

public class BirthdayCakeCandles {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> candles =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    int result = Result.birthdayCakeCandles(candles);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
