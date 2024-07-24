package br.com.eduardocintra.easy.designerpdfviewer;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Result {

  /*
   * Complete the 'designerPdfViewer' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER_ARRAY h
   *  2. STRING word
   */

  public static int designerPdfViewer(List<Integer> h, String word) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    List<Integer> letterHeights =
        word.chars().boxed().map(c -> h.get(c - 97)).collect(Collectors.toList());
    int maxHeight = Collections.max(letterHeights);
    return word.length() * maxHeight;
  }
}

public class DesignerPdfViewer {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    List<Integer> h =
        Arrays.stream(sc.nextLine().split("\\s"))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    String word = sc.nextLine();
    System.out.println(Result.designerPdfViewer(h, word));
  }
}
