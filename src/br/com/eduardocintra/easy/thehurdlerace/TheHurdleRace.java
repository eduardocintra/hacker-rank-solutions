package br.com.eduardocintra.easy.thehurdlerace;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        height.sort(Collections.reverseOrder());
        int highestObstacle = height.get(0);
        int minimumNumberDoses = highestObstacle - k;
        return Math.max(minimumNumberDoses, 0);
    }

}

public class TheHurdleRace {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<Integer> parameters = Arrays.stream(sc.nextLine().split("\\s")).map(Integer::parseInt).collect(toList());
        int size = parameters.get(0);
        int k = parameters.get(1);
        List<Integer> height = Arrays.stream(sc.nextLine().split("\\s")).map(Integer::parseInt).collect(toList());
        if(size != height.size()) {
            throw new InvalidParameterException("The size of array is invalid");
        }
        System.out.println(Result.hurdleRace(k, height));
    }
}
