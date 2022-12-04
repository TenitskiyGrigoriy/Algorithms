package Algorithms_with_Andrey.tasks_for_the_while_loop;

import java.util.Scanner;

/**
 * An integer not less than 2 is given. Output its smallest natural divisor other than 1.
 *
 * Input data
 * A natural number is entered.
 *
 * Output data
 * Print the answer to the problem.
 */

public class MinimumDivisor {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int n = intScanner.nextInt();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                break;
            }
        }

    }
}
