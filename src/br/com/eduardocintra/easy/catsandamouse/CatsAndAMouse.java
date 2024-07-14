package br.com.eduardocintra.easy.catsandamouse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CatsAndAMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int distanceA = Math.abs(x - z);
        int distanceB = Math.abs(y - z);
        if(distanceA == distanceB) {
            return "Mouse C";
        }
        return distanceA < distanceB ? "Cat A" : "Cat B";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(scanner.nextLine());
        List<String> results = new ArrayList<>();
        for(int i = 0;  i < size; i++) {
            List<Integer> line = Arrays.stream(scanner.nextLine().split("\\s")).map(Integer::parseInt).collect(Collectors.toList());
            results.add(catAndMouse(line.get(0), line.get(1), line.get(2)));
        }
        results.forEach(System.out::println);
    }
}
