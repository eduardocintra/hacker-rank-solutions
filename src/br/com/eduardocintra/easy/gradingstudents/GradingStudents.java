package br.com.eduardocintra.easy.gradingstudents;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        return grades.stream().map(Result::calculateGrade).collect(toList());
    }

    private static Integer calculateGrade(Integer grade) {
        if (grade < 38 ) return grade;
        int originalGrade = grade;
        while(grade % 5 != 0) {
            grade++;
        }
        return grade - originalGrade < 3 ? grade : originalGrade;
    }

}

public class GradingStudents {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int amout = Integer.parseInt(sc.nextLine());
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < amout; i++) {
            numbers.add(Integer.parseInt(sc.nextLine()));
        }
        Result.gradingStudents(numbers).forEach(System.out::println);
    }
}
