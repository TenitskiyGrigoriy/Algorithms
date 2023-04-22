package Algorithms_with_Andrey.codeforces;

import java.util.Scanner;

public class NearestRight {
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
            if (array[middle] < x) {
                left = middle;
            } else {
                right = middle;
            }
        }
        return right;
    }
}
