package br.com.eduardocintra.easy.jumpingontheclouds;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

  /*
   * Complete the 'jumpingOnClouds' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY c as parameter.
   */
  public static int jumpingOnClouds(List<Integer> c) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    int position = 0;
    int jumps = 0;

    while (position < c.size() - 1) {
      int jumpSize = canJumpTo(c, position + 2) ? 2 : 1;
      position += jumpSize;
      jumps++;
    }

    return jumps;
  }

  private static boolean canJumpTo(List<Integer> c, int position) {
    return position <= c.size() - 1 && c.get(position) != 1;
  }
}

public class JumpingOnTheClouds {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> c =
        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    int result = Result.jumpingOnClouds(c);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
