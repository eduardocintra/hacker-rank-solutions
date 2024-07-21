package br.com.eduardocintra.easy.plusminus;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.text.*;
import java.util.*;
import java.util.stream.*;

class Result {

  /*
   * Complete the 'plusMinus' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int size = arr.size();
    int positiveCount = 0;
    int negativeCount = 0;
    int zeroCount = 0;

    for(int i = 0; i < size; i++) {
      int x = arr.get(i);
      if(x > 0) positiveCount++;
      if(x < 0) negativeCount++;
      if(x == 0) zeroCount++;
    }

    double positiveRatio =  (double) positiveCount / size;
    double negativeRatio =  (double) negativeCount / size;
    double zeroRatio = (double) zeroCount / size;
    DecimalFormat df = new DecimalFormat("#.######");
    System.out.println(df.format(positiveRatio));
    System.out.println(df.format(negativeRatio));
    System.out.println(df.format(zeroRatio));
  }

}

public class PlusMinus {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    Result.plusMinus(arr);

    bufferedReader.close();
  }
}
