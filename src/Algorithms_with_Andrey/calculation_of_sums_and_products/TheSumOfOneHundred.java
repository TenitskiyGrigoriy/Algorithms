package Algorithms_with_Andrey.calculation_of_sums_and_products;

import java.util.Scanner;

/**
 * Calculate the sum of the given 100 natural numbers.
 *
 * Input data
 * 100 numbers are entered, the sum of which must be calculated.
 *
 * Output data
 * The program should output a single number - the amount received.
 */

public class TheSumOfOneHundred {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            int a = intScanner.nextInt();
            sum = sum + a;
        }
        System.out.println(sum);

    }
}
