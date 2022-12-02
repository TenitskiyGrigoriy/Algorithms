package Algorithms_with_Andrey.calculation_of_sums_and_products;

import java.util.Scanner;

/**
 * Input data
 * The natural number x is entered.
 *
 * Output data
 * Print the smallest divisor of the number x other than 1
 */

public class MinimumDivisor {
    public static void main(String[] args) {

        Scanner intScanner = new Scanner(System.in);
        int x = intScanner.nextInt();

        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
                break;
            }
        }

    }
}
