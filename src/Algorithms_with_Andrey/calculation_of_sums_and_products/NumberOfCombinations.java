package Algorithms_with_Andrey.calculation_of_sums_and_products;

import java.util.Scanner;

/**
 * Using the natural n and k data, calculate the value of Ckn =n!k!(n−k)! (the number of combinations of n elements by k).
 *
 * Input data
 * 2 numbers are entered - n and k (n,k≤30).
 *
 * Output data
 * It is necessary to output the value of Ckn.
 */

public class NumberOfCombinations {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int n = intScanner.nextInt();
        int k = intScanner.nextInt();
        int c = 0;
        int denominator = 0;
        int sumN = 1;
        int sumK = 1;
        int sumDenominator = 1;
        int value = 1;

        for (int i = 0; i < n; i++) {
            sumN = sumN * value;
            value = value + 1;
        }
        value = 1;
        for (int i = 0; i < k; i++) {
            sumK = sumK * value;
            value = value + 1;
        }
        value = 1;
        denominator = n - k;
        for (int i = 0; i < denominator; i++) {
            sumDenominator = sumDenominator * value;
            value = value + 1;
        }

        c = sumN / (sumK * sumDenominator);

        System.out.println(c);
    }
}
