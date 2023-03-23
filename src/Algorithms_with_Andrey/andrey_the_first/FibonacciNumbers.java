package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * The Fibonacci sequence is defined as follows: φ0=1, φ1=1, φn=φn-1+φn-2 for n>1.
 * The beginning of the Fibonacci series looks like this: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
 * Write a function that returns φn for a given positive integer n.
 *
 * Input data
 * One number n is entered.
 *
 * Output
 * It is necessary to display the value of φn.
 */
public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
