package Algorithms_with_Andrey.calculation_of_sums_and_products;

import java.util.Scanner;

/**
 * Input data
 * A natural number N is introduced, which does not exceed 30.
 *
 * Output data
 * Calculate 1+2+22+23+...+2 N.
 */

public class SumOfDegrees {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int n = intScanner.nextInt();
        long sumN = 1;

        for (int i = 1; i <= n; i++) {
            sumN = (long) (sumN + Math.pow(2, i));
        }

        System.out.println(sumN);
    }
}
