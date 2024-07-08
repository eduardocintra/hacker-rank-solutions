package br.com.eduardocintra.easy.staircase;

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
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for(int k = 0;  k <i; k++) {
                if(k == 0) printSpaces(n-i);
                System.out.print("#");
            }
            System.out.println();
        }
    }

    private static void printSpaces(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

}
public class Staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        Result.staircase(size);
    }
}
