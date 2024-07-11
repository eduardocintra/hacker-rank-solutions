package br.com.eduardocintra.easy.betweentwosets;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int lastItemArrayA = Collections.max(a);
        int lastItemArrayB = Collections.max(b);
        int counter = 0;
        for(int i = lastItemArrayA; i <= lastItemArrayB; i++) {
                if(areFactorsOf(a, i) && areAllMultiplesOf(b, i)) {
                    counter++;
                }
        }
        return counter;
    }

    private static boolean areFactorsOf(List<Integer> list, int number) {
        return list.stream().allMatch(item -> number % item == 0);
    }

    private static boolean areAllMultiplesOf(List<Integer> list, int number) {
        return list.stream().allMatch(item -> item %number == 0);
    }

}

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] firstLine = sc.nextLine().split("\\s");
        int sizeArrayA = Integer.parseInt(firstLine[0]);
        int sizeArrayb = Integer.parseInt(firstLine[1]);

        String[] strArrayA = sc.nextLine().split("\\s");
        List<Integer> arrayA = Arrays.stream(strArrayA).map(Integer::parseInt).collect(toList());
        if(sizeArrayA != arrayA.size()) {
            throw new InvalidParameterException("Invalid size of array a");
        }


        String[] strArrayB = sc.nextLine().split("\\s");
        List<Integer> arrayB = Arrays.stream(strArrayB).map(Integer::parseInt).collect(toList());
        if(sizeArrayb != arrayB.size()) {
            throw new InvalidParameterException("Invalid size of array b");
        }

        System.out.println(Result.getTotalX(arrayA, arrayB));

    }
}
