package br.com.eduardocintra.easy.averybigsum;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        return ar.stream().reduce(0L, Long::sum);
    }

}

public class AVeryBigSum {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());

        String input = sc.nextLine();
        String[] arr = input.split("\\s");

        if(arr.length != size) {
            throw new InvalidParameterException("The size of input is invalid");
        }

        ArrayList<Long> longs = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            longs.add(Long.valueOf(arr[i]));
        }
        System.out.println(Result.aVeryBigSum(longs));

    }
}
