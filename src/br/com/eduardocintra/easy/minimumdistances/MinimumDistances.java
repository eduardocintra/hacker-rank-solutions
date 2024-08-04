package br.com.eduardocintra.easy.minimumdistances;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

  /*
   * Complete the 'minimumDistances' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY a as parameter.
   */
  public static int minimumDistances(List<Integer> a) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    List<Integer> distances = new ArrayList<>();
    for (int i = 0; i < a.size(); i++) {
      int firstPair = a.get(i);
      for (int j = i + 1; j < a.size(); j++) {
        int secondPair = a.get(j);

        if (firstPair == secondPair) {
          distances.add(j - i);
        }
      }
    }
    return distances.isEmpty() ? -1 : Collections.min(distances);
  }
}

public class MinimumDistances {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> a =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    int result = Result.minimumDistances(a);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
