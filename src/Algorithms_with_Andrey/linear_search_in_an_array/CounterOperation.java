package Algorithms_with_Andrey.linear_search_in_an_array;

import java.util.Scanner;

/**
 * Hacker Vasily got access to a cool magazine and wants to replace all his minimum grades with maximum ones.
 * Write a program that replaces Vasily's grades, but vice versa (all the maximum ones are replaced by the minimum ones).
 *
 * Input data
 * The number of Vasily's ratings is given (no more than 100), then the ratings themselves.
 *
 * Output
 * You want to print the corrected scores in the same order.
 */
public class CounterOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (array[i] == max) {
                array[i] = min;
            }
            System.out.print(array[i] + " ");
        }
    }
}
