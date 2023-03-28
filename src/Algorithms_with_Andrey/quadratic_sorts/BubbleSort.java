package Algorithms_with_Andrey.quadratic_sorts;

import java.util.Scanner;

/**
 * Determine how many exchanges the ascending bubble sort algorithm will make for the given array.
 *
 * Input data
 * The first line contains a number N (1 ≤ N ≤ 1000) – the number of elements in the array.
 * The second line is the array itself. It is guaranteed that all array elements are distinct and do not exceed 109 in modulo.
 *
 * Output
 * Print a single number, the number of bubble sort exchanges.
 */
public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int counter = 0;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    counter++;
                    isSorted = false;
                }
            }
        }
        System.out.println(counter);
    }
}
