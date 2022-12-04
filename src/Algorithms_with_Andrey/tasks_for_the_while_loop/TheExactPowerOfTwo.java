package Algorithms_with_Andrey.tasks_for_the_while_loop;

import java.util.Scanner;

/**
 * Given a natural number N. Print the word YES if the number N is an exact power of two, or the word NO otherwise.
 *
 * The operation of exponentiation cannot be used!
 *
 * Input data
 * A natural number is entered.
 *
 * Output data
 * Print the answer to the problem.
 */

public class TheExactPowerOfTwo {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int n = intScanner.nextInt();

        while (n != 1 && n % 2 == 0) {
            n /= 2;
        }

        System.out.println(n == 1 ? "YES" : "NO");
    }
}
