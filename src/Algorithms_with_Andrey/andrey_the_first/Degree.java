package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Input data
 * 2 numbers are entered - a (real) and n (non-negative integer).
 *
 * Output
 * You need to print the value of an.
 */

public class Degree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        int n = in.nextInt();

        System.out.println(power(a, n));

    }

    private static double power(double a, int n){
        double value = 1;
        for (int i = 0; i < n; i++) {
            value = value * a;
        }
        return value;
    }
}
