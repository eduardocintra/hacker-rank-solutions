package br.com.eduardocintra.easy.numberlinejumps;

import java.io.*;
import java.util.Scanner;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        if(v1 <= v2) return "NO";
        return (x2-x1) % (v1-v2) == 0 ? "YES" : "NO";
    }

}

public class NumberLineJumps {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] values = line.split("\\s");
        int x1 = Integer.parseInt(values[0]);
        int v1 = Integer.parseInt(values[1]);
        int x2 = Integer.parseInt(values[2]);
        int v2 = Integer.parseInt(values[3]);

        System.out.println(Result.kangaroo(x1,v1,x2,v2));

    }
}
