package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Two numbers are given. Find their greatest common divisor.
 *
 * Input data
 * Two natural numbers not exceeding 10^9 are entered.
 *
 * Output the GCD of the entered numbers.
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(gcd(a, b));
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
