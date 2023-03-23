package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Two rational fractions are given: a/b and c/d. Add them up and express the result as an irreducible fraction m/n.
 *
 * Input data
 * The program receives as input 4 natural numbers a, b, c, d, not exceeding 100.
 *
 * Output
 * The program should output 2 natural numbers m and n such that m/n=a/b+c/d and the fraction m/n is irreducible.
 */
public class AddTwoFractions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int numerator = a * d + c * b;
        int denominator = b * d;
        int val = gcd(numerator, denominator);
        System.out.println(numerator/val + " " + denominator/val);

    }

    private static int gcd(int n, int m) {
        if(m == 0) {
            return n;
        }
        return gcd(m, n % m);
    }
}
