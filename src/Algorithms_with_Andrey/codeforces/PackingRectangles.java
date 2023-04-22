package Algorithms_with_Andrey.codeforces;

import java.util.Scanner;

/**
 * There are n rectangles of the same size: w wide and h long.
 * It is required to find a square of the minimum size in which these rectangles can be packed.
 * Rectangles cannot be rotated.
 *
 *
 * Input data
 * The input contains three integers: w, h, n (1≤w,h,n≤109).
 *
 * Output
 * Print the minimum length of a side of a square that can pack the given rectangles.
 */
public class PackingRectangles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        int n = in.nextInt();

        long left = 0;
        long right = 1;
        while (!good(w, h, n, right)) {
            right *= 2;
        }

        while (right > left + 1) {
            long middle = (left + right) / 2;
            if (good(w, h, n, middle)) {
                right = middle;
            } else {
                left = middle;
            }
        }
        System.out.println(right);
    }

    public static boolean good(long w, long h, long n, long m) {
        return (m / w) * (m / h) >= n;
    }
}
