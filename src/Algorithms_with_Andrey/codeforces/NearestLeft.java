package Algorithms_with_Andrey.codeforces;

import java.util.Scanner;

/**
 * Given an array of n numbers, sorted non-decreasing, and k queries.
 * For each query print the maximum index of an array element not greater than the given one.
 *
 * Input data
 * The first line of the input contains numbers n and k (0<n,k≤10^5) — the length of the array and the number of queries.
 * The second line contains n elements of the array, sorted in non-descending order. The third line contains k queries.
 * All array elements and queries are integers, each of which does not exceed 2⋅10^9 in absolute value.
 *
 * Output
 * For each of k queries print the maximum index of an array element not greater than the given one. If there are none, print 0.
 */
public class NearestLeft {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        while (k > 0) {
            int x = in.nextInt();
            System.out.println(find_lower(array, x) + 1);
            k--;
        }
    }

    public static int find_lower(int[] array, int x) { // max i: a[i] <= x
        int left = -1; // a[l] <= x
        int right = array.length; // a[r] > x

        while (right > left + 1) {
            int middle = left + ((right - left) / 2);
            if (array[middle] <= x) {
                left = middle;
            } else {
                right = middle;
            }
        }
        return left;
    }

}
