package br.com.eduardocintra.easy.subarraydivision;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Result {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int numberOfWays = 0;

        for(int i = 0; i < s.size(); i++) {
            int sum = 0;
            for(int j = 0; j < m; j++) {
                int position = i+j;
                if(position < s.size())
                    sum += s.get(position);
            }

            if(sum == d) numberOfWays++;
        }

        return numberOfWays;
    }

}

public class SubarrayDivision {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s")).map(Integer::parseInt).collect(Collectors.toList());
        if(size != numbers.size()) {
            throw new InvalidParameterException("Size of array is invalid!");
        }
        List<Integer> parameters = Arrays.stream(sc.nextLine().split("\\s")).map(Integer::parseInt).collect(Collectors.toList());
        int d = parameters.get(0);
        int m = parameters.get(1);
        System.out.println(Result.birthday(numbers, d, m));
    }
}
