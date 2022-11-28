package Algorithms_with_Andrey;

import java.util.Scanner;

/**
 * In mathematics, the function sign(x) (the sign of a number) is defined as:
 * sign(x) = 1 if x > 0,
 * sign(x) = -1 if x < 0,
 * sign(x) = 0 if x = 0.
 *
 * For a given number x, output the value sign(x).
 * Input data
 * The number x is entered.
 *
 * Output data
 * Print the answer to the problem.
 */

public class NumberSign {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int value = intScanner.nextInt();

        if (value > 0) {
            System.out.println(1);
        } else if (value < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }
}
