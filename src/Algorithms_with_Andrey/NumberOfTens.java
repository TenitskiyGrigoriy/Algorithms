package Algorithms_with_Andrey;

import java.util.Scanner;

/**
 * Given a non-negative integer. Find the number of tens in its decimal notation (that is, the second digit from the right of its decimal notation).
 *
 * Input data
 * A non-negative integer is entered.
 *
 * Output data
 * Print the answer to the problem.
 */

public class NumberOfTens {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int startValue = intScanner.nextInt();

        int middleValue = startValue / 10;
        int endValue = middleValue % 10;

        System.out.println(endValue);
    }
}
