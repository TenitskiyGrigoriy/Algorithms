package Algorithms_with_Andrey.dynamic_programming;

import java.util.Scanner;

/**
 * The sequence of Fibonacci numbers is defined as follows: F0 = F1 = 1,
 *
 * Fn+1 = Fn+F n-1. Write a program to calculate the last digit of the nth member of a sequence.
 *
 * Input data
 * The single line of the input contains a natural number n (1≤n≤1000).
 *
 * Output the last digit of Fn.
 */

public class TheLastDigitOfTheFibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int[] array = new int[value + 2];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = (array[i - 1] + array[i - 2]) % 10;
        }
        System.out.println(array[value + 1]);
    }
}
