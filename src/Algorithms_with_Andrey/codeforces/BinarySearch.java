package Algorithms_with_Andrey.codeforces;

import java.util.Scanner;

/**
 * Input data
 * The first line of the input contains natural numbers n and k (1≤n, k≤10^5) — the length of the array and the number of queries.
 * The second line contains n elements of the array, sorted in non-descending order. The third line contains k queries.
 * All array elements and queries are integers, each of which does not exceed 10^9 in absolute value.
 *
 * Output
 * It is required for each of k queries to output YES in a separate line if this number occurs in the array, and NO otherwise.
 */
public class BinarySearch {
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
            if (binarySearch(array, x)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            k--;
        }
    }

    public static boolean binarySearch(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + ((right - left) / 2);
            if (array[middle] == x) {
                return true;
            } else if (array[middle] < x) {
                left = middle + 1;
            } else if (array[middle] > x) {
                right = middle - 1;
            }
        }
        return false;
    }
}
