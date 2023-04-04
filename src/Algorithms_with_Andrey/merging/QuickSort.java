package Algorithms_with_Andrey.merging;

import java.util.Scanner;

/**
 * Sort the given array using merge sort.
 *
 * Input data
 * The first line of the input contains the number of elements in the array N, N ≤ 10^5.
 * Next comes N integers not exceeding 10^9 in absolute value.
 *
 * Output
 * Print these numbers in non-decreasing order.
 */
public class QuickSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        quickSort(array, 0, array.length - 1);
        for (int number : array) {
            System.out.print(number + " ");
        }
    }

    public static void quickSort(int[] sortArr, int low, int high) {
        if (sortArr.length == 0 && low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        int border = sortArr[middle];

        int i = low;
        int j = high;
        while (i <= j) {
            while (sortArr[i] < border) {
                i++;
            }
            while (sortArr[j] > border) {
                j--;
            }
            if (i <= j) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        //рекурсия для сортировки левой и правой части
        if (low < j) {
            quickSort(sortArr, low, j);
        }
        if (high > i) {
            quickSort(sortArr, i, high);
        }
    }
}
