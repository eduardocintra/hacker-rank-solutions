package br.com.eduardocintra.easy.simplearraysum;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

  /*
   * Complete the 'simpleArraySum' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY ar as parameter.
   */

  public static int simpleArraySum(List<Integer> ar) {
    return ar.stream().reduce(0, Integer::sum);
  }
}

public class SimpleArraySum {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int arCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> ar =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    int result = Result.simpleArraySum(ar);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
