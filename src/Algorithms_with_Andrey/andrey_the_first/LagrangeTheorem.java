package Algorithms_with_Andrey.andrey_the_first;

import java.util.Scanner;

/**
 * Lagrange's theorem states that any natural number can be represented as the sum of four perfect squares.
 * For a given number n, find the following representation:
 * print from 1 to 4 natural numbers whose squares add up to the given number.
 *
 * Input data
 * The program receives as input one natural number n < 10000.
 *
 * Output
 * The program should print from 1 to 4 natural numbers, the squares of which add up to the given number.
 */
public class LagrangeTheorem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int i;
        int j;
        int k;
        int l;

        for (i = 0; i * i <= n; i++) {
            for (j = i; j * j <= n - i * i ; j++) {
                for (k = j; k * k <= n - i * i - j * j; k++) {
                    l = (int) Math.sqrt(n - i * i - j * j - k * k);
                    if (i * i + j * j + k * k + l * l == n) {
                        System.out.println(i + " " + j + " " + k + " " + l);
                        return;
                    }
                }
            }
        }

        // List
        // sout(List);
    }
}
