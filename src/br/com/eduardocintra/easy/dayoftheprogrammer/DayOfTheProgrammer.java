package br.com.eduardocintra.easy.dayoftheprogrammer;

import java.io.IOException;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        // Write your code here
        int daysRemaining = 256;
        int month = 0;
        while(daysRemaining >= 30) {
            month++;
            daysRemaining -= getNumberOfDays(month, year);
        }
        return String.format("%02d.%02d.%04d", daysRemaining, month+1, year);
    }

    private static int getFebruaryNumberOfDays(int year) {
        if(year == 1918) return 15;
        if(year > 1917 && year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            return 29;
        if(year < 1917 && year % 4 == 0)
            return 29;
        return 28;
    }

    private static int getNumberOfDays(int month, int year) {
        switch(month) {
            case 1:
                return 31;
            case 2:
                return getFebruaryNumberOfDays(year);
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            default:
                return 0;
        }
    }

}

public class DayOfTheProgrammer {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int year = Integer.parseInt(sc.nextLine());
        System.out.println(Result.dayOfProgrammer(year));
    }
}
