package br.com.eduardocintra.easy.diagonaldifference;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'diagonalDifference' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts 2D_INTEGER_ARRAY arr as parameter.
   */

  public static int diagonalDifference(List<List<Integer>> arr) {

    int leftToRighDiagonalSum = 0;
    int rightToLeftDiagonalSum = 0;
    //        for(int l = 0; l < arr.size(); l++) {
    //            for(int c = 0; c < arr.get(0).size(); c++) {
    //                if(l == c) {
    //                    leftToRighDiagonalSum += arr.get(l).get(c);
    //                }
    //                if(c == (arr.get(l).size() - (l + 1))) {
    //                    rightToLeftDiagonalSum += arr.get(l).get(c);
    //                }
    //            }
    //        }
    //

    // Improved version reducing algorithm complexity
    for (int i = 0; i < arr.size(); i++) {
      leftToRighDiagonalSum += arr.get(i).get(i);
      rightToLeftDiagonalSum += arr.get(i).get(arr.get(i).size() - i - 1);
    }
    return Math.abs(leftToRighDiagonalSum - rightToLeftDiagonalSum);
  }
}

public class DiagonalDifference {
  public static void main(String[] args) throws IOException {

    List<Integer> l1 = Arrays.asList(11, 2, 4);
    List<Integer> l2 = Arrays.asList(4, 5, 6);
    List<Integer> l3 = Arrays.asList(10, 8, -12);

    List<List<Integer>> list = Arrays.asList(l1, l2, l3);

    System.out.println(Result.diagonalDifference(list));
  }
}
