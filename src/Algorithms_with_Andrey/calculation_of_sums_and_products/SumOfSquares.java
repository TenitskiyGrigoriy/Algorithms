package Algorithms_with_Andrey.calculation_of_sums_and_products;

import java.util.Scanner;

/**
 *
 * For this natural n, calculate the sum of 12+22+ ...+n2.
 *
 * Input data
 * A single natural number n, not exceeding 100, is introduced
 *
 * Output data
 * It is necessary to withdraw the calculated amount.
 */

public class SumOfSquares {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int n = intScanner.nextInt();
        int sumN = 0;
        int value = n;

        for (int i = 0; i < n; i++) {
            sumN = sumN + value * value;
            value = value - 1;
        }

        System.out.println(sumN);
    }
}
