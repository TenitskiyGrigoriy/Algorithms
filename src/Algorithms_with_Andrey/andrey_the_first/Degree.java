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
        System.out.println(a + " " + n);
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            double temp = power(a, n / 2);
            return temp * temp;
        }
        return power(a, n - 1) * a;
    }
}
