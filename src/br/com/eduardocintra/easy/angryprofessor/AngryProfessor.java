package br.com.eduardocintra.easy.angryprofessor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Result {

  /*
   * Complete the 'angryProfessor' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts following parameters:
   *  1. INTEGER k
   *  2. INTEGER_ARRAY a
   */

  public static String angryProfessor(int k, List<Integer> a) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    int onTimeCount  = 0;
    for(int time: a) {
      if(time <= 0) {
        onTimeCount ++;
      }

      if(onTimeCount >= k) {
        return "NO";
      }
    }
    return "YES";
  }
}

public class AngryProfessor {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int testCasesNumber = Integer.parseInt(sc.nextLine());
    List<String> results = new ArrayList<>();
    for (int i = 0; i < testCasesNumber; i++) {
      List<Integer> parameters =
          Arrays.stream(sc.nextLine().split("\\s"))
              .map(Integer::parseInt)
              .collect(Collectors.toList());
      List<Integer> arrivalTimes =
          Arrays.stream(sc.nextLine().split("\\s"))
              .map(Integer::parseInt)
              .collect(Collectors.toList());
      int k = parameters.get(1);
      results.add(Result.angryProfessor(k, arrivalTimes));
    }
    results.forEach(System.out::println);
  }
}
