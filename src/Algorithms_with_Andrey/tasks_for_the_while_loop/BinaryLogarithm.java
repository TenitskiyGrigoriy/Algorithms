package Algorithms_with_Andrey.tasks_for_the_while_loop;

import java.util.Scanner;

/**
 * For a given natural number N, output the smallest integer k such that 2k≥N.
 *
 * The operation of exponentiation cannot be used!
 *
 * Input data
 * The natural number N is entered .
 *
 * Output data
 * Print the answer to the problem.
 */

public class BinaryLogarithm {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int n = intScanner.nextInt();
        int k = 0;
        int value = 1;

        while (n > value) {
            value = 2 * value;
            k++;
        }

        System.out.println(k);
    }
}
