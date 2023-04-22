package Algorithms_with_Andrey.codeforces;

import java.util.Scanner;

/**
 * This morning the jury decided to add one more Very Easy Problem to the Olympiad version.
 * The executive secretary of the Organizing Committee printed its condition in one copy, and now he needs to make n more copies before the start of the Olympiad.
 * He has two copiers at his disposal, one of which copies a sheet in x seconds, and the other in y.
 * (It is allowed to use one copier or both at the same time. You can copy not only from the original, but also from a copy.)
 * Help him find out what is the minimum time required to make n copies of the problem statement.
 *
 * Input data
 * The input of the program is three natural numbers n, x and y separated by a space (1≤n≤2⋅10^8, 1≤x,y≤10).
 *
 * Output
 * Print a single number — the minimum time in seconds needed to make n copies.
 */
public class VeryEasyTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();

        long left = 0;
        long right = (long) n * Math.max(x, y);
        n--;

        while (left < right) {
            long middle = (right + left) / 2;
            if ((middle / x + middle / y) < n) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        System.out.println(right + Math.min(x, y));
    }
}
