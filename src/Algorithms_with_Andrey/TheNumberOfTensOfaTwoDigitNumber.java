package Algorithms_with_Andrey;

import java.util.Scanner;

/**
 * A two-digit number is given. Find the number of tens in it.
 *
 * Input data
 * A two-digit number is entered.
 *
 * Output data
 * Print the answer to the problem.
 */

public class TheNumberOfTensOfaTwoDigitNumber {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int startValue = intScanner.nextInt();

        int endValue = startValue / 10;

        System.out.println(endValue);
    }
}
