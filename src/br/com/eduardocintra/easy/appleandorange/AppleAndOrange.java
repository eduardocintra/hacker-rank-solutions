import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'countApplesAndOranges' function below.
   *
   * The function accepts following parameters:
   *  1. INTEGER s
   *  2. INTEGER t
   *  3. INTEGER a
   *  4. INTEGER b
   *  5. INTEGER_ARRAY apples
   *  6. INTEGER_ARRAY oranges
   */

  public static void countApplesAndOranges(
      int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    long amountApples =
        apples.stream()
            .filter(
                position -> {
                  return position + a >= s && position + a <= t;
                })
            .count();

    long amountOranges =
        oranges.stream()
            .filter(
                position -> {
                  return position + b <= t && position + b >= s;
                })
            .count();

    System.out.println(amountApples);
    System.out.println(amountOranges);
  }
}

public class AppleAndOrange {
  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

    String firstLine = sc.nextLine();
    String[] stringsFirstLine = firstLine.split("\\s");
    int l = Integer.parseInt(stringsFirstLine[0]);
    int t = Integer.parseInt(stringsFirstLine[1]);

    String secondLine = sc.nextLine();
    String[] stringsSecondLine = secondLine.split("\\s");
    int a = Integer.parseInt(stringsSecondLine[0]);
    int b = Integer.parseInt(stringsSecondLine[1]);

    String thirdLine = sc.nextLine();
    String[] stringsThirdLine = thirdLine.split("\\s");
    int m = Integer.parseInt(stringsThirdLine[0]);
    int n = Integer.parseInt(stringsThirdLine[1]);

    String fourthLine = sc.nextLine();
    String[] stringsFourthLine = fourthLine.split("\\s");
    if (m != stringsFourthLine.length) {
      throw new InvalidParameterException("Invalid size of m array");
    }
    List<Integer> apples = Arrays.stream(stringsFourthLine).map(Integer::new).collect(toList());

    String fifthLine = sc.nextLine();
    String[] stringsFifthLine = fifthLine.split("\\s");
    if (n != stringsFifthLine.length) {
      throw new InvalidParameterException("Invalid size of n array");
    }
    List<Integer> oranges = Arrays.stream(stringsFifthLine).map(Integer::new).collect(toList());

    Result.countApplesAndOranges(l, t, a, b, apples, oranges);
  }
}
