package br.com.eduardocintra.medium.xorsequence;

import java.io.*;
import java.util.*;

public class XorSequenceTimeExceeded {

    // Complete the xorSequence function below.
    static long xorSequence(long l, long r) {
        r += 1;

        List<Long> generatedList = buildArray(r);
        List<Long> subList = getSubList(generatedList, l, r);

        long acumulator = 0;
        for (long j : subList) {
            acumulator = acumulator ^ j;
        }
        return acumulator;

    }

    public static <T> List<T> getSubList(List<T> list, long fromIndexLong, long toIndexLong) {
        if (fromIndexLong > Integer.MAX_VALUE || toIndexLong > Integer.MAX_VALUE ||
                fromIndexLong < Integer.MIN_VALUE || toIndexLong < Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Index out of bounds for int conversion.");
        }

        int fromIndex = (int) fromIndexLong;
        int toIndex = (int) toIndexLong;

        return list.subList(fromIndex, toIndex);
    }
    private static ArrayList<Long> buildArray(long size) {
        ArrayList<Long> a = new ArrayList<>();
        a.add(0L);
        for (int x = 1; x < size; x++) {
            a.add(a.get(x-1) ^ x);
        }
        return a;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String input = scanner.nextLine();
        String[] arr = input.split("\\s");
        System.out.println(xorSequence(new Long(arr[0]), new Long(arr[1])));
    }
}
