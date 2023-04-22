package Algorithms_with_Andrey.codeforces;

import java.util.Scanner;

/**
 * There are n strings, you need to cut them into k pieces of the same length. Find the maximum length of pieces that can be obtained.
 *
 * Input data
 * The first line contains two numbers — n and k (1≤n,k≤10000).
 * Then each of the next n lines contains one number — the length of the next string ai (1≤ai≤10^7).
 *
 * Output
 * Print one real number — the maximum length of pieces that can be obtained.
 * The answer will be considered correct if the relative or absolute error does not exceed 10^−6.
 */
public class Ropes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        double left = 0;
        double right = 100000000;

        for (int i = 0; i < 100; i++) {
            double middle = (left + right) * 0.5;
            int s = 0;
            for (int j = 0; j < n; j++) {
                s += (int) (array[j] / middle);
            }
            if (s >= k) {
                left = middle;
            } else {
                right = middle;
            }
        }

        System.out.println(left);
    }
}
