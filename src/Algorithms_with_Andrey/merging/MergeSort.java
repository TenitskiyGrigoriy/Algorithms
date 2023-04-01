package Algorithms_with_Andrey.merging;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Sort the given array using merge sort.
 *
 * Input data
 * The first line of the input contains the number of elements in the array N, N ≤ 105.
 * Next comes N integers not exceeding 109 in absolute value.
 *
 * Output
 * Print these numbers in non-decreasing order.
 */
public class MergeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        int[] result = mergeSort(array);
        for (int number : result) {
            System.out.print(number + " ");
        }
    }

    public static int[] mergeSort(int[] src) {
        if(src.length <= 1) {
            return src;
        }
        int[] left = Arrays.copyOfRange(src, 0, src.length / 2);
        int[] right = Arrays.copyOfRange(src, left.length, src.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int leftIn = 0;
        int rightIn = 0;
        int[] result = new int[left.length + right.length];

        while (leftIn < left.length && rightIn < right.length) {
            if (left[leftIn] <= right[rightIn]) {
                result[rightIn + leftIn] = left[leftIn];
                leftIn++;
            } else {
                result[rightIn + leftIn] = right[rightIn];
                rightIn++;
            }
        }

        while (leftIn < left.length) {
            result[rightIn + leftIn] = left[leftIn];
            leftIn++;
        }
        while (rightIn < right.length) {
            result[rightIn + leftIn] = right[rightIn];
            rightIn++;
        }
        return result;
    }
}
