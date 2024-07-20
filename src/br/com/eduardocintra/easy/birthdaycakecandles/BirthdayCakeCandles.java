package br.com.eduardocintra.easy.birthdaycakecandles;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'birthdayCakeCandles' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY candles as parameter.
   */

  public static int birthdayCakeCandles(List<Integer> candles) {
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
    Scanner sc = new Scanner(System.in);

    int size = Integer.parseInt(sc.nextLine());

    String input = sc.nextLine();
    String[] arr = input.split("\\s");

    if (size != arr.length) {
      throw new InvalidParameterException("Amount of elements inputed are invalids");
    }

    int result = Result.birthdayCakeCandles(Arrays.stream(arr).map(Integer::new).collect(toList()));
    System.out.println(result);
  }
}
