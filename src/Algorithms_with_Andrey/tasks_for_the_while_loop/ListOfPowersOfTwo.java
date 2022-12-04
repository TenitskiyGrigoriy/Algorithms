package Algorithms_with_Andrey.tasks_for_the_while_loop;

import java.util.Scanner;

/**
 * For a given number N, print out all integer powers of two not exceeding N in ascending order.
 *
 * The operation of exponentiation cannot be used!
 *
 * Input data
 * A natural number is entered.
 *
 * Output data
 * Print the answer to the problem.
 */

public class ListOfPowersOfTwo {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int n = intScanner.nextInt();

        for (int i = 1; i <= n;) {
            if (i <= n) {
                System.out.print(i + " ");
            }
            i = i * 2;
        }

    }
}
