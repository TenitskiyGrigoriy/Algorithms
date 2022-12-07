package Algorithms_with_Andrey.tasks_for_the_while_loop;

import java.util.Scanner;

/**
 * The Fibonacci sequence is defined as:
 *
 * φ0=0, φ1=1, ..., φn=φn-1+φn-2.
 *
 * For this number n, determine the nth Fibonacci number φn.
 *
 * Input data
 * The natural number n is entered.
 *
 * Output data
 * Print the answer to the problem.
 */

public class FibonacciNumbers {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int n = intScanner.nextInt();
        int fibonacciValue;
        int firstValue = 0;
        int secondValue = 1;

        while (n > 1) {
            fibonacciValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = fibonacciValue;
            n--;
        }

        System.out.println(secondValue);
    }
}
