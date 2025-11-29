import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

  /*
   * Complete the 'kaprekarNumbers' function below.
   *
   * The function accepts following parameters:
   *  1. INTEGER p
   *  2. INTEGER q
   */
  public static void kaprekarNumbers(int p, int q) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    List<Integer> kaprekarNumber = new ArrayList<>();
    for (; p <= q; p++) {
      long square = (long) p * p;
      String numberStr = Long.toString(square);
      int lenght = numberStr.length();
      int middle = lenght / 2;

      String leftSide = numberStr.substring(0, middle);
      String rightSide = numberStr.substring(middle);

      int a = leftSide.isEmpty() ? 0 : Integer.parseInt(leftSide);
      int b = rightSide.isEmpty() ? 0 : Integer.parseInt(rightSide);
      if (a + b == p) {
        kaprekarNumber.add(p);
      }
    }

    if (kaprekarNumber.isEmpty()) {
      System.out.println("INVALID RANGE");
    } else {
      System.out.println(
          kaprekarNumber.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
  }
}

public class ModifiedKaprekarNumbers {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int p = Integer.parseInt(bufferedReader.readLine().trim());

    int q = Integer.parseInt(bufferedReader.readLine().trim());

    Result.kaprekarNumbers(p, q);

    bufferedReader.close();
  }
}
