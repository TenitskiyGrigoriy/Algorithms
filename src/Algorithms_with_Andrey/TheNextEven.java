package Algorithms_with_Andrey;

import java.util.Scanner;

/**
 * Given an integer n. Print the next even number after it. When solving this problem, you cannot use a conditional if statement and loops.
 *
 * Note. The task cannot be submitted in Pascal until March 01, 2019.
 * Input data
 * A natural number is entered.
 *
 * Output data
 * Print the answer to the problem.
 */

public class TheNextEven {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int startValue= intScanner.nextInt();

        int theRemainderOfTheDivision = startValue % 2;
        int endValue = startValue + 2 - theRemainderOfTheDivision;

        System.out.println(endValue);
    }
}
