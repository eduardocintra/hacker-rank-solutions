package br.com.eduardocintra.easy.gradingstudents;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'gradingStudents' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts INTEGER_ARRAY grades as parameter.
   */

  public static List<Integer> gradingStudents(List<Integer> grades) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    return grades.stream().map(originalNumber -> {
      if( originalNumber < 38) {
        return originalNumber;
      }
      Integer roundedNumber = getNextMultipleOfFive(originalNumber);
      boolean isDifferenceLessThanThree = (roundedNumber - originalNumber) < 3;
      return isDifferenceLessThanThree ? roundedNumber : originalNumber;
    }).collect(Collectors.toList());
  }

  public static Integer getNextMultipleOfFive(Integer number) {
    while(number % 5 != 0) {
      number++;
    }
    return number;
  }
}

public class GradingStudents {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> grades =
        IntStream.range(0, gradesCount)
            .mapToObj(
                i -> {
                  try {
                    return bufferedReader.readLine().replaceAll("\\s+$", "");
                  } catch (IOException ex) {
                    throw new RuntimeException(ex);
                  }
                })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

    List<Integer> result = Result.gradingStudents(grades);

    bufferedWriter.write(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

    bufferedReader.close();
    bufferedWriter.close();
  }
}
