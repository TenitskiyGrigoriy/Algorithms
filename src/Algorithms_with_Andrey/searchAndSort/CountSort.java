package Algorithms_with_Andrey.searchAndSort;

import java.util.Scanner;

/**
 * Implement a counting sort algorithm for arbitrary numbers with modulo less than 10000.
 *
 * Input data
 * The program is first given the value n ≤ 100000, which is the number of elements in the array.
 * The next line of the input contains the array elements themselves - integers, modulo not exceeding 10000.
 *
 * Output
 * Print the array sorted non-decreasing.
 *
 * Note
 *
 * The complexity of the program should be O(n). The use of built-in sorting (sort, sorted),
 * sorting algorithms bubble / quick sort / merge sort and others is prohibited!
 */
public class CountSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        int[] count = new int[max - min + 1];

        for (int element : array) {
            count[element - min]++;
        }

        int arrayIndex = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = count[i]; j > 0; j--) {
                array[arrayIndex++] = i + min;
            }
        }

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
