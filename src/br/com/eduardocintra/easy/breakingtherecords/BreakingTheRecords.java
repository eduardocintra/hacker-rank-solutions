package br.com.eduardocintra.easy.breakingtherecords;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int minScore = scores.get(0);
        int maxScore = scores.get(0);
        int countMaxScore = 0;
        int countMinScore = 0;

        for(Integer score : scores) {
            if(score > maxScore) {
                countMaxScore++;
                maxScore = score;
            }
            if(score < minScore){
                countMinScore++;
                minScore = score;
            }
        }

        return Arrays.asList(countMaxScore, countMinScore);
    }

}

public class BreakingTheRecords {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());

        String[] scoresStr = sc.nextLine().split("\\s");
        if(size != scoresStr.length) {
            throw new InvalidClassException("Score array size is invalid");
        }
        List<Integer> scores = Arrays.stream(scoresStr).map(Integer::parseInt).collect(toList());
        List<Integer> result = Result.breakingRecords(scores);
        System.out.println(result.stream().map(String::valueOf).collect(joining(" ")));
    }
}