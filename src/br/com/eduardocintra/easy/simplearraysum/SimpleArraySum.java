package br.com.eduardocintra.easy.simplearraysum;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        return ar.stream().reduce(0, Integer::sum);

    }

}

public class SimpleArraySum {


    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int size = Integer.parseInt(sc.nextLine());

       String input = sc.nextLine();
       String[] arr = input.split("\\s");

       if(arr.length != size) {
           throw new InvalidParameterException("The size of input is invalid");
       }

       ArrayList<Integer> ints = new ArrayList<>();
       for(int i = 0; i < arr.length; i++) {
           ints.add(Integer.valueOf(arr[i]));
       }
        System.out.println(Result.simpleArraySum(ints));

    }
}
