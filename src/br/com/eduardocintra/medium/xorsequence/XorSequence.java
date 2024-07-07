package br.com.eduardocintra.medium.xorsequence;

import java.io.*;
import java.util.*;

public class XorSequence {

    // Complete the xorSequence function below.
    static long xorSequence(long l, long r) {

        return calculateXor(l-1) ^calculateXor(r);

    }
    private static long calculateXor(long num) {
        long rem = num % 8;

        if (rem == 0 || rem == 1) return num;
        if (rem == 2 || rem == 3) return 2;
        if(rem == 4 || rem == 5) return num + 2;
        return 0;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String input = scanner.nextLine();
        String[] arr = input.split("\\s");
        System.out.println(xorSequence(new Long(arr[0]), new Long(arr[1])));
    }
}
