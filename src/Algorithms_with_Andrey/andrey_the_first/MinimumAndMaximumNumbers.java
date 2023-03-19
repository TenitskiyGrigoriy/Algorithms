package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Input data
 * Given a single number N
 *
 * Output
 * It is necessary to output the smallest and largest digits of the given number separated by a space.
 */

public class MinimumAndMaximumNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int div;
        int minN = 10;
        int maxN = 0;

        while (n != 0) {
            div = n % 10;
            if (div >= maxN) {
                maxN = div;
            }
            if (div < minN) {
                minN = div;
            }
            n = n / 10;
        }
        System.out.println(minN + " " + maxN);
    }
}
