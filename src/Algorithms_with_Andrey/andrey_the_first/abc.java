package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Three real numbers are given: a, b, c. Check if the equality a + b = c is true. If the equality is true, print YES, if not, print NO.
 *
 * Input data
 * The numbers a, b, c are real, positive, do not exceed 10 and are given with no more than 7 digits after the dot.
 *
 * Output the result of the comparison.
 */

public class abc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double eps = 0.0000001;
        if (Math.abs(a + b - c) < eps) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
