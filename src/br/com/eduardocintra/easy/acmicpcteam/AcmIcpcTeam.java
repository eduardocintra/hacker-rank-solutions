package br.com.eduardocintra.easy.acmicpcteam;

import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'acmTeam' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts STRING_ARRAY topic as parameter.
   */
  public static List<Integer> acmTeam(List<String> topics) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    int maxTopics = 0;
    int teamCount = 0;
    int numTopics = topics.size();
    BigInteger[] topicBitsets =
        topics.stream().map(str -> new BigInteger(str, 2)).toArray(BigInteger[]::new);

    for (int i = 0; i < numTopics; i++) {
      for (int j = i + 1; j < numTopics; j++) {
        BigInteger combinedTopics = topicBitsets[i].or(topicBitsets[j]);
        int topicsCount = combinedTopics.bitCount();
        if (topicsCount > maxTopics) {
          maxTopics = topicsCount;
          teamCount = 1;
        } else if (topicsCount == maxTopics) {
          teamCount++;
        }
      }
    }
    return Arrays.asList(maxTopics, teamCount);
  }
}

public class AcmIcpcTeam {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int n = Integer.parseInt(firstMultipleInput[0]);

    int m = Integer.parseInt(firstMultipleInput[1]);

    List<String> topic =
        IntStream.range(0, n)
            .mapToObj(
                i -> {
                  try {
                    return bufferedReader.readLine();
                  } catch (IOException ex) {
                    throw new RuntimeException(ex);
                  }
                })
            .collect(toList());

    List<Integer> result = Result.acmTeam(topic);

    bufferedWriter.write(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

    bufferedReader.close();
    bufferedWriter.close();
  }
}
