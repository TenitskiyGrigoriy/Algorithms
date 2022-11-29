package Algorithms_with_Andrey.conditional_operator;

import java.util.Scanner;

/**
 * Given a natural number. Print its last digit.
 *
 * Input data
 * A natural number is entered.
 *
 * Output data
 * Print the answer to the problem.
 */

public class TheLastDigit {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int startValue = intScanner.nextInt();

        int endValue = startValue % 10;

        System.out.println(endValue);
    }
}
