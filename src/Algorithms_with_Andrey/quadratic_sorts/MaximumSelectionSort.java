package Algorithms_with_Andrey.quadratic_sorts;

import java.util.Scanner;

/**
 * It is required to sort the array in non-descending order using the "select maximum" method.
 *
 * Input data
 * The first line contains one natural number not exceeding 1000 - the size of the array.
 * The second line contains N numbers - array elements (integer numbers not exceeding 1000 in modulo).
 *
 * Output the resulting array.
 */
public class MaximumSelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int maxIndex;

        for (int i = n - 1; i > 0; i--) {
            maxIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
