package br.com.eduardocintra.easy.cutthesticks;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

  /*
   * Complete the 'cutTheSticks' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts INTEGER_ARRAY arr as parameter.
   */
  public static List<Integer> cutTheSticks(List<Integer> arr) {
    List<Integer> numberOfSticks = new ArrayList<>();
    while (!arr.isEmpty()) {
      int min = Collections.min(arr);
      numberOfSticks.add(arr.size());
      ListIterator<Integer> iterator = arr.listIterator();
      while (iterator.hasNext()) {
        Integer item = iterator.next();
        if (item == min) {
          iterator.remove();
        } else {
          iterator.set(item - min);
        }
      }
    }
    return numberOfSticks;
  }
}

public class CutTheSticks {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    List<Integer> result = Result.cutTheSticks(arr);

    bufferedWriter.write(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

    bufferedReader.close();
    bufferedWriter.close();
  }
}
