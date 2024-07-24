package br.com.eduardocintra.easy.sequenceequation;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

  /*
   * Complete the 'permutationEquation' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts INTEGER_ARRAY p as parameter.
   */

  public static List<Integer> permutationEquation(List<Integer> p) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    int size = p.size();
    List<Integer> finalArray = new ArrayList<>();
    for (int x = 1; x <= size; x++) {
      for (int y = 1; y <= size; y++) {
        int pValue = p.get(y - 1);
        int pp = p.get(pValue - 1);
        if (pp == x) {
          finalArray.add(y);
          break;
        }
      }
    }
    return finalArray;
  }
}

public class SequenceEquation {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> p =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    List<Integer> result = Result.permutationEquation(p);

    bufferedWriter.write(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

    bufferedReader.close();
    bufferedWriter.close();
  }
}
