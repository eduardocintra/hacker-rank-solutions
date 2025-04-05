package br.com.eduardocintra.easy.salesbymatch;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Result {

  /*
   * Complete the 'sockMerchant' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. INTEGER_ARRAY ar
   */

  public static int sockMerchant(int n, List<Integer> ar) {
    /*
     * Please, if this code helps you, leave your star on the repository:
     * https://github.com/eduardocintra/hacker-rank-solutions
     */
    Set<Integer> pairs = new HashSet<>();
    int totalPairs = 0;
    for(int color: ar) {
      if(pairs.contains(color)) {
        totalPairs++;
        pairs.remove(color);
      } else {
        pairs.add(color);
      }
    }
    return totalPairs;
  }
}

public class SalesByMatch {
  public static void main(String[] args) throws IOException {
    System.out.println(Result.sockMerchant(7, Arrays.asList(1, 2, 1, 2, 1, 3, 2)));
  }
}
