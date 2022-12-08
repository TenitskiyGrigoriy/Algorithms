package Algorithms_with_Andrey.tasks_for_the_while_loop;

import java.util.Scanner;

/**
 * Given a natural number A > 1. Determine which Fibonacci number it is, that is,
 * output a number n such that φn = A. If A is not a Fibonacci number, print the number -1.
 *
 * Input data
 * A natural number is entered.
 *
 * Output data
 * Print the answer to the problem.
 */

public class TheNumberOfTheFibonacciNumber {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int a = intScanner.nextInt();
        int fibonacciValue = 0;
        int firstValue = 0;
        int secondValue = 1;
        int count = 1;

        while (a > secondValue) {
            fibonacciValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = fibonacciValue;
            count++;
        }

        if (fibonacciValue == a) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}
