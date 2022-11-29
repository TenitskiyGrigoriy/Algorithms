package Algorithms_with_Andrey.calculation_of_sums_and_products;

import java.util.Scanner;

/**
 *
 * Calculate N! ("en-factorial") is the product of all natural numbers from 1 to N (N!=1∙2∙3∙...∙ N ).
 *
 * Input data
 * The singular number N is entered – natural, does not exceed 12.
 */

public class Factorial {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int n = intScanner.nextInt();
        int sumN = 1;
        int value = 1;

        for (int i = 0; i < n; i++) {
            sumN = sumN * value;
            value = value + 1;
        }

        System.out.println(sumN);
    }
}
